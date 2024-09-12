package ClassesAndObjectsInJava.Fan;

public class Fan {
    private int speed;
    private Boolean isOn;
    private int radius;
    private String color;

    public Fan(Boolean isOn, int radius) {
        this.speed = 0;
        this.isOn = false;
        this.radius = radius;
        this.color = "blue";
    }
    public Fan(int speed, Boolean isOn, int radius, String color) {
        this.speed = speed;
        this.isOn = true;
        this.radius = radius;
        this.color = color;
    }

    public int changeSpeed(int newSpeed) {
        if (newSpeed == 1) {
            this.speed = 1;
            return 1;
        } else if (newSpeed == 2) {
            this.speed = 2;
            return 2;
        } else if (newSpeed == 3) {
            this.speed = 3;
            return 1;
        } else {
            this.speed = 4;
            return 1;
        }
    }

    public String toString() {
        if (isOn) {
            return "Fan is on. Speed: " + speed + ", Radius: " + radius + ", Color: " + color;
        } else {
            return "Fan is off. Radius: " + radius + ", Color: " + color;
        }
    }

    public void changeRadius(int newRadius) {
        this.radius = newRadius;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public void turnOn() {
        if (!isOn) {
            this.isOn = true;
            this.speed = 1;
        }
    }

    public void turnOff() {
        if (isOn) {
            this.isOn = false;
            this.speed = 0;
        }
    }
}
