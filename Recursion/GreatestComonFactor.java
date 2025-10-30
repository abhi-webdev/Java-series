public class GreatestComonFactor {
        // static int gcd (int x, int y){
        //     while (x%y != 0) {
        //         int rem = x%y;
        //         x = y;
        //         y = rem;
        //     }
        //     return y;
        // }

        static int gcd (int x, int y){
            if (y == 0) return x;
            return gcd(y, x%y);
        }
    public static void main(StringRecurision[] args) {
        int ans = gcd(24, 15);
        System.out.println("Greatest Common factor is : " + ans);
    }
}
