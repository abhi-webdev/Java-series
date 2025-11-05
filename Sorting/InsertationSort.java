package Sorting;

public class InsertationSort {
    static void instertion(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j>0 && arr[j] < arr[j-1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,4,5,2};
        instertion(arr);
        for (int val : arr) {
            System.out.print(val+ " ");
        }
    }
}
