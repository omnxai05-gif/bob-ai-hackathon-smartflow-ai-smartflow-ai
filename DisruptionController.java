package com.smartflow.controller;

import com.smartflow.dto.DisruptionDTO;
import com.smartflow.service.DisruptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/disruptions")
public class DisruptionController {

    private final DisruptionService disruptionService;

    @Autowired
    public DisruptionController(DisruptionService disruptionService) {
        this.disruptionService = disruptionService;
    }

    @GetMapping
    public ResponseEntity<List<DisruptionDTO>> getAllDisruptions() {
        return ResponseEntity.ok(disruptionService.getAllDisruptions());
    }

    @GetMapping("/active")
    public ResponseEntity<List<DisruptionDTO>> getActiveDisruptions() {
        return ResponseEntity.ok(disruptionService.getActiveDisruptions());
    }
}
