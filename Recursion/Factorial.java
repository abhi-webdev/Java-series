public class Factorial {
    static int printFactorial(int n) {
        if (n == 0) return 1;
        int ans = n * printFactorial(n-1);
        
        return ans;
    }
    public static void main(StringRecurision[] args) {
        int n = 5;
        int res = printFactorial(n);
        System.out.println(res);
    }
}
