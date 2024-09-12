package IntroductionJava;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter usd: ");
        usd = sc.nextDouble();
        vnd = usd * vnd;
        System.out.println("USD: " + vnd);
    }
}
