public class PrefixSum {
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] PrifixSum(int[] arr) {
        int n = arr.length;
        // int[] prefix = new int[n];
        // prefix[0] = arr[0];

        // for (int i = 1; i < n; i++) {
        //     prefix[i] = prefix[i-1] + arr[i];
        // }
        // return prefix;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        print(arr);

        // int[] pref = PrifixSum(arr);
        // print(pref);

        int[] ans = PrifixSum(arr);
        print(ans);
    }
}
