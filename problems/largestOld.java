package problems;

import java.sql.SQLOutput;

public class largestOld {
    public static void main(String[] args) {
        String s="4252";
        System.out.println(largestOddNumber(s));
    }

    public static String  largestOddNumber(String num) {
        int i=num.length()-1;
        StringBuilder sb=new StringBuilder(num);
        while(i>=0){
            if(sb.charAt(i)%2!=0) return sb.toString();
            else{
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
}
