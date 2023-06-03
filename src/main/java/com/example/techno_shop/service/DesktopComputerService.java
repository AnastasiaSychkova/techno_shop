package com.example.techno_shop.service;

import com.example.techno_shop.model.DesktopComputer;
import com.example.techno_shop.repositories.DesktopComputerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class DesktopComputerService {
    private final DesktopComputerRepository desktopComputerRepository;

    public DesktopComputerService(DesktopComputerRepository desktopComputerRepository) {
        this.desktopComputerRepository = desktopComputerRepository;
    }

    public void save(DesktopComputer desktopComputer) {
        desktopComputerRepository.save(desktopComputer);
    }

    public void update(DesktopComputer desktopComputer) {
        desktopComputerRepository.save(desktopComputer);
    }
    public Collection<DesktopComputer> getAll(){
        return new ArrayList<>(desktopComputerRepository.findAll());
    }
    public DesktopComputer getById(Long id){
        return desktopComputerRepository.findDesktopComputerById(id);
    }
}
