package com.example.techno_shop.service;

import com.example.techno_shop.model.Laptop;
import com.example.techno_shop.repositories.LaptopRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class LaptopService {
    private final LaptopRepository laptopRepository;

    public LaptopService(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    public Laptop save(Laptop laptop) {
        return laptopRepository.save(laptop);
    }
    public Laptop update(Laptop laptop) {
        return laptopRepository.save(laptop);
    }
    public Collection<Laptop> getAll(){
        return laptopRepository.findAll();
    }

    public Laptop getById(Long id){
        return laptopRepository.findLaptopById(id);
    }
}
