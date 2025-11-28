import java.util.*;

public class Toggle {
    public static void main(String[] args) {
        // Take input 
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // Toggle PHysiCs -> phYSIcS

        for(int i=0; i<str.length(); i++){
            // pick every charachter and check wether it is capital or not 
            boolean flag = true;
            char ch = str.charAt(i);
            int ascii = (int)ch;

            // check 
            if (ascii>=97) {
                flag = false;
            }

            // convert capital to small and small to capital
            if (flag==true) {
                ascii+=32;
                char dh = (char)ascii;
                str.setCharAt(i, dh);
            } else {
                ascii-=32;
                char dh = (char)ascii;
                str.setCharAt(i, dh);
            }

        }

        System.out.println(str);
    }
}
