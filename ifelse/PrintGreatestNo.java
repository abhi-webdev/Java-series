package ifelse;

import java.util.Scanner;

public class PrintGreatestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: ");
        int a = sc.nextInt();
        System.out.print("Enter side b: ");
        int b = sc.nextInt();
        System.out.print("Enter side c: ");
        int c = sc.nextInt();

        if (a>b && a>c) {
            System.out.println(a + " is Greatest number");
        } else if(b>c) {
            System.out.println(b + " is Greatest number");
        } else if(a==b && b==c) {
            System.out.println("Equal number");
        } else {
            System.out.println(c + " is Greatest number");
        }
    }
}
