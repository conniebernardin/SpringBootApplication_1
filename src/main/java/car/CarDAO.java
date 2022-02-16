package car;

import org.springframework.stereotype.Component;

import java.util.List;
//interface is a specification with abstract methods

public interface CarDAO {
    int insertCar(Car car);
    int deleteCar(Integer id);
    int updateCar(Integer id, Car updatedCar);
    Car selectCarByID (Integer id);
    List<Car> selectCarAllCars ();
}
