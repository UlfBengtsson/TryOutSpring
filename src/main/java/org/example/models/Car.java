package org.example.models;

import org.springframework.stereotype.Component;

import java.util.Objects;

public class Car {
    private int id;
    private String modelName;
    private String brand;
    private String regPlate;

    public Car() {}//default

    public Car(String modelName, String brand, String regPlate) {
        this.modelName = modelName;
        this.brand = brand;
        this.regPlate = regPlate;
    }

    public Car(int id, String modelName, String brand, String regPlate) {
        this.id = id;
        this.modelName = modelName;
        this.brand = brand;
        this.regPlate = regPlate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRegPlate() {
        return regPlate;
    }

    public void setRegPlate(String regPlate) {
        this.regPlate = regPlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getId() == car.getId() &&
                getModelName().equals(car.getModelName()) &&
                getBrand().equals(car.getBrand()) &&
                getRegPlate().equals(car.getRegPlate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getModelName(), getBrand(), getRegPlate());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", brand='" + brand + '\'' +
                ", regPlate='" + regPlate + '\'' +
                '}';
    }
}
