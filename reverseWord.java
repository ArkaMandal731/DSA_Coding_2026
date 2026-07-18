import java.util.*;
public class reverseWord {

    public static void main(String[] args) {

        String str = "Arka";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println(rev);
    }
}