package com.smartflow.dto;

import com.smartflow.model.enums.ExcursionSeverity;
import java.time.LocalDateTime;

public class TemperatureReadingDTO {
    private Long id;
    private Long shipmentId;
    private String shipmentReference;
    private Long vehicleId;
    private String vehicleName;
    private Double tempC;
    private Double humidityPct;
    private Double latitude;
    private Double longitude;
    private LocalDateTime recordedAt;
    private Boolean excursion;
    private ExcursionSeverity excursionSeverity;

    public TemperatureReadingDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getShipmentId() { return shipmentId; }
    public void setShipmentId(Long shipmentId) { this.shipmentId = shipmentId; }
    public String getShipmentReference() { return shipmentReference; }
    public void setShipmentReference(String shipmentReference) { this.shipmentReference = shipmentReference; }
    public Long getVehicleId() { return vehicleId; }
    public void setVehicleId(Long vehicleId) { this.vehicleId = vehicleId; }
    public String getVehicleName() { return vehicleName; }
    public void setVehicleName(String vehicleName) { this.vehicleName = vehicleName; }
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
