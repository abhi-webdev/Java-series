public class EvenFirstOddLater {

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
    }

    static void SortedEvenOdd(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0 ) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 != 0) {
                right--;
            }
        }
        print(arr);
    }

    public static void main(StringRecurision[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        SortedEvenOdd(arr);
    }
}
