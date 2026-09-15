from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session, joinedload
from typing import List
from app.database import get_db
from app.models import Disruption
from app.schemas import DisruptionDTO

router = APIRouter(prefix="/api/disruptions", tags=["Disruptions"])

def map_disruption(d: Disruption) -> DisruptionDTO:
    return DisruptionDTO(
        id=d.id,
        title=d.title,
        description=d.description,
        type=d.type,
        severity=d.severity,
        affectedPortId=d.affected_port.id if d.affected_port else None,
        affectedPortName=d.affected_port.name if d.affected_port else None,
        affectedPortCode=d.affected_port.code if d.affected_port else None,
        latitude=d.latitude,
        longitude=d.longitude,
        startedAt=d.started_at,
        estimatedEndAt=d.estimated_end_at,
        resolvedAt=d.resolved_at,
        active=bool(d.active)
    )

@router.get("", response_model=List[DisruptionDTO])
def get_all_disruptions(db: Session = Depends(get_db)):
    disruptions = db.query(Disruption).options(joinedload(Disruption.affected_port)).all()
    return [map_disruption(d) for d in disruptions]

@router.get("/active", response_model=List[DisruptionDTO])
def get_active_disruptions(db: Session = Depends(get_db)):
    disruptions = db.query(Disruption).options(joinedload(Disruption.affected_port)).filter(Disruption.active == True).all()
    return [map_disruption(d) for d in disruptions]
