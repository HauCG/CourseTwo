package AccessModifierStaticMethodStaticProperty.Test;

public class App {
    public static void main(String[] args) {
        Students s1 = new Students("Hua", 1);
        Students s2 = new Students("HIne", 2);

        Students.School = "newCodeGym";

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(Students.School);
    }
}
