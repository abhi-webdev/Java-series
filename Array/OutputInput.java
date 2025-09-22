import java.util.Scanner;

public class OutputInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// print array using loop 
        /*
        int[] arr = {3,-76,12,32,-5};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        */

// take input as an array and get output
/*
        int[] arr = new int[5];
        // input
        for(int i=0; i<arr.length; i++){
            int x = sc.nextInt();
            arr[i] = x; 
        }
        // print 
        System.out.print("Output: ");
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
            System.out.print(2*arr[i] + " ");
        }

        */
// n input and print output 
        int n = sc.nextInt();
        int arr[] = new int[n];
        // input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // output
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



// Given an array print negative elements only 
        // int[] arr = {2,-4,-6,1,-5,6,7};
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] < 0) {
        //         System.out.println(arr[i]);
        //     }
        // }

    }
}
