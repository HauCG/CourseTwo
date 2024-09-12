package AccessModifierStaticMethodStaticProperty.Car;

public class Car {
    private String name;
    private String brand;
    public static int numbersOfCars;

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
        numbersOfCars++;
    }
    public String toString() {
        return name + " " + brand + " ";
    }

}
