public class PrintRecursibly {
    static void recursivilyPrint(int[] arr, int idx) {
        // base case
        if (idx == arr.length) {
            return;
        }

        // self work 
        System.out.println(arr[idx]);

        // recursive work -> Sub problem 
        recursivilyPrint(arr, idx+1);
    } 

    static int maxArray(int[] arr, int idx) {
        if (idx == arr.length-1) {
            return arr[idx];
        }

        int smallAns = maxArray(arr, idx+1);

        return Math.max(arr[idx], smallAns );
    } 
    public static void main(StringRecurision[] args) {
        int[] arr = {5,9,7,8}; 
        // recursivilyPrint(arr, 0);
        System.out.println(maxArray(arr, 0));
    }
}
