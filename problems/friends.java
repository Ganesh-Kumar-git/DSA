package problems;

public class friends {
    //public static int count=0;
    public static void main(String[] args) {
        System.out.println(f(3,0));

    }
    public static int f(int n,int count){
        if(n==1 || n==2) {
            count+=n;
            return count;
        }
        return f(n - 1,count)+ (n-1) * f(n - 2,count);
    }
}
