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
        int tar = sc.nextInt();
       index(arr,0,tar);
    }

 public static void index(int arr[], int i, int tar){
        if(i==arr.length){
            System.out.println(-1);
            return;
        }
        if(arr[i]==tar){
             System.out.println(i);
             return;
        }
        index(arr,i+1,tar);
    }
}
