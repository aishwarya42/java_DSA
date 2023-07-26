 import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            pi(s,"","pi");
            System.out.println();
        }

    }
   public static void pi(String ques, String ans,String p){
        if(ques.length()<2 ){
            System.out.print(ans+ques.charAt(ques.length()-1)+" ");
            return;
        }
        char ch = ques.charAt(0);
       if(ch=='p'){
            String s = ques.substring(0,2);
            if(s.equals(p)){
                pi(ques.substring(2),ans+3.14,p);
                }

            }
        else {
           pi(ques.substring(1), ans + ch, p);
       }

    }
}
