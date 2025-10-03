
import java.util.Scanner;

public class TwoPointer {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sortedArray(int[] arr){
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < zeros) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+ " element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the original array: ");
        printArray(arr);
        System.out.println("Sorted Array: ");
        sortedArray(arr);
        printArray(arr);

    }
}
