package com.example.techno_shop.controller;

import com.example.techno_shop.model.Laptop;
import com.example.techno_shop.service.LaptopService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@Slf4j
@RestController
@RequestMapping("/laptop")
public class LaptopController {

    private final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @PostMapping
    public Laptop save(@RequestBody Laptop laptop) {
        log.info("Was invoked method for save in LaptopController");
        return laptopService.save(laptop);
    }

    @PutMapping("/update")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop) {
        log.info("Was invoked method for update in LaptopController");
        Laptop laptop1 = laptopService.update(laptop);
        if (laptop1 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(laptop1);
    }

    @GetMapping("/get_all")
    public ResponseEntity<Collection<Laptop>> getAll() {
        log.info("Was invoked method for get all in LaptopController");
        return ResponseEntity.ok(laptopService.getAll());
    }

    @GetMapping("/get_laptop_by_id/{id}")
    public ResponseEntity<Laptop> getById(@PathVariable Long id) {
        log.info("Was invoked method for get by id in LaptopController");
        Laptop laptop1 = laptopService.getById(id);
        if (laptop1 == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(laptop1);
    }
}
