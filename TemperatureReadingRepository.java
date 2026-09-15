package com.smartflow.repository;

import com.smartflow.model.TemperatureReading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemperatureReadingRepository extends JpaRepository<TemperatureReading, Long> {
    List<TemperatureReading> findByShipmentIdOrderByRecordedAtAsc(Long shipmentId);
    List<TemperatureReading> findByShipmentIdAndExcursionTrueOrderByRecordedAtAsc(Long shipmentId);
}
