package com.example.techno_shop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Monitor")
public class Monitor extends Properties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int diagonal;

    public Monitor() {
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return diagonal == monitor.diagonal && Objects.equals(id, monitor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, diagonal);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal=" + diagonal +
                '}';
    }
}
