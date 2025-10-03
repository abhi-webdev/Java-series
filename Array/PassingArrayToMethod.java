import java.util.Arrays;

public class PassingArrayToMethod {

    public static void change(int[] abhiArr){
        abhiArr[1] = 54;
        // System.out.println(Arrays.toString(abhiArr));
    }

    public static void main(String[] args) {
        int[] arr = {13,24,35,46};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);

    }
}
