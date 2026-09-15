package com.smartflow.dto;

import com.smartflow.model.enums.DisruptionSeverity;
import com.smartflow.model.enums.DisruptionType;
import java.time.LocalDateTime;

public class DisruptionDTO {
    private Long id;
    private String title;
    private String description;
    private DisruptionType type;
    private DisruptionSeverity severity;
    private Long affectedPortId;
    private String affectedPortName;
    private String affectedPortCode;
    private Double latitude;
    private Double longitude;
    private LocalDateTime startedAt;
    private LocalDateTime estimatedEndAt;
    private LocalDateTime resolvedAt;
    private Boolean active;

    public DisruptionDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public DisruptionType getType() { return type; }
    public void setType(DisruptionType type) { this.type = type; }
    public DisruptionSeverity getSeverity() { return severity; }
    public void setSeverity(DisruptionSeverity severity) { this.severity = severity; }
    public Long getAffectedPortId() { return affectedPortId; }
    public void setAffectedPortId(Long affectedPortId) { this.affectedPortId = affectedPortId; }
    public String getAffectedPortName() { return affectedPortName; }
    public void setAffectedPortName(String affectedPortName) { this.affectedPortName = affectedPortName; }
    public String getAffectedPortCode() { return affectedPortCode; }
    public void setAffectedPortCode(String affectedPortCode) { this.affectedPortCode = affectedPortCode; }
    public Double getLatitude() { return latitude; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }
    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }
    public LocalDateTime getStartedAt() { return startedAt; }
    public void setStartedAt(LocalDateTime startedAt) { this.startedAt = startedAt; }
    public LocalDateTime getEstimatedEndAt() { return estimatedEndAt; }
    public void setEstimatedEndAt(LocalDateTime estimatedEndAt) { this.estimatedEndAt = estimatedEndAt; }
    public LocalDateTime getResolvedAt() { return resolvedAt; }
    public void setResolvedAt(LocalDateTime resolvedAt) { this.resolvedAt = resolvedAt; }
    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
