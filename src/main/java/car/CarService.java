package car;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //instantiates service in heap
public class CarService {

    private CarDAO carDAO; //create instance of DAO so anything that implements that interface can be accessed


    public CarService(CarDAO carDAO){
        this.carDAO = carDAO;
    }

    public void registerNewCar(Car car){
   //business logic
    if(car.getPrice() <= 0){
        throw new IllegalStateException("Car price cannot be 0 or less");
        }
    int result = carDAO.insertCar(car);
    if (result != 1){
        throw new IllegalStateException("Could not save car.");
    }
    }

    public List<Car> getCars(){
        return carDAO.selectCarAllCars();
    }
}
