package ifelse;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double number = sc.nextDouble();
        if (number >= 0) {
            System.out.println("Absolute Integer");
        } else {
            System.out.println("Not Absolute number");
        }
    }
    
}
