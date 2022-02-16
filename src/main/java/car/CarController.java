package car;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController //annotation for all api layers
//@RequestMapping("cars") //allows you to say localhost/car
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping(path = "cars")
    public void addCar(@RequestBody Car car){
        carService.registerNewCar(car);
    }

    @GetMapping(path = "cars")
    public List<Car> getCar(){
       return carService.getCars();
    }
}
