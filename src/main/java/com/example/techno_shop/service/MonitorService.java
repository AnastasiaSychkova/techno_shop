package com.example.techno_shop.service;

import com.example.techno_shop.model.Monitor;
import com.example.techno_shop.repositories.MonitorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class MonitorService {
    private final MonitorRepository monitorRepository;

    public MonitorService(MonitorRepository monitorRepository) {
        this.monitorRepository = monitorRepository;
    }

    public void save(Monitor monitor) {
        monitorRepository.save(monitor);
    }

    public void update(Monitor monitor) {
        monitorRepository.save(monitor);
    }

    public Collection<Monitor> getAll() {
        return new ArrayList<>(monitorRepository.findAll());
    }

    public Monitor getById(Long id) {
        return monitorRepository.findMonitorById(id);
    }
}
