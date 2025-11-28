import java.util.*;

public class ImmutabilityString {
    public static void main(String[] args) {
        String s = "Hello";
        // if you want to change one perticular character from the given string;
        char ch = s.charAt(0);
        System.out.println(ch);
        //s.charAt(0) = "f"; // you can not be do like this
        // you have to change character. you should use substring method
        s = s.substring(0,2) + "y" + s.substring(3);
        System.out.println(s);
        s = "Tello";
        System.out.println(s);
    }
}
