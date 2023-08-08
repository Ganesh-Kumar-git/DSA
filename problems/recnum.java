package problems;

import org.w3c.dom.ls.LSOutput;

public class recnum {
    public static void main(String[] args) {
        f(5);
    }
    public static void f(int n){
       if(n==0) return ;
        System.out.println(n);
        f(n-1);
        System.out.println(n+1);
        }
    }

