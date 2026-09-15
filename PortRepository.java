package com.smartflow.repository;

import com.smartflow.model.Port;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PortRepository extends JpaRepository<Port, Long> {
    Optional<Port> findByCode(String code);
}
