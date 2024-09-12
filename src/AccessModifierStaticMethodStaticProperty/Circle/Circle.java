package AccessModifierStaticMethodStaticProperty.Circle;

public class Circle {
    private double radius = 1;
    public String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return   Math.PI * this.radius * this.radius;
    }
}

//Hai thuộc tính có access modifier là private: radius (double) có giá trị khởi tạo là 1.0, color (String) có giá trị khởi tạo là "red".
//Hai hàm tạo: một không có tham số và một có tham số là radius.
//Hai phương thức có access modifier là public: getRadius và getArea.
//Hãy tạo lớp TestCircle, tạo đối tượng Circle và truy cập đến các phương thức getRadius() và getArea().
//
//Thay đổi access modifier cho các phương thức getRadius() và getArea(), sau đó test lại.