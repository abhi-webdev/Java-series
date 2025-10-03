import java.util.Scanner;

public class CountGreatestNo {
    public static void main(String[] args) {
        // Count the number of element in given array greater then the given number x;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = {10,20,30,40,50,60};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                System.out.print(arr[i] + " ");
                count = count + 1;
            }
        }
        System.out.println();
        System.out.println("Total: "+count);
    }
}
