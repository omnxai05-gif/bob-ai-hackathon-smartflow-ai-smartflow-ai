package com.smartflow.service;

import com.smartflow.dto.TemperatureReadingDTO;
import com.smartflow.model.TemperatureReading;
import com.smartflow.repository.TemperatureReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TemperatureReadingService {

    private final TemperatureReadingRepository temperatureReadingRepository;

    @Autowired
    public TemperatureReadingService(TemperatureReadingRepository temperatureReadingRepository) {
        this.temperatureReadingRepository = temperatureReadingRepository;
    }

    public List<TemperatureReadingDTO> getReadingsForShipment(Long shipmentId) {
        return temperatureReadingRepository
                .findByShipmentIdOrderByRecordedAtAsc(shipmentId)
                .stream().map(this::toDTO).toList();
    }

    public List<TemperatureReadingDTO> getExcursionsForShipment(Long shipmentId) {
        return temperatureReadingRepository
                .findByShipmentIdAndExcursionTrueOrderByRecordedAtAsc(shipmentId)
                .stream().map(this::toDTO).toList();
    }

    public TemperatureReadingDTO toDTO(TemperatureReading r) {
        if (r == null) return null;
        TemperatureReadingDTO dto = new TemperatureReadingDTO();
        dto.setId(r.getId());
        dto.setShipmentId(r.getShipment() != null ? r.getShipment().getId() : null);
        dto.setShipmentReference(r.getShipment() != null ? r.getShipment().getReference() : null);
        dto.setVehicleId(r.getVehicle() != null ? r.getVehicle().getId() : null);
        dto.setVehicleName(r.getVehicle() != null ? r.getVehicle().getName() : null);
        dto.setTempC(r.getTempC());
        dto.setHumidityPct(r.getHumidityPct());
        dto.setLatitude(r.getLatitude());
        dto.setLongitude(r.getLongitude());
        dto.setRecordedAt(r.getRecordedAt());
        dto.setExcursion(r.getExcursion());
        dto.setExcursionSeverity(r.getExcursionSeverity());
        return dto;
    }
}
