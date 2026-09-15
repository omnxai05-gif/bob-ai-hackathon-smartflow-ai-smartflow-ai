package com.smartflow.repository;

import com.smartflow.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
    List<Route> findByActive(Boolean active);
    List<Route> findByOriginPortIdAndDestinationPortIdAndActive(Long originPortId, Long destinationPortId, Boolean active);
}
