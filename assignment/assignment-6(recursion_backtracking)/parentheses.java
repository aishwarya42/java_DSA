import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String ans = "";
        par(0,0,m,ans);

    }
    public static void par(int open, int close, int m, String ans){
        if(open==m && close==m){
            System.out.println(ans);
            return;
        } 

        if(close<open){
            par(open, close+1, m, ans+")");
        }
        if(open<m){
            par(open+1, close, m, ans+"(");
        }
        
    }
}
