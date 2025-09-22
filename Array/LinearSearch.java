public class LinearSearch {
    // Find the element x in array 
    public static void main(String[] args) {
        int[] arr = {2,4,5,10,34,54,7,8};
        int x = 3;
        Boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag = true;
                System.out.println("Found Elemet: " + i);
            }   
        }
        System.out.println(flag); 
    }
}
