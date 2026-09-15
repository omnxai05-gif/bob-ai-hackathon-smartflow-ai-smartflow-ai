package com.smartflow.dto;

public class DashboardSummaryDTO {
    private long totalShipments;
    private long atRiskShipments;
    private long delayedShipments;
    private long activeDisruptions;
    private long coldChainShipments;
    private long availableVehicles;
    private long inUseVehicles;

    public DashboardSummaryDTO() {}

    public DashboardSummaryDTO(long totalShipments, long atRiskShipments, long delayedShipments,
                                long activeDisruptions, long coldChainShipments,
                                long availableVehicles, long inUseVehicles) {
        this.totalShipments = totalShipments;
        this.atRiskShipments = atRiskShipments;
        this.delayedShipments = delayedShipments;
        this.activeDisruptions = activeDisruptions;
        this.coldChainShipments = coldChainShipments;
        this.availableVehicles = availableVehicles;
        this.inUseVehicles = inUseVehicles;
    }

    public long getTotalShipments() { return totalShipments; }
    public void setTotalShipments(long totalShipments) { this.totalShipments = totalShipments; }
    public long getAtRiskShipments() { return atRiskShipments; }
    public void setAtRiskShipments(long atRiskShipments) { this.atRiskShipments = atRiskShipments; }
    public long getDelayedShipments() { return delayedShipments; }
    public void setDelayedShipments(long delayedShipments) { this.delayedShipments = delayedShipments; }
    public long getActiveDisruptions() { return activeDisruptions; }
    public void setActiveDisruptions(long activeDisruptions) { this.activeDisruptions = activeDisruptions; }
    public long getColdChainShipments() { return coldChainShipments; }
    public void setColdChainShipments(long coldChainShipments) { this.coldChainShipments = coldChainShipments; }
    public long getAvailableVehicles() { return availableVehicles; }
    public void setAvailableVehicles(long availableVehicles) { this.availableVehicles = availableVehicles; }
    public long getInUseVehicles() { return inUseVehicles; }
    public void setInUseVehicles(long inUseVehicles) { this.inUseVehicles = inUseVehicles; }
}
