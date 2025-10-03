public class SecondLargest {
    public static int SecondLarge(int[] arr){
         int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,4,8,6};
        // int[] arr = {10,10,10};
        System.out.println(SecondLarge(arr));
    }
}
