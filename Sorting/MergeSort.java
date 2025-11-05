package Sorting;

public class MergeSort {
    static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1; // length of left array
        int n2 = r - mid; // length of right array

        // create two sub array
        int[] left = new int[n1];
        int[] right = new int[n2];

        // fill two sub array
        int i, j, k;
        for (i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        for (j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // merge the both sub array
        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }

        while (i < n1) {
            arr[k] = left[i];
            k++;
            i++;
        }

        while (j < n2) {
            arr[k] = right[j];
            k++;
            j++;
        }

    }

    static void mergeSort(int[] arr, int l, int r) {
        // best case
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        // recursion se 2 sun array ko sort kar lenge
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        // 2 sub array ko merge karna hai
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 20, 4, 11, 8, 2 };
        int n = arr.length;
        System.out.print("Before sorting: ");
        display(arr);
        System.out.println();
        mergeSort(arr, 0, n - 1);
        System.out.print("After sorting: ");
        display(arr);
    }
}
