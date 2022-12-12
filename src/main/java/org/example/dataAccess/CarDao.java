package org.example.dataAccess;

import org.example.entity.Car;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class CarDao implements CarRepository{
    List<Car> cars= Arrays.asList(new Car(1,"Camry",true,1,65500),
            new Car(2,"Vaz 21-07",false,2,7800),
            new Car(3,"Prius",true,1,13500));


    @Override
    public Car getById(Integer id) {
        AtomicReference <Car> _car=new AtomicReference<>();
        cars.forEach(car -> {

            if (car.getId() == id) {

                _car.set(car);

            }
        });
        return _car.get();
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);

    }

    @Override
    public List<Car> getAll() {

        return cars;
    }
}
