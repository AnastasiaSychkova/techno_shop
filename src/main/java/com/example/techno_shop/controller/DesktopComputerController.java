package com.example.techno_shop.controller;

import com.example.techno_shop.model.DesktopComputer;
import com.example.techno_shop.service.DesktopComputerService;
import lombok.extern.slf4j.Slf4j;
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
    public void save(@RequestBody DesktopComputer desktopComputer) {
        log.info("Was invoked method for save in DesktopComputerController");
        desktopComputerService.save(desktopComputer);
    }

    @PutMapping("/update")
    public void update(@RequestBody DesktopComputer desktopComputer) {
        log.info("Was invoked method for update in DesktopComputerController");
        desktopComputerService.update(desktopComputer);
    }

    @GetMapping("/get_all")
    public Collection<DesktopComputer> getAll() {
        log.info("Was invoked method for get all in DesktopComputerController");
        return desktopComputerService.getAll();
    }

    @GetMapping("/get_desktop_computer_by_id/{id}")
    public DesktopComputer getById(@PathVariable Long id) {
        log.info("Was invoked method for get by id in DesktopComputerController");
        return desktopComputerService.getById(id);
    }
}
