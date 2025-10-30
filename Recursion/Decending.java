public class Decending {

    static void printDecending(int n) {
        // base work
        if (n == 1) {
            System.out.println(n);
            return ;
        }
        // self work
        System.out.println(n);

        // recursive work
        printDecending(n-1);
    }
    public static void main(StringRecurision[] args) {
        int n = 5;
        printDecending(n);
    }
}