package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    @GetMapping("/cars")
    public String getCars(@RequestParam (defaultValue = "5") int count, Model model) {
        CarServiceImp carService = new CarServiceImp();
        List<Car> countCar = carService.getCars(count);
        model.addAttribute("countCar" ,countCar);
        return "cars";
    }
}
