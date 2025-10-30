import java.util.Scanner;

public class PrintNeg {
    public static void main(StringRecurision[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Negative No: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i]);
            }
        }
    }
}
