package com.example.techno_shop.service;

import com.example.techno_shop.model.HardDisk;
import com.example.techno_shop.repositories.HardDiskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class HardDiskService {
    private final HardDiskRepository hardDiskRepository;

    public HardDiskService(HardDiskRepository hardDiskRepository) {
        this.hardDiskRepository = hardDiskRepository;
    }

    public void save(HardDisk hardDisk) {
        hardDiskRepository.save(hardDisk);
    }

    public void update(HardDisk hardDisk) {
        hardDiskRepository.save(hardDisk);
    }

    public Collection<HardDisk> getAll() {
        return new ArrayList<>(hardDiskRepository.findAll());
    }

    public HardDisk getById(Long id) {
        return hardDiskRepository.findHardDiskById(id);
    }

}
