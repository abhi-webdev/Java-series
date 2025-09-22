package ifelse;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: ");
        int a = sc.nextInt();
        System.out.print("Enter side b: ");
        int b = sc.nextInt();
        System.out.print("Enter side c: ");
        int c = sc.nextInt();

        if ((a+b)>c) {
            if ((b+c)>a) {
                if ((c+a)>b) {
                    System.out.println("Triangle");
                }
            }
        } else {
            System.out.println("Not triangle");
        }
    }
}
