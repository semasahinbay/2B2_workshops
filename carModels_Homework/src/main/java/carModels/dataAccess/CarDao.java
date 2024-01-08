package carModels.dataAccess;


import carModels.entities.Car;

public interface CarDao {
    public void create(Car car);
    public void delete(Car car);
    public void update(Car car);
}