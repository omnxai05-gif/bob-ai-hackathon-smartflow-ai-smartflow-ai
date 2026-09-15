package com.smartflow.controller;

import com.smartflow.dto.TemperatureReadingDTO;
import com.smartflow.service.TemperatureReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/temperature-readings")
public class TemperatureReadingController {

    private final TemperatureReadingService temperatureReadingService;

    @Autowired
    public TemperatureReadingController(TemperatureReadingService temperatureReadingService) {
        this.temperatureReadingService = temperatureReadingService;
    }

    @GetMapping
    public ResponseEntity<List<TemperatureReadingDTO>> getReadings(
            @RequestParam Long shipmentId,
            @RequestParam(required = false, defaultValue = "false") Boolean excursionsOnly) {
        if (Boolean.TRUE.equals(excursionsOnly)) {
            return ResponseEntity.ok(temperatureReadingService.getExcursionsForShipment(shipmentId));
        }
        return ResponseEntity.ok(temperatureReadingService.getReadingsForShipment(shipmentId));
    }
}
