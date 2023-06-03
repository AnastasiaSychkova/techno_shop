package com.example.techno_shop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Laptop")
public class Laptop extends Properties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int inches;

    public Laptop() {
    }


    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return inches == laptop.inches && Objects.equals(id, laptop.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, inches);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "inches=" + inches +
                '}';
    }
}
