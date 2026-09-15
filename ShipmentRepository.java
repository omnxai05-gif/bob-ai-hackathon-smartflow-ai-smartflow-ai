package com.smartflow.repository;

import com.smartflow.model.Shipment;
import com.smartflow.model.enums.ShipmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    List<Shipment> findByStatus(ShipmentStatus status);
    List<Shipment> findByColdChainRequired(Boolean coldChainRequired);
    long countByStatus(ShipmentStatus status);
    long countByColdChainRequired(Boolean coldChainRequired);
}
