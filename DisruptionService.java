package com.smartflow.service;

import com.smartflow.dto.DisruptionDTO;
import com.smartflow.model.Disruption;
import com.smartflow.repository.DisruptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DisruptionService {

    private final DisruptionRepository disruptionRepository;

    @Autowired
    public DisruptionService(DisruptionRepository disruptionRepository) {
        this.disruptionRepository = disruptionRepository;
    }

    public List<DisruptionDTO> getAllDisruptions() {
        return disruptionRepository.findAll().stream().map(this::toDTO).toList();
    }

    public List<DisruptionDTO> getActiveDisruptions() {
        return disruptionRepository.findByActive(true).stream().map(this::toDTO).toList();
    }

    public DisruptionDTO toDTO(Disruption d) {
        if (d == null) return null;
        DisruptionDTO dto = new DisruptionDTO();
        dto.setId(d.getId());
        dto.setTitle(d.getTitle());
        dto.setDescription(d.getDescription());
        dto.setType(d.getType());
        dto.setSeverity(d.getSeverity());
        dto.setAffectedPortId(d.getAffectedPort() != null ? d.getAffectedPort().getId() : null);
        dto.setAffectedPortName(d.getAffectedPort() != null ? d.getAffectedPort().getName() : null);
        dto.setAffectedPortCode(d.getAffectedPort() != null ? d.getAffectedPort().getCode() : null);
        dto.setLatitude(d.getLatitude());
        dto.setLongitude(d.getLongitude());
        dto.setStartedAt(d.getStartedAt());
        dto.setEstimatedEndAt(d.getEstimatedEndAt());
        dto.setResolvedAt(d.getResolvedAt());
        dto.setActive(d.getActive());
        return dto;
    }
}
