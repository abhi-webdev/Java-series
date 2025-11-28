package Searching;

public class FirstOccuranceSearch {
    static int firstOccuranceNumber(int[] arr, int target){
        int st = 0;
        int end = arr.length-1;
        int ans = -1;

        while (st <= end) {
            int mid =st + (end - st)/2;
            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,5,5,5,6,6,8,9,9,9};
        int target = 5;
        System.out.println(firstOccuranceNumber(arr, target));
    }
}