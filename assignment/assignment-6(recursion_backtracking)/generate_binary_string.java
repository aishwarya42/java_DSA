import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String ans = "";
        while(t>0){
            String s = sc.next();
            wild_card(s,ans);
             System.out.println();
            t--;
        }
    }

  public static void wild_card(String ques, String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch = ques.charAt(0);
            if(ch=='?'){
                wild_card(ques.substring(1),ans+0);
                wild_card(ques.substring(1),ans+1);
            }
            else{
                wild_card(ques.substring(1),ans+ch);
            }

 
    }
}
