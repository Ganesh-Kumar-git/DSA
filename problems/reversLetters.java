package problems;

public class reversLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String s) {
//            StringBuilder n=new StringBuilder(s);
        char n []=s.toCharArray();
            int i=0,j=n.length-1;
            while(i<=j){
                if(Character.isAlphabetic(n[i]) && Character.isAlphabetic(n[j])){
                    char temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                    i++;j--;
                }
                else if(!Character.isAlphabetic(n[i])){
                    i++;
                }
                else if(!Character.isAlphabetic(n[j])){
                    j--;
                }
            }
            return new String(n);

    }
}
