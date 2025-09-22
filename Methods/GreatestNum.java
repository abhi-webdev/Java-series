package Methods;

public class GreatestNum {
    public static int Greatest(int a, int b, int c ){
        if (a>b && a>c) {
            return a;
        } else if (b>c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int result = Greatest(10,40,20);
        System.out.println(result);
    }
}
