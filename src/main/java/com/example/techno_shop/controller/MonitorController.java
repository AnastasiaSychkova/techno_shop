package com.example.techno_shop.controller;

import com.example.techno_shop.model.Monitor;
import com.example.techno_shop.service.MonitorService;
import lombok.extern.slf4j.Slf4j;
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
    public void save(@RequestBody Monitor monitor) {
        log.info("Was invoked method for save in MonitorController");
        monitorService.save(monitor);
    }

    @PutMapping("/update")
    public void update(@RequestBody Monitor monitor) {
        log.info("Was invoked method for update in MonitorController");
        monitorService.update(monitor);
    }

    @GetMapping("/get_all")
    public Collection<Monitor> getAll() {
        log.info("Was invoked method for get all in MonitorController");
        return monitorService.getAll();
    }

    @GetMapping("/get_desktop_computer_by_id/{id}")
    public Monitor getById(@PathVariable Long id) {
        log.info("Was invoked method for get by id in MonitorController");
        return monitorService.getById(id);
    }
}
