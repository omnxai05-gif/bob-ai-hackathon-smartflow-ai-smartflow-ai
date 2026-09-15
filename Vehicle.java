package com.smartflow.model;

import com.smartflow.model.enums.VehicleStatus;
import com.smartflow.model.enums.VehicleType;
import jakarta.persistence.*;

@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String registrationNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VehicleType type;

    private Double capacityKg;

    @Column(nullable = false)
    private Boolean refrigerated = false;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VehicleStatus status = VehicleStatus.AVAILABLE;

    private Double currentLatitude;
    private Double currentLongitude;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_port_id")
    private Port homePort;

    private Double utilisationPct = 0.0;

    public Vehicle() {}

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

    public Port getHomePort() { return homePort; }
    public void setHomePort(Port homePort) { this.homePort = homePort; }

    public Double getUtilisationPct() { return utilisationPct; }
    public void setUtilisationPct(Double utilisationPct) { this.utilisationPct = utilisationPct; }
}
