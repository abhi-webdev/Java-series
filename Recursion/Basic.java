import java.util.*;

public class Basic {

    static void printIncreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);   // 1,2,3,4.....(n-1)
        System.out.println(n);  // n
        
    }
    public static void main(StringRecurision[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
