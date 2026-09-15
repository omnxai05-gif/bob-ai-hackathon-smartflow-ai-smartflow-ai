package com.smartflow.service;

import com.smartflow.dto.DashboardSummaryDTO;
import com.smartflow.model.enums.ShipmentStatus;
import com.smartflow.model.enums.VehicleStatus;
import com.smartflow.repository.DisruptionRepository;
import com.smartflow.repository.ShipmentRepository;
import com.smartflow.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    private final ShipmentRepository shipmentRepository;
    private final DisruptionRepository disruptionRepository;
    private final VehicleRepository vehicleRepository;

    @Autowired
    public DashboardService(ShipmentRepository shipmentRepository,
                            DisruptionRepository disruptionRepository,
                            VehicleRepository vehicleRepository) {
        this.shipmentRepository = shipmentRepository;
        this.disruptionRepository = disruptionRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public DashboardSummaryDTO getSummary() {
        return new DashboardSummaryDTO(
                shipmentRepository.count(),
                shipmentRepository.countByStatus(ShipmentStatus.AT_RISK),
                shipmentRepository.countByStatus(ShipmentStatus.DELAYED),
                disruptionRepository.findByActive(true).size(),
                shipmentRepository.countByColdChainRequired(true),
                vehicleRepository.countByStatus(VehicleStatus.AVAILABLE),
                vehicleRepository.countByStatus(VehicleStatus.IN_USE)
        );
    }
}
