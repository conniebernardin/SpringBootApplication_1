package car;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

import static car.Brand.HONDA;

@Repository("postgres")

public class CarDataAccessService implements CarDAO{ //fake database
    @Override
    public int insertCar(Car car) {
        return 0;
    }

    @Override
    public int deleteCar(Integer id) {
        return 0;
    }

    @Override
    public int updateCar(Integer id, Car updatedCar) {
        return 0;
    }

    @Override
    public Car selectCarByID(Integer id) {
        return null;
    }

    @Override
    public List<Car> selectCarAllCars() {
        return List.of(new Car(1,HONDA,12000.0, "BNTA"));
    }
}
