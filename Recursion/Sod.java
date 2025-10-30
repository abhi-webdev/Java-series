public class Sod {
    static int sod(int n){
        if (n>0 && n<9) {
            return n;
        }

        return sod(n/10) + n%10;
    }
    public static void main(StringRecurision[] args) {
        int n = 12345;
        int ans = sod(n);
        System.out.println(ans);
    }
}
