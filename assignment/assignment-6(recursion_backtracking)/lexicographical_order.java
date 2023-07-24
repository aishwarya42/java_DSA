import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        lex(0,n);
    }

      public static void lex(int curr, int n) {
          int i = 0;
        if (curr > n) {
            return;
        }
        System.out.print(curr + " ");
        if (curr == 0) {
            i = 1;
        }
            for (; i <=9 ; i++) {
                lex(curr * 10 + i, n);
            }
        }
    }


