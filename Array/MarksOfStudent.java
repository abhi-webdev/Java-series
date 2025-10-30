import java.util.Scanner;

public class MarksOfStudent {
    public static void main(StringRecurision[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Subject: ");
        int n = sc.nextInt();
        System.out.print("Enter the marks of the Sutdent: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 35) {
                System.out.println("Roll no: " + i);
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}
