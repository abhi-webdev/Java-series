package Searching;

public class BinarySearch {
    static boolean binaryRecursion(int[] a, int start, int end, int target ){
        if (start <= end) {
            int mid = (start + end)/2;
            if (a[mid] == target){
                return true;
            }else if (a[mid] < target) {
                start = mid+1;
                binaryRecursion(a, start, end, target);
            } else  {
                end = mid-1;
                binaryRecursion(a, start, end, target);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] a = {2,5,7,12,16,20,25,32,37};
        System.out.println(binaryRecursion(a, 0, a.length, 0));

    }
}
