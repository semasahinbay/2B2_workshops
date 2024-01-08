package carModels.dataAccess;

import carModels.dataAccess.CarDao;
import carModels.entities.Car;

public class HibernateCarDao implements CarDao {

    public void create(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " Hibernate ile veritabanına eklendi");
    }


    public void delete(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " Hibernate veritabanından silindi");
    }


    public void update(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " Hibernate veritabanı güncellendi");
    }
}