package com.smartflow.model;

import com.smartflow.model.enums.TransportMode;
import jakarta.persistence.*;

@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "origin_port_id", nullable = false)
    private Port originPort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "destination_port_id", nullable = false)
    private Port destinationPort;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransportMode mode;

    private Double distanceKm;
    private Integer transitDays;
    private Double costUsd;
    private Double reliabilityScore;

    @Column(nullable = false)
    private Boolean active = true;

    public Route() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Port getOriginPort() { return originPort; }
    public void setOriginPort(Port originPort) { this.originPort = originPort; }

    public Port getDestinationPort() { return destinationPort; }
    public void setDestinationPort(Port destinationPort) { this.destinationPort = destinationPort; }

    public TransportMode getMode() { return mode; }
    public void setMode(TransportMode mode) { this.mode = mode; }

    public Double getDistanceKm() { return distanceKm; }
    public void setDistanceKm(Double distanceKm) { this.distanceKm = distanceKm; }

    public Integer getTransitDays() { return transitDays; }
    public void setTransitDays(Integer transitDays) { this.transitDays = transitDays; }

    public Double getCostUsd() { return costUsd; }
    public void setCostUsd(Double costUsd) { this.costUsd = costUsd; }

    public Double getReliabilityScore() { return reliabilityScore; }
    public void setReliabilityScore(Double reliabilityScore) { this.reliabilityScore = reliabilityScore; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
