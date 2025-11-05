package Sorting;

import java.util.Arrays;

public class SelectionSort {
    // static int[] selection(int[] arr){  if you want in array mode
    static void selection(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_val = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_val]) {
                    min_val = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_val];
            arr[min_val] = temp;
        }
        // return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,8,6,1};
        // int[] ans = selection(arr);
        // System.out.println(Arrays.toString(ans));
        selection(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
