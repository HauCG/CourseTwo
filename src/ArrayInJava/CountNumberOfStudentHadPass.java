package ArrayInJava;

import java.util.Scanner;

public class CountNumberOfStudentHadPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumberOfStudents;

        do{
            System.out.print("Enter the number of students you wish to enter: ");
            NumberOfStudents = sc.nextInt();
            if(NumberOfStudents >30){
                System.out.println("You have entered less than 30 students!");
            }
        } while (NumberOfStudents > 30);

        int[] studentsMark = new int[NumberOfStudents];
        for (int i = 0; i < NumberOfStudents; i++) {
            System.out.print("Enter the mark of student " + (i+1) + " is : " );
            studentsMark[i] = sc.nextInt();
        }

        System.out.print("Your students mark are: ");
        for (int i = 0; i < NumberOfStudents; i++) {
            System.out.print(studentsMark[i]);
            if (i < NumberOfStudents - 1){
                System.out.print(",");
            }
        }
        System.out.println(".");

        System.out.print("Enter the mark to pass: ");
        int mark = sc.nextInt();
        int count = 0;
        for (int i = 0; i < NumberOfStudents; i++) {
            if(studentsMark[i] >= mark){
                count++;
            }
        }
        if (count > 0 ) {
        System.out.println("The number of students pass is: " + count);
        } else if (count == 0) {
            System.out.println("Your class is so dumb that no one. no fucking one pass!");
        }
    }
}
