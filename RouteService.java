package com.smartflow.service;

import com.smartflow.dto.RouteDTO;
import com.smartflow.model.Route;
import com.smartflow.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RouteService {

    private final RouteRepository routeRepository;

    @Autowired
    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public List<RouteDTO> getAllRoutes() {
        return routeRepository.findAll().stream().map(this::toDTO).toList();
    }

    public List<RouteDTO> getActiveRoutes() {
        return routeRepository.findByActive(true).stream().map(this::toDTO).toList();
    }

    public RouteDTO toDTO(Route route) {
        if (route == null) return null;
        RouteDTO dto = new RouteDTO();
        dto.setId(route.getId());
        dto.setName(route.getName());
        dto.setOriginPortId(route.getOriginPort() != null ? route.getOriginPort().getId() : null);
        dto.setOriginPortName(route.getOriginPort() != null ? route.getOriginPort().getName() : null);
        dto.setDestinationPortId(route.getDestinationPort() != null ? route.getDestinationPort().getId() : null);
        dto.setDestinationPortName(route.getDestinationPort() != null ? route.getDestinationPort().getName() : null);
        dto.setMode(route.getMode());
        dto.setDistanceKm(route.getDistanceKm());
        dto.setTransitDays(route.getTransitDays());
        dto.setCostUsd(route.getCostUsd());
        dto.setReliabilityScore(route.getReliabilityScore());
        dto.setActive(route.getActive());
        return dto;
    }
}
