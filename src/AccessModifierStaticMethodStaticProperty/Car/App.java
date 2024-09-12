package AccessModifierStaticMethodStaticProperty.Car;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car("C200", "mec");
        Car car2 = new Car("Pantera", "nissan");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(Car.numbersOfCars);
    }
}
