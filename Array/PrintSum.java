import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        // print su, of array element
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array Size: ");
        int[] arr = new int[sc.nextInt()];
        System.out.print("Enter array Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print("Sum: " + sum);
        */


        // print product of array element 
        /*
        int[] arr = {2,3,4,5,6};
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        System.out.print("Product: " + product);
        */

        // print a maximam element in array 
        int[] arr = {5,1,3,9,12,4,43,2};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            // max = Math.max(max, arr[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
