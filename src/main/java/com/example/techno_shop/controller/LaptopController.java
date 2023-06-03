package com.example.techno_shop.controller;

import com.example.techno_shop.model.Laptop;
import com.example.techno_shop.service.LaptopService;
import lombok.extern.slf4j.Slf4j;
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
    public void save(@RequestBody Laptop laptop) {
        log.info("Was invoked method for save in LaptopController");
        laptopService.save(laptop);
    }

    @PutMapping("/update")
    public void update(@RequestBody Laptop laptop) {
        log.info("Was invoked method for update in LaptopController");
        laptopService.update(laptop);
    }

    @GetMapping("/get_all")
    public Collection<Laptop> getAll() {
        log.info("Was invoked method for get all in LaptopController");
        return laptopService.getAll();
    }

    @GetMapping("/get_laptop_by_id/{id}")
    public Laptop getById(@PathVariable Long id) {
        log.info("Was invoked method for get by id in LaptopController");
        return laptopService.getById(id);
    }
}
