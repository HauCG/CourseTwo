package ClassesAndObjectsInJava.Rectangle;

public class Rectangle {
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * width * height;
    }

    public String display() {
        return "Width = " + width  + ", height = " + height;
    }
}
