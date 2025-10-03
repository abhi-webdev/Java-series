import java.util.Scanner;

public class ReverseArray {
    static int[] reverse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n-1; i >= 0 ; i--) {
            ans[j] = arr[i];
            j++; 
        }
        return ans;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
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
        int[] ans = reverse(arr);
        print(ans);
    }
}
