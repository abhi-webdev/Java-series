public class Gap {
    public static void main(String[] args) {
        // 100, 96, 92, 88
        for (int i = 100; i > 0 ; i--) {
            System.out.print(i + " ");
            i = i - 3;
        }
    }
}
