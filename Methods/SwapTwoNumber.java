package Methods;

public class SwapTwoNumber {

    public static void Swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " b: " + b);
    }
    public static void main(String[] args) {
        // int num1 = 3;
        // int num2 = 4;
        Swap(5, 6);
    }
}
