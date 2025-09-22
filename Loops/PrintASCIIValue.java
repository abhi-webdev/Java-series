package Loops;

import java.util.Scanner;

public class PrintASCIIValue {
    // print ASCII value of all the Characters
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " : " + (int)ch);
        }
        System.out.println();
    }
}
