import java.util.*;
public class Main {
    static String[] key = {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        keypad(s,"");
        System.out.println("\n"+count);
    }
    static int count=0;
public static void keypad(String ques, String ans){
    if(ques.length()==0){
        System.out.print(ans+" ");
        count++;
        return;
    }
    char ch = ques.charAt(0);
    String s = key[ch-'0'];
    for(int i=0;i<s.length();i++){
        keypad(ques.substring(1),ans+s.charAt(i));
    }
}


}
