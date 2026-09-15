from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session
from sqlalchemy import func
from app.database import get_db
from app.models import Shipment, Disruption, Vehicle
from app.schemas import DashboardSummaryDTO

router = APIRouter(prefix="/api/dashboard", tags=["Dashboard"])

@router.get("/summary", response_model=DashboardSummaryDTO)
def get_dashboard_summary(db: Session = Depends(get_db)):
    total_shipments = db.query(func.count(Shipment.id)).scalar() or 0
    at_risk_shipments = db.query(func.count(Shipment.id)).filter(Shipment.status == "AT_RISK").scalar() or 0
    delayed_shipments = db.query(func.count(Shipment.id)).filter(Shipment.status == "DELAYED").scalar() or 0
    active_disruptions = db.query(func.count(Disruption.id)).filter(Disruption.active == True).scalar() or 0
    cold_chain_shipments = db.query(func.count(Shipment.id)).filter(Shipment.cold_chain_required == True).scalar() or 0
    available_vehicles = db.query(func.count(Vehicle.id)).filter(Vehicle.status == "AVAILABLE").scalar() or 0
    in_use_vehicles = db.query(func.count(Vehicle.id)).filter(Vehicle.status == "IN_USE").scalar() or 0

    return DashboardSummaryDTO(
        totalShipments=total_shipments,
        atRiskShipments=at_risk_shipments,
        delayedShipments=delayed_shipments,
        activeDisruptions=active_disruptions,
        coldChainShipments=cold_chain_shipments,
        availableVehicles=available_vehicles,
        inUseVehicles=in_use_vehicles
    )
