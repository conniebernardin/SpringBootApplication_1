package car;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //annotation for all api layers
@RequestMapping("cars") //allows you to say localhost/car
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public void addCar(@RequestBody Car car){
        carService.registerNewCar(car);
    }
}
