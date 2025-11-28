import java.util.*;

public class StringFunction02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // length()
        String str = "Abhimanyu";
        int len = str.length();
        System.out.println(len);

        // charAt()
        String str2 = "Anand";
        char ch = str2.charAt(4);
        System.out.println(ch);


        // indexOf() -> char do index lo jo bhi first hoga
        String char1 = "Abhimanyu prajapati";
        System.out.println(char1.indexOf('A'));
        System.out.println(char1.indexOf('a'));
        System.out.println(char1.indexOf('p'));


        // CompareTo()  
        String name1 = "Kumar";
        String name2 = "Kumari";

        System.out.println(name1.compareTo(name2));

        // compareTo()

        String compare = "Abhimanyu kumar";
        System.out.println(compare.contains("many"));
        System.out.println(compare.contains("manyz"));

        // toLowerCase , toUpperCase, Concatination;

        String case1 = "Abhi kumar";
        String case2 = " prajapti";
        System.out.println(case1.toUpperCase());
        System.out.println(case1.toLowerCase());
        System.out.println(case1.concat(case2));

    }
}
