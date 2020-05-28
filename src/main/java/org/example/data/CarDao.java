package org.example.data;

import org.example.models.Car;

import java.util.List;

public interface CarDao {
    Car create(String brand, String modelName, String regPlate);
    Car update(Car car);
    boolean delete(int id);
    Car findById(int id);
    List<Car> all();
}
