import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        index(arr,tar,0);
    }

    public static void index(int arr[], int tar, int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==tar){
            System.out.print(i+" ");
            
        }
        index(arr,tar,i+1);
    }
}
