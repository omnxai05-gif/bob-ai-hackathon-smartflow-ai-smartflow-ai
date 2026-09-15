from fastapi import APIRouter, Depends, Query
from sqlalchemy.orm import Session, joinedload
from typing import List, Optional
from app.database import get_db
from app.models import TemperatureReading
from app.schemas import TemperatureReadingDTO

router = APIRouter(prefix="/api/temperature-readings", tags=["Temperature Readings"])

def map_reading(tr: TemperatureReading) -> TemperatureReadingDTO:
    return TemperatureReadingDTO(
        id=tr.id,
        shipmentId=tr.shipment_id,
        shipmentReference=tr.shipment.reference if tr.shipment else None,
        vehicleId=tr.vehicle_id,
        vehicleName=tr.vehicle.name if tr.vehicle else None,
        tempC=tr.tempc,
        humidityPct=tr.humidity_pct,
        latitude=tr.latitude,
        longitude=tr.longitude,
        recordedAt=tr.recorded_at,
        excursion=bool(tr.excursion),
        excursionSeverity=tr.excursion_severity
    )

@router.get("", response_model=List[TemperatureReadingDTO])
def get_temperature_readings(
    shipmentId: int = Query(..., description="Shipment ID to fetch readings for"),
    excursionsOnly: Optional[bool] = Query(False, description="Filter only excursion readings"),
    db: Session = Depends(get_db)
):
    query = db.query(TemperatureReading).options(
        joinedload(TemperatureReading.shipment),
        joinedload(TemperatureReading.vehicle)
    ).filter(TemperatureReading.shipment_id == shipmentId)

    if excursionsOnly:
        query = query.filter(TemperatureReading.excursion == True)

    readings = query.order_by(TemperatureReading.recorded_at.asc()).all()
    return [map_reading(tr) for tr in readings]
