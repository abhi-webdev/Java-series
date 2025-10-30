public class SumofElement {
    static int sum(int[] arr, int idx){
        // base work
        if (idx == arr.length) {
            return 0;
        }

        // recursive work
        int smallAns =  sum(arr, idx+1);

        // self work
        return smallAns + arr[idx];

    }
    public static void main(StringRecurision[] args) {
        // int[] arr = {2,3,5,20,1};
        int[] arr = {};
        System.out.println(sum(arr, 0));
    }
}
