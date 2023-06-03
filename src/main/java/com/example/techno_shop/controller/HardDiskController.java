package com.example.techno_shop.controller;

import com.example.techno_shop.model.HardDisk;
import com.example.techno_shop.service.HardDiskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@Slf4j
@RestController
@RequestMapping("/hard_disk")
public class HardDiskController {
    private final HardDiskService hardDiskService;

    public HardDiskController(HardDiskService hardDiskService) {
        this.hardDiskService = hardDiskService;
    }

    @PostMapping
    public void save(@RequestBody HardDisk hardDisk) {
        log.info("Was invoked method for save in HardDiskController");
        hardDiskService.save(hardDisk);
    }

    @PutMapping("/update")
    public void update(@RequestBody HardDisk hardDisk) {
        log.info("Was invoked method for update in HardDiskController");
        hardDiskService.update(hardDisk);
    }

    @GetMapping("/get_all")
    public Collection<HardDisk> getAll() {
        log.info("Was invoked method for get all in HardDiskController");
        return hardDiskService.getAll();
    }

    @GetMapping("/get_hard_disk_by_id/{id}")
    public HardDisk getById(@PathVariable Long id) {
        log.info("Was invoked method for get by id in HardDiskController");
        return hardDiskService.getById(id);
    }
}
