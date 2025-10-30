public class Power {
    // static int pow(int p, int q){
    //     if (q == 0) {
    //         return 1;
    //     }

    //     int ans = pow(p, q-1) * p;
    //     return ans;
    // }

    // alternate Approach 
    static int pow(int p, int q){
        if (q == 0) {
            return 1;
        }
        int smallPow = pow(p, q/2);

        if (q % 2 == 0) {
            return smallPow * smallPow;
        } else {
            return p * smallPow * smallPow;
        }
    }
    public static void main(StringRecurision[] args) {
        int p = 2;
        int q = 5;
        int res = pow(p, q);
        System.out.println(res);
    }
}
