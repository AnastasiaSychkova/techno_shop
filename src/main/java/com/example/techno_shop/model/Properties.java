package com.example.techno_shop.model;

import javax.persistence.MappedSuperclass;
import java.util.Objects;
@MappedSuperclass
public abstract class Properties {

    private Long seriesNumber;
    private String manufacturer;
    private Long price;
    private Long productionQuantity;

    public Properties(){}

    public Long getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(Long seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getProductionQuantity() {
        return productionQuantity;
    }

    public void setProductionQuantity(Long productionQuantity) {
        this.productionQuantity = productionQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Properties)) return false;
        Properties that = (Properties) o;
        return Objects.equals(seriesNumber, that.seriesNumber) && Objects.equals(manufacturer, that.manufacturer) && Objects.equals(price, that.price) && Objects.equals(productionQuantity, that.productionQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seriesNumber, manufacturer, price, productionQuantity);
    }

    @Override
    public String toString() {
        return "Properties{" +
                "seriesNumber=" + seriesNumber +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", productionQuantity=" + productionQuantity +
                '}';
    }
}
