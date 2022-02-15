package car;

import java.util.List;

public class CarDataAccessService implements CarDAO{
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
        return null;
    }
}
