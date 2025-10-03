import java.util.Scanner;

public class SwapWithoutTemp {

    static void swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter array size: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter "+n+ " element: ");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        int a = 3;
        int b = 9;

        swap(a, b);

    }
}
