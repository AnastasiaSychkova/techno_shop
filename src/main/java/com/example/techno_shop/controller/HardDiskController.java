package com.example.techno_shop.controller;

import com.example.techno_shop.model.HardDisk;
import com.example.techno_shop.service.HardDiskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public HardDisk save(@RequestBody HardDisk hardDisk) {
        log.info("Was invoked method for save in HardDiskController");
        return hardDiskService.save(hardDisk);
    }

    @PutMapping("/update")
    public ResponseEntity<HardDisk> update(@RequestBody HardDisk hardDisk) {
        log.info("Was invoked method for update in HardDiskController");
        HardDisk hardDisk1 = hardDiskService.update(hardDisk);
        if (hardDisk1 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(hardDisk1);
    }

    @GetMapping("/get_all")
    public ResponseEntity<Collection<HardDisk>> getAll() {
        log.info("Was invoked method for get all in HardDiskController");
        return ResponseEntity.ok(hardDiskService.getAll());
    }

    @GetMapping("/get_hard_disk_by_id/{id}")
    public ResponseEntity<HardDisk> getById(@PathVariable Long id) {
        log.info("Was invoked method for get by id in HardDiskController");
        HardDisk hardDisk1 = hardDiskService.getById(id);
        if (hardDisk1 == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(hardDisk1);
    }
}
