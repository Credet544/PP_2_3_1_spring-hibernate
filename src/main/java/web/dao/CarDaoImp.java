package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Igor", "Black", 1));
        cars.add(new Car("Liza", "Pink", 2));
        cars.add(new Car("Arny", "White", 3));
        cars.add(new Car("Asty", "Yellow", 4));
        cars.add(new Car("Sonya", "Grey", 5));
    }


    @Override
    public List<Car> allCars() {
        return cars;
    }

    @Override
    public List<Car> listCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}