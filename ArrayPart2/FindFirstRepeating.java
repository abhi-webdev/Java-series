import java.util.Scanner;

public class FindFirstRepeating {
    static int repeating(int[] arr) {
        int repeatingNo = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeatingNo = arr[i];
                }
            }
        }
        return repeatingNo;
    }
    public static void main(StringRecurision[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+ " element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(repeating(arr));
    }
}
