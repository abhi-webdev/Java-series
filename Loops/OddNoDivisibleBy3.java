package Loops;

public class OddNoDivisibleBy3 {
    public static void main(String[] args) {
        // print odd number which is Divisible by 3
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }

    }
}
