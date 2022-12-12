package org.example.dataAccess;

import org.example.entity.Car;

import java.util.List;

public interface CarRepository {
    Car getById(Integer id);
    void addCar(Car car);
    List<Car> getAll();
}
