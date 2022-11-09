package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImp implements CarService{
    @Autowired
    private CarDaoImp carDaoImp;
    @Override
    public List<Car> allCars() {
        return carDaoImp.allCars();
    }

    @Override
    public List<Car> listCars(int count) {
        return carDaoImp.listCars(count);
    }
}
