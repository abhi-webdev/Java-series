import java.util.Scanner;

public class NoPresentInArray {
    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        return freq;
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
        int[] freq = makeFrequencyArray(arr);
        System.out.print("Enter the num of queris: ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.println("Enter the number to be search: ");
            int x = sc.nextInt();
            if (freq[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;
        }
    }
}
