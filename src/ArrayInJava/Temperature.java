package ArrayInJava;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Fahrenheit to Celsius\n" +
                    "2. Celsius to Fahrenheit\n" +
                    "0. Exit ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Fahrenheit to Celsius. Enter Fahrenheit Temperature: ");
                    double f = sc.nextDouble();
                    System.out.println(((f - 32) * 5 / 9) + " Celsius");
                    break;
                case 2:
                    System.out.println("Celsius to Fahrenheit. Enter Celsius Temperature: ");
                    double c = sc.nextDouble();
                    System.out.println((c * 9 / 5 + 32) + " Fahrenheit");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        while (choice != 1 && choice != 2);
    }
}
