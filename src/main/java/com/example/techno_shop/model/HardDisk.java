package com.example.techno_shop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Hard_Disk")
public class HardDisk extends Properties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int capacity;

    public HardDisk() {
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HardDisk)) return false;
        if (!super.equals(o)) return false;
        HardDisk hardDisk = (HardDisk) o;
        return capacity == hardDisk.capacity && Objects.equals(id, hardDisk.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, capacity);
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "capacity=" + capacity +
                '}';
    }
}
