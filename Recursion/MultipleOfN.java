public class MultipleOfN {
    static void firstNMultiple(int n , int k) {
        if (k==1) {
            System.out.println(n);
            return;
        }
        firstNMultiple(n, k-1); 
        System.out.println(n*k);

    }
    public static void main(StringRecurision[] args) {
        firstNMultiple(3, 8);
    }
}
