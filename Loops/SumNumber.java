package Loops;

import java.util.Scanner;

public class SumNumber {
    // sum the all number 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            int n = num % 10;
            sum = sum + n;
            num = num / 10;
        }
        System.out.println(sum);
    }

}
