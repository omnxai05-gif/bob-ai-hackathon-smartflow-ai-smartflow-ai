package com.smartflow.controller;

import com.smartflow.dto.PortDTO;
import com.smartflow.service.PortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/ports")
public class PortController {

    private final PortService portService;

    @Autowired
    public PortController(PortService portService) {
        this.portService = portService;
    }

    @GetMapping
    public ResponseEntity<List<PortDTO>> getAllPorts() {
        return ResponseEntity.ok(portService.getAllPorts());
    }
}
