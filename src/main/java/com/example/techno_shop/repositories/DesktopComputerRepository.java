package com.example.techno_shop.repositories;

import com.example.techno_shop.model.DesktopComputer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DesktopComputerRepository extends JpaRepository<DesktopComputer, Long> {
    DesktopComputer findDesktopComputerById(Long id);
}
