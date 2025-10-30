package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class ReverseArray {
    // static void reverse(ArrayList<Integer> arr){
    //     int i = 0, j = arr.size()-1;

    //     while (i < j) {
    //         Integer temp =Integer.valueOf(arr.get(i));
    //         arr.set(i, arr.get(j));
    //         arr.set(j, temp);

    //         i++;
    //         j--;
    //     }
    // }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(17);
        arr.add(9);
        arr.add(2);
        arr.add(17);

        System.out.println("Original Array: " + arr);
        // reverse(arr);
        Collections.reverse(arr);
        System.out.println("Reversed array: " + arr);
    }
}
