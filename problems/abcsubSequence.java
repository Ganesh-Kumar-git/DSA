package problems;

public class abcsubSequence {
    public static void main(String[] args) {
        String str="abc";
        f(str,0,"");
    }
    public static void f(String str,int idx,String output){
        if(idx==str.length()){
            System.out.println("["+output+"]");
            return;
        }
        f(str,idx+1,output+str.charAt(idx));
        f(str,idx+1,output);
    }
}
