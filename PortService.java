package com.smartflow.service;

import com.smartflow.dto.PortDTO;
import com.smartflow.model.Port;
import com.smartflow.repository.PortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PortService {

    private final PortRepository portRepository;

    @Autowired
    public PortService(PortRepository portRepository) {
        this.portRepository = portRepository;
    }

    public List<PortDTO> getAllPorts() {
        return portRepository.findAll().stream().map(this::toDTO).toList();
    }

    public PortDTO toDTO(Port port) {
        if (port == null) return null;
        PortDTO dto = new PortDTO();
        dto.setId(port.getId());
        dto.setCode(port.getCode());
        dto.setName(port.getName());
        dto.setCity(port.getCity());
        dto.setCountry(port.getCountry());
        dto.setLatitude(port.getLatitude());
        dto.setLongitude(port.getLongitude());
        dto.setType(port.getType());
        return dto;
    }
}
