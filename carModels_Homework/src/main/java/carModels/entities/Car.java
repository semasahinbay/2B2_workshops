package carModels.entities;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int modelYear;
    private double price;

    public Car() {

    }

    public Car(int id, String brand, String model, int modelYear, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand =brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getModelYear() {
        return modelYear;
    }
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
