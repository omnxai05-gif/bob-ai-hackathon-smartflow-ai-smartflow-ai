package com.smartflow.dto;

import com.smartflow.model.enums.CargoType;
import com.smartflow.model.enums.ShipmentStatus;
import java.time.LocalDateTime;

public class ShipmentDTO {
    private Long id;
    private String reference;
    private Long originPortId;
    private String originPortName;
    private String originPortCode;
    private Long destinationPortId;
    private String destinationPortName;
    private String destinationPortCode;
    private Long assignedVehicleId;
    private String assignedVehicleName;
    private Long assignedRouteId;
    private String assignedRouteName;
    private ShipmentStatus status;
    private CargoType cargoType;
    private Double weightKg;
    private Double valueUsd;
    private String carrier;
    private LocalDateTime departureAt;
    private LocalDateTime estimatedArrivalAt;
    private LocalDateTime revisedArrivalAt;
    private Boolean coldChainRequired;
    private Double tempMinC;
    private Double tempMaxC;
    private Integer riskScore;
    private LocalDateTime createdAt;

    public ShipmentDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }
    public Long getOriginPortId() { return originPortId; }
    public void setOriginPortId(Long originPortId) { this.originPortId = originPortId; }
    public String getOriginPortName() { return originPortName; }
    public void setOriginPortName(String originPortName) { this.originPortName = originPortName; }
    public String getOriginPortCode() { return originPortCode; }
    public void setOriginPortCode(String originPortCode) { this.originPortCode = originPortCode; }
    public Long getDestinationPortId() { return destinationPortId; }
    public void setDestinationPortId(Long destinationPortId) { this.destinationPortId = destinationPortId; }
    public String getDestinationPortName() { return destinationPortName; }
    public void setDestinationPortName(String destinationPortName) { this.destinationPortName = destinationPortName; }
    public String getDestinationPortCode() { return destinationPortCode; }
    public void setDestinationPortCode(String destinationPortCode) { this.destinationPortCode = destinationPortCode; }
    public Long getAssignedVehicleId() { return assignedVehicleId; }
    public void setAssignedVehicleId(Long assignedVehicleId) { this.assignedVehicleId = assignedVehicleId; }
    public String getAssignedVehicleName() { return assignedVehicleName; }
    public void setAssignedVehicleName(String assignedVehicleName) { this.assignedVehicleName = assignedVehicleName; }
    public Long getAssignedRouteId() { return assignedRouteId; }
    public void setAssignedRouteId(Long assignedRouteId) { this.assignedRouteId = assignedRouteId; }
    public String getAssignedRouteName() { return assignedRouteName; }
    public void setAssignedRouteName(String assignedRouteName) { this.assignedRouteName = assignedRouteName; }
    public ShipmentStatus getStatus() { return status; }
    public void setStatus(ShipmentStatus status) { this.status = status; }
    public CargoType getCargoType() { return cargoType; }
    public void setCargoType(CargoType cargoType) { this.cargoType = cargoType; }
    public Double getWeightKg() { return weightKg; }
    public void setWeightKg(Double weightKg) { this.weightKg = weightKg; }
    public Double getValueUsd() { return valueUsd; }
    public void setValueUsd(Double valueUsd) { this.valueUsd = valueUsd; }
    public String getCarrier() { return carrier; }
    public void setCarrier(String carrier) { this.carrier = carrier; }
    public LocalDateTime getDepartureAt() { return departureAt; }
    public void setDepartureAt(LocalDateTime departureAt) { this.departureAt = departureAt; }
    public LocalDateTime getEstimatedArrivalAt() { return estimatedArrivalAt; }
    public void setEstimatedArrivalAt(LocalDateTime estimatedArrivalAt) { this.estimatedArrivalAt = estimatedArrivalAt; }
    public LocalDateTime getRevisedArrivalAt() { return revisedArrivalAt; }
    public void setRevisedArrivalAt(LocalDateTime revisedArrivalAt) { this.revisedArrivalAt = revisedArrivalAt; }
    public Boolean getColdChainRequired() { return coldChainRequired; }
    public void setColdChainRequired(Boolean coldChainRequired) { this.coldChainRequired = coldChainRequired; }
    public Double getTempMinC() { return tempMinC; }
    public void setTempMinC(Double tempMinC) { this.tempMinC = tempMinC; }
    public Double getTempMaxC() { return tempMaxC; }
    public void setTempMaxC(Double tempMaxC) { this.tempMaxC = tempMaxC; }
    public Integer getRiskScore() { return riskScore; }
    public void setRiskScore(Integer riskScore) { this.riskScore = riskScore; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
