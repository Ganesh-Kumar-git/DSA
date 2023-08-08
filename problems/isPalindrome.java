package problems;

public class isPalindrome {

    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));

    }
    public static boolean isPalindrome(int num){
        int comp=num;
        if(num>=0){
        int temp=0;
        while(num>0){
            temp=temp*10 + num%10;
            System.out.println(num);
            System.out.println(temp);
            num=num/10;

        }
        return comp==temp?true:false; }
        return false;
    }
}
