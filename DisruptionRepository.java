package com.smartflow.repository;

import com.smartflow.model.Disruption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisruptionRepository extends JpaRepository<Disruption, Long> {
    List<Disruption> findByActive(Boolean active);
    List<Disruption> findByActiveOrderBySeverityDesc(Boolean active);
}
