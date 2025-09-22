package Loops;

import java.util.Scanner;

public class PowerOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a;
        for (int i = 1; i < b; i++) {
            result = result*a;
        }
        System.out.println(result);
    }
}
