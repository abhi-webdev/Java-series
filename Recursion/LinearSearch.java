public class LinearSearch {

    // Find all index 
    static void findAllIndex(int[] arr, int n, int target, int idx){
        // base work
        if (idx >= n) {
            return;
        }

        // self work
        if (arr[idx] == target) {
            System.out.println(idx);
        }

        // recursive work
        findAllIndex(arr, n, target, idx+1);
    }

















    static boolean linearSearch(int[] arr, int n, int target, int idx){
        // base case 
        if (idx >= n) {
            return false;
        }
        // self work
        if (arr[idx] == target) {
            return true;
        }

        // recursive work
        // if (linearSearch(arr, n, target, idx+1)) {
        //     return true;
        // } else {
        //     return false; 
        // }
        return linearSearch(arr, n, target, idx+1);
    }
// Return index of array element 
    static int findIndex(int[] arr, int n, int target, int idx){
        // base case 
        if (idx >= n) {
            return -1;
        }
        // self work
        if (arr[idx] == target) {
            return idx;
        }

        
        return findIndex(arr, n, target, idx+1);
    }
    public static void main(StringRecurision[] args) {
        /*
        int[] arr = {2,3,4,5,6,7,8};
        int target = 6;
        int n = arr.length;
        // return boolean 
        // if (linearSearch(arr,n, target, 0)) {
        //     System.out.println("Yes");
        // } else {
        //     System.out.println("No");
        // }

        // return index 
        System.out.println(findIndex(arr, n, target, 0));
*/


        int[] arr = {3,2,4,2,2,7,8};
        int target = 2;
        int n = arr.length;

        findAllIndex(arr, n, target, 0);





    }
}
