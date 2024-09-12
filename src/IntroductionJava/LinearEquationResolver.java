package IntroductionJava;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("LinearEquationResolver");
        System.out.println("Nhap abc");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c-b)/a;
            System.out.println(answer);
        }else if (b == c) {
            System.out.println("vo so nghiệm");
        } else {
            System.out.println("vô nghiệm");
        }

    }
}
