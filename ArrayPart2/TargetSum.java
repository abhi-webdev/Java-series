import java.util.Scanner;

public class TargetSum {
    static int[] pairSum(int[] arr, int target){
        int n = arr.length;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
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

        System.out.print("Enter the target Sum: ");
        int target = sc.nextInt();

        int[] res = pairSum(arr, target);
        System.out.print(res[0] + ",");
        System.out.print(res[1]);
    }
}
