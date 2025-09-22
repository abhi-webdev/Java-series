package Basic;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Area of circle
        /*
        System.out.print("Enter the raduis: ");
        double r = sc.nextDouble();
        double pi = Math.PI;
        double area = pi*r*r;
        System.out.println("Area of Circle is : "+area);
        */

        // take 2 and 3 as a input and make sum 
        /*
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("Sum of two no is : "+sum);
        */

        // Simple intreast
        System.out.print("Enter your Principal: ");
        int p = sc.nextInt();
        System.out.print("Enter your rate: ");
        int rate = sc.nextInt();
        System.out.print("Enter your time: ");
        int t = sc.nextInt();

        int SI = (p*rate*t/100);
        System.out.println("SI of : "+ SI);
        int amount = SI + p;
        System.out.println("Amount: "+amount);

    }
}
