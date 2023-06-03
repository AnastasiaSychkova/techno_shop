package com.example.techno_shop.repositories;

import com.example.techno_shop.model.HardDisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardDiskRepository extends JpaRepository<HardDisk, Long> {
    HardDisk findHardDiskById(Long id);
}
