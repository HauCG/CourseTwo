package ArrayInJava;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        boolean found = false;
        do {
            System.out.println("[Christian, Michael, Camila, Sienna, Tanya, Connor, Zachariah, Mallory, Zoe, Emily]");
            System.out.println("Enter a name");
            name = sc.nextLine();
            found = findValueInArray(name);
        }
        while (!found);
    }
    public static boolean  findValueInArray(String name) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(name)) {
                index = i;
                break;
            }
        }
        if (index != -1 ) {
            System.out.println("Your name has been found at: " + (index + 1));
            return true;
        } else {
            System.out.println("Your name is not found");
            return false;
        }
    }
}
