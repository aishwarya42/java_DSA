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
        int target = sc.nextInt();
        System.out.print("\n"+subset(arr,0,"",target,0));
    }

    public static int subset(int []arr, int i, String ans,int target, int sum ) {
		if(i==arr.length) {
			if(sum==target) {
				System.out.print(ans+" ");
				return 1;
			}
			return 0;
		}
		int a = subset(arr,i+1,ans+arr[i]+" ",target,sum+arr[i]);
		int b = subset(arr,i+1,ans,target,sum);
		return a+b;
	}
}
