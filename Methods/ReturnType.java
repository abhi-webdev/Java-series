package Methods;

public class ReturnType {

    public static int abhi(int a){
        System.out.println("Abhimanyu");
        if (a>0) {
            return 10;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        // abhi(7); // stand alone Calll lagaya 

        // int x = abhi(7);
        // System.out.println(3+x);

        System.out.println(abhi(-3));
    }
}
