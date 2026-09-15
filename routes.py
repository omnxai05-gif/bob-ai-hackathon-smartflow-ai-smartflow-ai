from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session, joinedload
from typing import List
from app.database import get_db
from app.models import Route
from app.schemas import RouteDTO

router = APIRouter(prefix="/api/routes", tags=["Routes"])

@router.get("", response_model=List[RouteDTO])
def get_all_routes(db: Session = Depends(get_db)):
    routes = db.query(Route).options(
        joinedload(Route.origin_port),
        joinedload(Route.destination_port)
    ).all()

    return [
        RouteDTO(
            id=r.id,
            name=r.name,
            originPortId=r.origin_port.id if r.origin_port else None,
            originPortName=r.origin_port.name if r.origin_port else None,
            destinationPortId=r.destination_port.id if r.destination_port else None,
            destinationPortName=r.destination_port.name if r.destination_port else None,
            mode=r.mode,
            distanceKm=r.distance_km,
            transitDays=r.transit_days,
            costUsd=r.cost_usd,
            reliabilityScore=r.reliability_score,
            active=bool(r.active)
        )
        for r in routes
    ]
