from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session, joinedload
from typing import List
from app.database import get_db
from app.models import Vehicle
from app.schemas import VehicleDTO

router = APIRouter(prefix="/api/vehicles", tags=["Vehicles"])

@router.get("", response_model=List[VehicleDTO])
def get_all_vehicles(db: Session = Depends(get_db)):
    vehicles = db.query(Vehicle).options(joinedload(Vehicle.home_port)).all()
    return [
        VehicleDTO(
            id=v.id,
            name=v.name,
            registrationNumber=v.registration_number,
            type=v.type,
            capacityKg=v.capacity_kg,
            refrigerated=bool(v.refrigerated),
            status=v.status,
            currentLatitude=v.current_latitude,
            currentLongitude=v.current_longitude,
            homePortId=v.home_port.id if v.home_port else None,
            homePortName=v.home_port.name if v.home_port else None,
            utilisationPct=v.utilisation_pct
        )
        for v in vehicles
    ]
