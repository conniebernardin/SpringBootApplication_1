package car;

import java.util.ArrayList;
import java.util.List;

//class to access data. implements DAO.
public class FakeCarDataAccessService implements CarDAO{

    private List<Car> carList;

    public FakeCarDataAccessService() {
        this.carList = new ArrayList<>();
    }

    @Override
    public int insertCar(Car car) {
        carList.add(car); //adds car to list cars
        return 1;
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
        return carList; //return list cars
    }
}
