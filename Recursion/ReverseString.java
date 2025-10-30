import java.util.Scanner;

public class ReverseString {
    static String stringRev(String s, int idx){
        if (idx == s.length()) {
            return "";
        }
        String smallans = stringRev(s, idx+1);
        return smallans + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(stringRev(s, 0));
    }
}
