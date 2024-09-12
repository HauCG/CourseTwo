package LoopInJava;

public class TestMultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");

        // In tiêu đề cột
        System.out.print("   ");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // In dòng phân cách
        System.out.println("   -------------------------------");

        // In bảng nhân
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d|", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
