package com.example.techno_shop.repositories;

import com.example.techno_shop.model.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorRepository extends JpaRepository<Monitor, Long> {
    Monitor findMonitorById(Long id);
}
