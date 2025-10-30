import java.util.Arrays;

public class ArrayManipulation {
    // Find the unique number in a given array 
    // [2,3,4,5,10,2,3,4,5]
    static int unique(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(StringRecurision[] args) {
        int[] arr = {2,3,4,5,10,2,3,4,5};
        System.out.println(unique(arr));
    }
}
