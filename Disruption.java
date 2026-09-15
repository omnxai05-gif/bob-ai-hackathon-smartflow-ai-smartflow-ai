package com.smartflow.model;

import com.smartflow.model.enums.DisruptionSeverity;
import com.smartflow.model.enums.DisruptionType;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "disruptions")
public class Disruption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DisruptionType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DisruptionSeverity severity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "affected_port_id")
    private Port affectedPort;

    private Double latitude;
    private Double longitude;

    @Column(nullable = false)
    private LocalDateTime startedAt;

    private LocalDateTime estimatedEndAt;
    private LocalDateTime resolvedAt;

    @Column(nullable = false)
    private Boolean active = true;

    public Disruption() {}

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

    public Port getAffectedPort() { return affectedPort; }
    public void setAffectedPort(Port affectedPort) { this.affectedPort = affectedPort; }

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
