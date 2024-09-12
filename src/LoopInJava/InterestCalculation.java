package LoopInJava;

import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.println("Interest Rate Per Year: ");
        double interestRate = sc.nextDouble();

        System.out.println("Loan Months: ");
        double loanMonths = sc.nextDouble();


        if (loanAmount <= 0 || interestRate <= 0 || loanMonths <= 0) {
            System.out.println("Invalid data");
        } else {
            double totalInterest = loanAmount * (interestRate / 12) * loanMonths;
            System.out.println("Total Interest: " + totalInterest);
        }
    }
}


//
//package ArrayInJava;
//
//import java.util.Scanner;
//
//public class Fuck {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your moneys amount: ");
//        double loanAmount = sc.nextDouble();
//
//        double interestRate = 6;
//
//        System.out.println("Enter number of years: ");
//        double years = sc.nextDouble();
//
//        if (loanAmount <= 0 || years <= 0) {
//            System.out.println("Invalid data");
//        } else {
//            double total = loanAmount;
//
//            for (int i = 1; i <= years; i++) {
//                double interestForYear = total * interestRate / 100;
//
//                total += interestForYear;
//            }
//            System.out.println("Final total after " +  years + " is " + total);
//        }
//    }
//}
