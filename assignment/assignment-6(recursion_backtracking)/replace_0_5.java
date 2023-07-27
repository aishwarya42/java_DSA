import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int m = replace(n,0);
        System.out.println(reverse(m));
    }


    public static int replace(int n, int sum){
        if(n==0){
         //  System.out.println(sum);
           return sum;
        }
        int rem = n%10;
        if(rem==0){
          return  replace(n/10,sum*10+5);
        }
           return replace(n / 10, sum * 10 + rem);
    }

    public static int reverse(int m){
        int sum=0;
        while(m!=0){
            int rem = m%10;
            sum = sum*10+rem;
            m/=10;
        }
        //System.out.println(sum);
        return sum;
    }
}
