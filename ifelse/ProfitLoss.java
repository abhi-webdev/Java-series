package ifelse;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cp: ");
        int cp = sc.nextInt();
        System.out.print("Enter sp: ");
        int sp = sc.nextInt();

        if (sp == cp) {
            System.out.println("No Profit No loss");
        } else if(sp > cp){
            System.out.println("Profit hua");
        } else {
            System.out.println("Loss hua");
        }

    }
    
}
