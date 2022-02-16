package car;

import com.connie.SpringBootApplicationPerson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        CarDAO carDAO = new FakeCarDataAccessService();           //instead of doing this manually, we use dependency
//        CarService carService = new CarService(carDAO);           // injection with @component annotation in classes
//        CarController carController = new CarController(carService);
        SpringApplication.run(Main.class, args);
    }

}
h