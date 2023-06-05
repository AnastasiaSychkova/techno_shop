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

    public HardDisk save(HardDisk hardDisk) {
        return hardDiskRepository.save(hardDisk);
    }

    public HardDisk update(HardDisk hardDisk) {
        return hardDiskRepository.save(hardDisk);
    }

    public Collection<HardDisk> getAll() {
        return hardDiskRepository.findAll();
    }

    public HardDisk getById(Long id) {
        return hardDiskRepository.findHardDiskById(id);
    }

}
