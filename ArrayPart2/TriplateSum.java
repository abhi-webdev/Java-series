import java.util.Scanner;

public class TriplateSum {

    public static int[] triplatePrint(int[] arr, int target){
        int n = arr.length;
        int[] ans = new int[3];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if(arr[i] + arr [j] + arr[k] == target){
                        ans[0] = i;
                        ans[1] = j;
                        ans[2] = k;
                    }
                }
            }
        }
        return ans;
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

        System.out.print("Enter the target Sum: ");
        int target = sc.nextInt();
        
        int[] res = triplatePrint(arr, target);
        System.out.print(res[0] + ",");
        System.out.print(res[1] + ",");
        System.out.print(res[2]);
    }
}
