
import java.util.Scanner;
    

public class SortEvenOdd {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of ele: ");
        int n = sc.nextInt();
        System.out.print("Enter the arrar: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = arr.length-1;
        while (i<j) {
            if (arr[i]%2 == 1 && arr[j]%2 == 0) {
                Swap(arr, i, j);
                i++;
                j--;
            }
            if (arr[i]%2 == 0) {
                i++;
            }
            if (arr[j]%2 == 1) {
                j--;
            }
        }
        print(arr);
    }
}
