package com.smartflow.model;

import com.smartflow.model.enums.ExcursionSeverity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "temperature_readings")
public class TemperatureReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_id", nullable = false)
    private Shipment shipment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    @Column(nullable = false)
    private Double tempC;

    private Double humidityPct;
    private Double latitude;
    private Double longitude;

    @Column(nullable = false)
    private LocalDateTime recordedAt;

    @Column(nullable = false)
    private Boolean excursion = false;

    @Enumerated(EnumType.STRING)
    private ExcursionSeverity excursionSeverity;

    public TemperatureReading() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Shipment getShipment() { return shipment; }
    public void setShipment(Shipment shipment) { this.shipment = shipment; }

    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }

    public Double getTempC() { return tempC; }
    public void setTempC(Double tempC) { this.tempC = tempC; }

    public Double getHumidityPct() { return humidityPct; }
    public void setHumidityPct(Double humidityPct) { this.humidityPct = humidityPct; }

    public Double getLatitude() { return latitude; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }

    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }

    public LocalDateTime getRecordedAt() { return recordedAt; }
    public void setRecordedAt(LocalDateTime recordedAt) { this.recordedAt = recordedAt; }

    public Boolean getExcursion() { return excursion; }
    public void setExcursion(Boolean excursion) { this.excursion = excursion; }

    public ExcursionSeverity getExcursionSeverity() { return excursionSeverity; }
    public void setExcursionSeverity(ExcursionSeverity excursionSeverity) { this.excursionSeverity = excursionSeverity; }
}
