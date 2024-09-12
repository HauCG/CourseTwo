package ClassesAndObjectsInJava.Fan;

public class App {
    public static void main(String[] args) {
        Fan fan1 = new Fan(false, 5);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan(3,true,10,"yellow");
        System.out.println(fan2.toString());
    }
}
//Đối tượng Fan 1: Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt
//Đối tượng Fan 2: Gán giá trị lớn nhất cho speed, radius là 10, color là yellow và quạt ở trạng thái bật.
