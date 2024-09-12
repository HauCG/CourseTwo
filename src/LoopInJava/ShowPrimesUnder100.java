package LoopInJava;

public class ShowPrimesUnder100 {
    public static void main(String[] args) {
        int n = 2;
        while (n <= 100) {
            if (checkPrime(n)) {
                System.out.println(n + ", ");
            }
            n++;
        }
    }

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }


}
