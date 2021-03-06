package car;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("Fake") // instantiates class so it is available in heap. process of dependency injection. gives it name fake
public class FakeCarDataAccessService implements CarDAO{//class to access data. implements DAO.

    private List<Car> carList;

    public FakeCarDataAccessService() {
        this.carList = new ArrayList<>();
    }

    @Override //overriding method from interface level so method works with this type of database (in this case: a list)
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
