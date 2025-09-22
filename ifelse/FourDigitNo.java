package ifelse;

import java.util.Scanner;

public class FourDigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // check four digit number 
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n > 999 && n < 10000) {
            System.out.println("4 digit number");
        } else {
            System.out.println("Not 4 digit number");
        }

        // Count digit 
        // String num = sc.next();
        // int totalDigit = 0;
        // for (int i = 0; i <= num.length(); i++) {
        //     totalDigit = i;
        // }
        // System.out.println(totalDigit);
        
    }
    
}



// 1 = 1
// 12 = 2
// 123 = 3 
// 1234 = 4