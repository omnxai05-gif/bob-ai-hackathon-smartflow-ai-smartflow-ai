package com.smartflow.dto;

import com.smartflow.model.enums.TransportMode;

public class RouteDTO {
    private Long id;
    private String name;
    private Long originPortId;
    private String originPortName;
    private Long destinationPortId;
    private String destinationPortName;
    private TransportMode mode;
    private Double distanceKm;
    private Integer transitDays;
    private Double costUsd;
    private Double reliabilityScore;
    private Boolean active;

    public RouteDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Long getOriginPortId() { return originPortId; }
    public void setOriginPortId(Long originPortId) { this.originPortId = originPortId; }
    public String getOriginPortName() { return originPortName; }
    public void setOriginPortName(String originPortName) { this.originPortName = originPortName; }
    public Long getDestinationPortId() { return destinationPortId; }
    public void setDestinationPortId(Long destinationPortId) { this.destinationPortId = destinationPortId; }
    public String getDestinationPortName() { return destinationPortName; }
    public void setDestinationPortName(String destinationPortName) { this.destinationPortName = destinationPortName; }
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
