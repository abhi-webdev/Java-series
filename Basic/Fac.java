package Basic;

import java.util.Scanner;

public class Fac {
    static int factorial(int n){
        if (n == 0) return 1;
        int ans = n * factorial(n-1);
        return ans ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = factorial(n);
        System.out.println(res);
    }
}
