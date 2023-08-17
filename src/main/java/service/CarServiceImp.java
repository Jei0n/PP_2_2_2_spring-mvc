package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("RENO", 2222, "yes"));
        cars.add(new Car("BMW", 3333, "yes"));
        cars.add(new Car("AUDI", 4444, "no"));
        cars.add(new Car("SKODA", 5555, "yes"));
        cars.add(new Car("LADA", 6666, "yes"));
    }

    @Override
    public List<Car> getCars(int number) {
        if (number == 0 || number > 5) {
            return cars;
        } else {
            return cars.stream().limit(number).collect(Collectors.toList());
        }
    }
}
