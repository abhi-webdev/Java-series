import java.util.*;

public class Basic01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "String java";
        System.out.println(str);

        // Take input from the user 
        System.out.print("Enter your input: ");
        // String inputString = sc.next();
        // System.out.println("Output is: "+inputString);  // Abhi 

        System.out.print("Enter your next input: ");
        String newInput = sc.nextLine();
        System.out.println("New Output is : "+ newInput);

    }
}
