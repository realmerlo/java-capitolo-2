package es3;

public class Main {
    public static void main(String[] args){
        Car car = new Car (1100, "LS735PF", "Fiat", "Pandino4x4");

        System.out.println("cc: " + car.getCc());
        System.out.println("car plate: " + car.getCarPlate());
        System.out.println("brand: " + car.getBrand());
        System.out.println("model: " + car.getModel());

        car.setModel("Punto");

        System.out.println("new model is: " + car.getModel());
    }
}
