package com.smartflow.repository;

import com.smartflow.model.Vehicle;
import com.smartflow.model.enums.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByStatus(VehicleStatus status);
    long countByStatus(VehicleStatus status);
}
