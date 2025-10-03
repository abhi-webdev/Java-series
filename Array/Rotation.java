// command line argument 


import java.util.Scanner;

public class Rotation {
    // sample input 
    // 5 4
    // 1 2 3 4 5
    // sample output
    // 5 1 2 3 4
    public static void rotate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        int i = 0, j = n-1;
         rotate(arr);
    }
}
