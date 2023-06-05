package com.example.techno_shop.controller;

import com.example.techno_shop.model.DesktopComputer;
import com.example.techno_shop.service.DesktopComputerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Slf4j
@RestController
@RequestMapping("/desktop_computer")
public class DesktopComputerController {
    private final DesktopComputerService desktopComputerService;

    public DesktopComputerController(DesktopComputerService desktopComputerService) {
        this.desktopComputerService = desktopComputerService;
    }


    @PostMapping
    public DesktopComputer save(@RequestBody DesktopComputer desktopComputer) {
        log.info("Was invoked method for save in DesktopComputerController");
        return desktopComputerService.save(desktopComputer);
    }

    @PutMapping("/update")
    public ResponseEntity<DesktopComputer> update(@RequestBody DesktopComputer desktopComputer) {
        log.info("Was invoked method for update in DesktopComputerController");
        DesktopComputer desktopComputer1 = desktopComputerService.update(desktopComputer);
        if (desktopComputer1 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(desktopComputer1);
    }

    @GetMapping("/get_all")
    public ResponseEntity<Collection<DesktopComputer>> getAll() {
        log.info("Was invoked method for get all in DesktopComputerController");
        return ResponseEntity.ok(desktopComputerService.getAll());
    }

    @GetMapping("/get_desktop_computer_by_id/{id}")
    public ResponseEntity<DesktopComputer> getById(@PathVariable Long id) {
        log.info("Was invoked method for get by id in DesktopComputerController");
        DesktopComputer desktopComputer = desktopComputerService.getById(id);
        if (desktopComputer == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(desktopComputer);
    }
}
