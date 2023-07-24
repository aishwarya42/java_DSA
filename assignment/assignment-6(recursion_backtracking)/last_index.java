import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        index(arr,0,tar,-1);
    }

     public static void index(int [] arr, int i, int tar,int ans){
        if(i==arr.length-1){
            if(arr[i] == tar){
            ans = i;
            }
            System.out.println(ans);
             return;
        }
        if(arr[i] == tar){
            ans = i;
        }
      index(arr,i+1,tar,ans);
    }
}
