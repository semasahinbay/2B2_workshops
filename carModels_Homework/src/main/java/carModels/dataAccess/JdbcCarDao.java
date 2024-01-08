package carModels.dataAccess;

import carModels.entities.Car;

public class JdbcCarDao {
    public void add(Car car) {
        System.out.println("JDBC ile vertabanına eklendi.");
    }
}
