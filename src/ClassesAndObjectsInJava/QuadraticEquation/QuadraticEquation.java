package ClassesAndObjectsInJava.QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double getDiscriminant(double a, double b, double c) {
        return (b*b)-(4*a*c);
    }

    public double getRoot1() {
        return ((-b)+Math.sqrt(getDiscriminant(a, b, c))) / (2 * a);
    }
    public double getRoot2() {
        return ((-b)-Math.sqrt(getDiscriminant(a, b, c))) / (2 * a);
    }
    public String getNoRoot() {
        return "The equation has no roots ;v ";
    }
    public double getRoot3() {
        return (-b) / (2*a);
    }


}
