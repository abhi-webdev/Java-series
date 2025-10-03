import java.util.Scanner;

public class KthRotation {
    
    // static int[] Kth(int[] arr, int k) {
    //     int n = arr.length;
    //     k = k % n;
    //     int [] ans = new int[n];
    //     for (int i = 0; i < arr.length; i++) {
            
    //     }

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+ " element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
