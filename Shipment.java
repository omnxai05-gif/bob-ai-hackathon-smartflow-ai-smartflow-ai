package com.smartflow.model;

import com.smartflow.model.enums.CargoType;
import com.smartflow.model.enums.ShipmentStatus;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "shipments")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 20)
    private String reference;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "origin_port_id", nullable = false)
    private Port originPort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "destination_port_id", nullable = false)
    private Port destinationPort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_vehicle_id")
    private Vehicle assignedVehicle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_route_id")
    private Route assignedRoute;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ShipmentStatus status = ShipmentStatus.PENDING;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CargoType cargoType = CargoType.GENERAL;

    private Double weightKg;
    private Double valueUsd;
    private String carrier;
    private LocalDateTime departureAt;
    private LocalDateTime estimatedArrivalAt;
    private LocalDateTime revisedArrivalAt;

    @Column(nullable = false)
    private Boolean coldChainRequired = false;

    private Double tempMinC;
    private Double tempMaxC;

    @Column(nullable = false)
    private Integer riskScore = 0;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public Shipment() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }

    public Port getOriginPort() { return originPort; }
    public void setOriginPort(Port originPort) { this.originPort = originPort; }

    public Port getDestinationPort() { return destinationPort; }
    public void setDestinationPort(Port destinationPort) { this.destinationPort = destinationPort; }

    public Vehicle getAssignedVehicle() { return assignedVehicle; }
    public void setAssignedVehicle(Vehicle assignedVehicle) { this.assignedVehicle = assignedVehicle; }

    public Route getAssignedRoute() { return assignedRoute; }
    public void setAssignedRoute(Route assignedRoute) { this.assignedRoute = assignedRoute; }

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
