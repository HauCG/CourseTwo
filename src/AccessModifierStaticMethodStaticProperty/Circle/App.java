package AccessModifierStaticMethodStaticProperty.Circle;

public class App {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
    }
}

