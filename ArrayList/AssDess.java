package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AssDess {
    public static void main(String[] args) {
        // ArrayList <Integer> arr = new ArrayList<>();
        // arr.add(30);
        // arr.add(10);
        // arr.add(7);
        // arr.add(25);
        // arr.add(17);
   
        // Collections.sort(arr);  // asscending Order
        // System.out.println(arr);
        // Collections.sort(arr, Collections.reverseOrder());  // decending Order
        // System.out.println(arr);

        ArrayList <String> str = new ArrayList<>();
        str.add("welcome");
        str.add("to");
        str.add("Chai");
        str.add("Code");

        System.out.println(str);  // Original
        Collections.sort(str);  // Asscending
        System.out.println(str);
        Collections.sort(str, Collections.reverseOrder()); // decending
        System.out.println(str);
    }
}
