package IntroductionJava;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double height, weight, bmi;
        System.out.print("Enter the height in meters: ");
        height = sc.nextDouble();

        System.out.print("Enter the weight in kilograms: ");
        weight = sc.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.println("Your BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } else if (bmi <= 25) {
            System.out.println("You are normal");
        }  else if (bmi <= 30) {
            System.out.println("You are  a bit fat");
        } else  {
            System.out.println("You big fat ass mortherfucker");
        }
    }
}
