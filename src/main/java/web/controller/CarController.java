package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarDao carDao;


    @GetMapping()
    public String printCars(@RequestParam(defaultValue = "5")Integer count, ModelMap model) {
        model.addAttribute("cars", new CarDao().listCars(count));
        return "cars";
    }
}
