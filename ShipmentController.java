package com.smartflow.controller;

import com.smartflow.dto.ShipmentDTO;
import com.smartflow.model.enums.ShipmentStatus;
import com.smartflow.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {

    private final ShipmentService shipmentService;

    @Autowired
    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @GetMapping
    public ResponseEntity<List<ShipmentDTO>> getAllShipments(
            @RequestParam(required = false) ShipmentStatus status) {
        if (status != null) {
            return ResponseEntity.ok(shipmentService.getShipmentsByStatus(status));
        }
        return ResponseEntity.ok(shipmentService.getAllShipments());
    }
}
