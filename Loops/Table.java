package Loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // Table of any number 
        Scanner sc = new Scanner(System.in);
        System.out.print("The Table of : ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
        System.out.println();
    }
    
}
