package IntroductionJava;

import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        short number = sc.nextShort();

        if (number >= 0 && number < 10000) {
            int thousands = number / 1000;
            switch (thousands) {
                case 1:
                    System.out.print("One thousand ");
                    break;
                case 2:
                    System.out.print("Two thousand ");
                    break;
                case 3:
                    System.out.print("Three thousand ");
                    break;
                case 4:
                    System.out.print("Four thousand ");
                    break;
                case 5:
                    System.out.print("Five thousand ");
                    break;
                case 6:
                    System.out.print("Six thousand ");
                    break;
                case 7:
                    System.out.print("Seven thousand ");
                    break;
                case 8:
                    System.out.print("Eight thousand ");
                    break;
                case 9:
                    System.out.print("Nine thousand ");
                    break;
            }

            int hundreds = (number % 1000) / 100;
            switch (hundreds) {
                case 1:
                    System.out.print("one hundred ");
                    break;
                case 2:
                    System.out.print("two hundred ");
                    break;
                case 3:
                    System.out.print("three hundred ");
                    break;
                case 4:
                    System.out.print("four hundred ");
                    break;
                case 5:
                    System.out.print("five hundred ");
                    break;
                case 6:
                    System.out.print("six hundred ");
                    break;
                case 7:
                    System.out.print("seven hundred ");
                    break;
                case 8:
                    System.out.print("eight hundred ");
                    break;
                case 9:
                    System.out.print("nine hundred ");
                    break;
            }
            int tensUnits = (number % 1000) % 100;
            if(number >100 &&  tensUnits > 0) {
                System.out.println("and ");
            }
            if (tensUnits >= 10 && tensUnits < 20) {
                switch (tensUnits) {
                    case 10:
                        System.out.print("ten ");
                        break;
                    case 11:
                        System.out.print("eleven ");
                        break;
                    case 12:
                        System.out.print("twelve ");
                        break;
                    case 13:
                        System.out.print("thirteen ");
                        break;
                    case 14:
                        System.out.print("fourteen ");
                        break;
                    case 15:
                        System.out.print("fifteen ");
                        break;
                    case 16:
                        System.out.print("sixteen ");
                        break;
                    case 17:
                        System.out.print("seventeen ");
                        break;
                    case 18:
                        System.out.print("eighteen ");
                        break;
                    case 19:
                        System.out.print("nineteen ");
                        break;
                }
            } else {
                int tens = ((number % 1000) % 100) / 10;
                switch (tens) {
                    case 1:
                        System.out.print("ten ");
                        break;
                    case 2:
                        System.out.print("twenty ");
                        break;
                    case 3:
                        System.out.print("thirty ");
                        break;
                    case 4:
                        System.out.print("forty ");
                        break;
                    case 5:
                        System.out.print("fifty ");
                        break;
                    case 6:
                        System.out.print("sixty ");
                        break;
                    case 7:
                        System.out.print("seventy ");
                        break;
                    case 8:
                        System.out.print("eighty ");
                        break;
                    case 9:
                        System.out.print("ninety ");
                        break;
                }

                int units = (((number % 1000) % 100) % 10);
                switch (units) {
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }
            }
        } else {
            System.out.println("out of ability (0-9999).");
        }
    }
}
