package es2;

public class Car {

    private int cc;
    private String carPlate;
    private String brand;
    private String model;

    public Car (int cc, String carPlate, String brand, String model){
        this.cc = cc;
        this.carPlate = carPlate;
        this.brand = brand;
        this.model = model;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
