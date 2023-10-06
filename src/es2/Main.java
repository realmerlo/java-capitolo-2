package es2;

public class Main {
    public static void main(String[] args){
        Car car = new Car (1600, "FX456ZY", "Alfa Romeo", "Giulietta");

        System.out.println("cc: " + car.getCc());
        System.out.println("car plate: " + car.getCarPlate());
        System.out.println("brand: " + car.getBrand());
        System.out.println("model: " + car.getModel());

}
}
/* Scrivere un programma che contenga una classe che definisce un Auto
che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
*/