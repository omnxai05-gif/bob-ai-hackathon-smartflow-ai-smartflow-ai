from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session
from typing import List
from app.database import get_db
from app.models import Port
from app.schemas import PortDTO

router = APIRouter(prefix="/api/ports", tags=["Ports"])

@router.get("", response_model=List[PortDTO])
def get_all_ports(db: Session = Depends(get_db)):
    ports = db.query(Port).all()
    return [
        PortDTO(
            id=p.id,
            code=p.code,
            name=p.name,
            city=p.city,
            country=p.country,
            latitude=p.latitude,
            longitude=p.longitude,
            type=p.type
        )
        for p in ports
    ]
