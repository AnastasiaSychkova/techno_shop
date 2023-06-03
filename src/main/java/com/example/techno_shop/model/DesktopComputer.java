package com.example.techno_shop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Desktop_Computer")
public class DesktopComputer extends Properties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String formFactor;

    public DesktopComputer() {
    }


    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DesktopComputer)) return false;
        if (!super.equals(o)) return false;
        DesktopComputer that = (DesktopComputer) o;
        return Objects.equals(id, that.id) && Objects.equals(formFactor, that.formFactor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, formFactor);
    }

    @Override
    public String toString() {
        return "DesktopComputer{" +
                "formFactor='" + formFactor + '\'' +
                '}';
    }
}
