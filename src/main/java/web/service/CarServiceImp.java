package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImp implements CarService{
    @Autowired
    private CarDao carDao;
    @Override
    public List<Car> allCars() {
        return carDao.allCars();
    }

    @Override
    public List<Car> listCars(int count) {
        return carDao.listCars(count);
    }
}
