package carModels.business;

import carModels.dataAccess.CarDao;
import carModels.entities.Car;

import java.util.List;
import java.util.logging.Logger;

public class CarManager {
    public CarDao carDao;
        //iş kuralları
    private List<Logger> loggers;

    public void add(Car car) throws Exception {

        //Brand
        if (car.getBrand().length() < 2) {
            throw new Exception("Car brand must consist of at least 2 letters.");
        }

        //ModelYear
        if(car.getModelYear() < 2023){
            throw new Exception("The model year of the vehicle cannot be older than 2023.");
        }

        //Price
        if (car.getPrice() < 500000) {
            throw new Exception("The price of the selected car must be minimum 500000 TL.");
        }

    }
}
