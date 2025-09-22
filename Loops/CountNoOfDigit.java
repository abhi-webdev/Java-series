package Loops;

import java.util.Scanner;

public class CountNoOfDigit {
    //Count Digit of the number 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println(1);
        }
        int digit = 0;
        while (num != 0) {
            num = num/10;
            digit++;
        }
        System.out.println(digit);
    }
}
