from fastapi import APIRouter, Depends, Query
from sqlalchemy.orm import Session, joinedload
from typing import List, Optional
from app.database import get_db
from app.models import Shipment
from app.schemas import ShipmentDTO

router = APIRouter(prefix="/api/shipments", tags=["Shipments"])

def map_shipment(s: Shipment) -> ShipmentDTO:
    return ShipmentDTO(
        id=s.id,
        reference=s.reference,
        originPortId=s.origin_port.id if s.origin_port else None,
        originPortName=s.origin_port.name if s.origin_port else None,
        originPortCode=s.origin_port.code if s.origin_port else None,
        destinationPortId=s.destination_port.id if s.destination_port else None,
        destinationPortName=s.destination_port.name if s.destination_port else None,
        destinationPortCode=s.destination_port.code if s.destination_port else None,
        assignedVehicleId=s.assigned_vehicle.id if s.assigned_vehicle else None,
        assignedVehicleName=s.assigned_vehicle.name if s.assigned_vehicle else None,
        assignedRouteId=s.assigned_route.id if s.assigned_route else None,
        assignedRouteName=s.assigned_route.name if s.assigned_route else None,
        status=s.status,
        cargoType=s.cargo_type,
        weightKg=s.weight_kg,
        valueUsd=s.value_usd,
        carrier=s.carrier,
        departureAt=s.departure_at,
        estimatedArrivalAt=s.estimated_arrival_at,
        revisedArrivalAt=s.revised_arrival_at,
        coldChainRequired=bool(s.cold_chain_required),
        tempMinC=s.temp_minc,
        tempMaxC=s.temp_maxc,
        riskScore=s.risk_score,
        createdAt=s.created_at
    )

@router.get("", response_model=List[ShipmentDTO])
def get_shipments(
    status: Optional[str] = Query(None, description="Optional shipment status filter, e.g. AT_RISK"),
    db: Session = Depends(get_db)
):
    query = db.query(Shipment).options(
        joinedload(Shipment.origin_port),
        joinedload(Shipment.destination_port),
        joinedload(Shipment.assigned_vehicle),
        joinedload(Shipment.assigned_route)
    )
    if status:
        query = query.filter(Shipment.status == status.upper())
    
    shipments = query.all()
    return [map_shipment(s) for s in shipments]
