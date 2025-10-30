package ArrayList;
import java.util.ArrayList;

public class ArrayDetails {
    public static void main(String[] args) {
        // Syntax of ArrayList 
        ArrayList <Integer> arr = new ArrayList<>();

        // Add Integer Element in Array
        arr.add(2);
        arr.add(7);
        arr.add(3);
        arr.add(5);

        // print arry 
        System.out.println(arr);

        // access element using Index 
        System.out.println(arr.get(1));

        // print arrElement using forLoop
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // set new element at 2 index
        arr.set(2, 10);
        System.out.println(arr);

        // remove elememnt from the loop without knowing any index
        arr.remove(Integer.valueOf(7));
        System.out.println("Element : "+ arr);

        // find the element in array
        boolean find = arr.contains(20);
        System.out.println(find);


        // all dataType elem print
        ArrayList printAll = new ArrayList();
        printAll.add("Abhi");
        printAll.add(10);
        printAll.add(true);
        printAll.add('A');

        System.out.println(printAll);
    }
}
