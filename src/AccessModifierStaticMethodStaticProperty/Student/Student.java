package AccessModifierStaticMethodStaticProperty.Student;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
        this.name = name;
        this.classes = classes;
    }

    public Student(String newName, String newClasses) {
        this.name = newName;
        this.classes = newClasses;
    }

    public void setName(String newName) {
         this.name = newName;
    }
    public void setClasses(String newClasses) {
         this.classes = newClasses;
    }
    public String toString() {
        return "Student [name=" + name + ", classes=" + classes + "]";
    }
}
