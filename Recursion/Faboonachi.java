public class Faboonachi {
    static int fib(int n) {
        if (n == 0 || n == 1 ) {
            return n;
        }
        int prev = fib(n-1);
        int againPrev = fib(n-2);
        return prev + againPrev;
    }
    public static void main(StringRecurision[] args) {
        for (int i = 0; i < 10; i++) {
            
            System.out.println(fib(i));
        }

        System.out.println("Fab of 6th : "+fib(6));
    }
}
