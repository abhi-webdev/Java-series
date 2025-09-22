package ifelse;

import java.util.Scanner;

public class IntegerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // check number integer or not -> 3.14 = 3 || 5.43 = 5
        // we can solved by typeCasting 
        System.out.print("Enter the number: ");
        double num = sc.nextDouble();
        int x = (int)num;
        if (num - x == 0) {
            System.out.println("integer Value");
        } else {
            System.out.println("Not Integer value");
        }

    }
}




