package org.example.data;

import org.example.models.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private int idCounter = 0;
    private List<Car> carList = new ArrayList<>();

    @Override
    public Car create(String brand, String modelName, String regPlate) {
        Car car = new Car(idCounter++, modelName, brand, regPlate);
        carList.add(car);
        return car;
    }

    @Override
    public Car update(Car car) {
        Car updatedCar = null;

        for (Car aCar : carList) {
            if (aCar.getId() == car.getId()) {
                updatedCar = aCar;
                updatedCar.setBrand(car.getBrand());
                updatedCar.setModelName(car.getModelName());
                updatedCar.setRegPlate(car.getRegPlate());
                break;
            }
        }

        return updatedCar;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Car findById(int id) {
        return null;
    }

    @Override
    public List<Car> all() {
        return carList;
    }
}
