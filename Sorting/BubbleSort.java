package Sorting;
import java.util.Arrays;

public class BubbleSort {
    static int[] sorting(int[] a){
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for(int j = 0; j<n-i-1; j++){
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {10,8,6,4};
        // int[] a = {1,2,3,4};
        // int[] a = {0,0,0,0};
        int[] ans = sorting(a);
        System.out.println(Arrays.toString(ans));
    }
}
