package com.smartflow.service;

import com.smartflow.dto.VehicleDTO;
import com.smartflow.model.Vehicle;
import com.smartflow.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<VehicleDTO> getAllVehicles() {
        return vehicleRepository.findAll().stream().map(this::toDTO).toList();
    }

    public VehicleDTO toDTO(Vehicle v) {
        if (v == null) return null;
        VehicleDTO dto = new VehicleDTO();
        dto.setId(v.getId());
        dto.setName(v.getName());
        dto.setRegistrationNumber(v.getRegistrationNumber());
        dto.setType(v.getType());
        dto.setCapacityKg(v.getCapacityKg());
        dto.setRefrigerated(v.getRefrigerated());
        dto.setStatus(v.getStatus());
        dto.setCurrentLatitude(v.getCurrentLatitude());
        dto.setCurrentLongitude(v.getCurrentLongitude());
        dto.setHomePortId(v.getHomePort() != null ? v.getHomePort().getId() : null);
        dto.setHomePortName(v.getHomePort() != null ? v.getHomePort().getName() : null);
        dto.setUtilisationPct(v.getUtilisationPct());
        return dto;
    }
}
