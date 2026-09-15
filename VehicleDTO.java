package com.smartflow.dto;

import com.smartflow.model.enums.VehicleStatus;
import com.smartflow.model.enums.VehicleType;

public class VehicleDTO {
    private Long id;
    private String name;
    private String registrationNumber;
    private VehicleType type;
    private Double capacityKg;
    private Boolean refrigerated;
    private VehicleStatus status;
    private Double currentLatitude;
    private Double currentLongitude;
    private Long homePortId;
    private String homePortName;
    private Double utilisationPct;

    public VehicleDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    public VehicleType getType() { return type; }
    public void setType(VehicleType type) { this.type = type; }
    public Double getCapacityKg() { return capacityKg; }
    public void setCapacityKg(Double capacityKg) { this.capacityKg = capacityKg; }
    public Boolean getRefrigerated() { return refrigerated; }
    public void setRefrigerated(Boolean refrigerated) { this.refrigerated = refrigerated; }
    public VehicleStatus getStatus() { return status; }
    public void setStatus(VehicleStatus status) { this.status = status; }
    public Double getCurrentLatitude() { return currentLatitude; }
    public void setCurrentLatitude(Double currentLatitude) { this.currentLatitude = currentLatitude; }
    public Double getCurrentLongitude() { return currentLongitude; }
    public void setCurrentLongitude(Double currentLongitude) { this.currentLongitude = currentLongitude; }
    public Long getHomePortId() { return homePortId; }
    public void setHomePortId(Long homePortId) { this.homePortId = homePortId; }
    public String getHomePortName() { return homePortName; }
    public void setHomePortName(String homePortName) { this.homePortName = homePortName; }
    public Double getUtilisationPct() { return utilisationPct; }
    public void setUtilisationPct(Double utilisationPct) { this.utilisationPct = utilisationPct; }
}
