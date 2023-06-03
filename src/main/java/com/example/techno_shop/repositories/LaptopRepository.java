package com.example.techno_shop.repositories;

import com.example.techno_shop.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
    Laptop findLaptopById(Long id);
}
