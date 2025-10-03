public class MaximumNo {
    public static void main(String args[]) {
    // maximum no from the array
        int[] arr= {2,3,9,4,1,4,8};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number is: " + max);
    }
}
