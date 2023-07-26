import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        subsequence(s,"");
        System.out.print("\n"+count);
    }

    static int count = 0;

    public static void subsequence(String ques, String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            count++;
            return;
         }
         char ch = ques.charAt(0);
         subsequence(ques.substring(1),ans);
         subsequence(ques.substring(1),ans+ch);
         
    }
}
