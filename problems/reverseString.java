package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseString {
    public static void main(String[] args) {
        String s=" I am happy dude ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        s=s.trim();
        List<String> ss=Arrays.asList(s.split("\\s+"));
        Collections.reverse(ss);
        return String.join(" ",ss);
    }
}
