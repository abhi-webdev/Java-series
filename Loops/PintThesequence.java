package Loops;

public class PintThesequence {
    // print 10,1,9,2,3,8,4,7,5,6
    public static void main(String[] args) {
        int n = 1;
        for (int i = 10; i > 1; i--) {
            System.out.println(i);
            for (int j = n; j < 10; j++) {
                System.out.println(j);
                n = n+1;
                break;
            }
        }
    }
}
