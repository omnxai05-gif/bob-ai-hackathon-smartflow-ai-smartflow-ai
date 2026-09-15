package com.smartflow.service;

import com.smartflow.dto.ShipmentDTO;
import com.smartflow.model.Shipment;
import com.smartflow.model.enums.ShipmentStatus;
import com.smartflow.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShipmentService {

    private final ShipmentRepository shipmentRepository;

    @Autowired
    public ShipmentService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public List<ShipmentDTO> getAllShipments() {
        return shipmentRepository.findAll().stream().map(this::toDTO).toList();
    }

    public List<ShipmentDTO> getShipmentsByStatus(ShipmentStatus status) {
        return shipmentRepository.findByStatus(status).stream().map(this::toDTO).toList();
    }

    public ShipmentDTO toDTO(Shipment s) {
        if (s == null) return null;
        ShipmentDTO dto = new ShipmentDTO();
        dto.setId(s.getId());
        dto.setReference(s.getReference());
        dto.setOriginPortId(s.getOriginPort() != null ? s.getOriginPort().getId() : null);
        dto.setOriginPortName(s.getOriginPort() != null ? s.getOriginPort().getName() : null);
        dto.setOriginPortCode(s.getOriginPort() != null ? s.getOriginPort().getCode() : null);
        dto.setDestinationPortId(s.getDestinationPort() != null ? s.getDestinationPort().getId() : null);
        dto.setDestinationPortName(s.getDestinationPort() != null ? s.getDestinationPort().getName() : null);
        dto.setDestinationPortCode(s.getDestinationPort() != null ? s.getDestinationPort().getCode() : null);
        dto.setAssignedVehicleId(s.getAssignedVehicle() != null ? s.getAssignedVehicle().getId() : null);
        dto.setAssignedVehicleName(s.getAssignedVehicle() != null ? s.getAssignedVehicle().getName() : null);
        dto.setAssignedRouteId(s.getAssignedRoute() != null ? s.getAssignedRoute().getId() : null);
        dto.setAssignedRouteName(s.getAssignedRoute() != null ? s.getAssignedRoute().getName() : null);
        dto.setStatus(s.getStatus());
        dto.setCargoType(s.getCargoType());
        dto.setWeightKg(s.getWeightKg());
        dto.setValueUsd(s.getValueUsd());
        dto.setCarrier(s.getCarrier());
        dto.setDepartureAt(s.getDepartureAt());
        dto.setEstimatedArrivalAt(s.getEstimatedArrivalAt());
        dto.setRevisedArrivalAt(s.getRevisedArrivalAt());
        dto.setColdChainRequired(s.getColdChainRequired());
        dto.setTempMinC(s.getTempMinC());
        dto.setTempMaxC(s.getTempMaxC());
        dto.setRiskScore(s.getRiskScore());
        dto.setCreatedAt(s.getCreatedAt());
        return dto;
    }
}
