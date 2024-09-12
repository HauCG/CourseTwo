package AccessModifierStaticMethodStaticProperty.Test;

public class Students {
    public String name;
    public int age;
    public static String School ="CG";
    public Students(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public  String toString(){
        return "Students [name= " + name + ", age= " + age + ", shool= " + School  + "]";
    }
}
