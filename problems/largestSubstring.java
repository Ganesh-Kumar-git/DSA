package problems;

public class largestSubstring {
    public static void main(String[] args) {
        String str="ojdncpvyneq";
        System.out.println(maxLengthBetweenEqualCharacters(str));;
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
       int ans []=new int [26];
       int maxlength=-1;
       for(int i=0;i<s.length();i++){
           int indx=s.charAt(i)-'a';

           if(ans[indx]>0){
               maxlength=Math.max(maxlength,i-ans[indx]);
           }
           else{
               ans[indx]=i+1;
           }
       }
       return maxlength;
    }

}
