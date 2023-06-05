package com.example.techno_shop.controller;

import com.example.techno_shop.model.Monitor;
import com.example.techno_shop.service.MonitorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@Slf4j
@RestController
@RequestMapping("/monitor")
public class MonitorController {
    private final MonitorService monitorService;

    public MonitorController(MonitorService monitorService) {
        this.monitorService = monitorService;
    }


    @PostMapping
    public Monitor save(@RequestBody Monitor monitor) {
        log.info("Was invoked method for save in MonitorController");
        return monitorService.save(monitor);
    }

    @PutMapping("/update")
    public ResponseEntity<Monitor> update(@RequestBody Monitor monitor) {
        log.info("Was invoked method for update in MonitorController");
        Monitor monitor1 = monitorService.update(monitor);
        if (monitor1 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(monitor1);
    }

    @GetMapping("/get_all")
    public ResponseEntity<Collection<Monitor>> getAll() {
        log.info("Was invoked method for get all in MonitorController");
        return ResponseEntity.ok(monitorService.getAll());
    }

    @GetMapping("/get_desktop_computer_by_id/{id}")
    public ResponseEntity<Monitor> getById(@PathVariable Long id) {
        log.info("Was invoked method for get by id in MonitorController");
        Monitor monitor1 = monitorService.getById(id);
        if (monitor1 == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(monitor1);
    }
}
