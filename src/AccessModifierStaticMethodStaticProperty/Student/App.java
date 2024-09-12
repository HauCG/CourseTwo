package AccessModifierStaticMethodStaticProperty.Student;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.toString());
        Student s2 = new Student("Hậu","C011");
        System.out.println(s2.toString());
    }
}
