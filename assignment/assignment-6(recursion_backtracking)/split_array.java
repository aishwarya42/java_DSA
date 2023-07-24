import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        split(arr,0,0,"",0,"");
        System.out.println(count);
    }
    static int count=0;
     public static void split(int[] arr, int i, int sum1, String ans1,int sum2, String ans2) {
        if (i == arr.length) {
            if (sum1 == sum2) {
                count++;
                System.out.println(ans1 + "and" + ans2);
            }
            return;
        }
            split(arr, i + 1, sum1 + arr[i], ans1 +arr[i]+" ", sum2, ans2);
            split(arr, i + 1, sum1, ans1, sum2 + arr[i], ans2 + " "+arr[i]);

        }
}
