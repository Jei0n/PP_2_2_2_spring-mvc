package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {


    private final CarServiceImp carService;

    @Autowired
    public CarController (CarServiceImp carService) {this.carService = carService;}

    @GetMapping("/cars")
    public String getCars(@RequestParam (defaultValue = "5") int count, Model model) {
        List<Car> countCar = carService.getCars(count);
        model.addAttribute("countCar" ,countCar);
        return "cars";
    }
}
