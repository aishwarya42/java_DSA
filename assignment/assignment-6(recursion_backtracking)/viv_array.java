import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(vivek_array(arr,0,arr.length-1));
            
        }
    }

    // public static int part(int arr[], int s, int e) {
	// 	int l=0;
	// 	int r=0;
	// 	int m1=0;
	// 	int m2=0;
	// 	int sum=0;
	// 	if(s>=e) {
	// 		return 0;
	// 	}

// Solution 1
	// 	for(int i=s;i<=e;i++) {
	// 		sum+=arr[i];
	// 	}
		
	// 	for(int i=s;i<e;i++) {
	// 		l += arr[i];
	// 		r = sum-l;
	// 		if(l==r) {
	// 			m1=part(arr,s,i);
	// 			m2=part(arr,i+1,e);
	// 			return 1+Math.max(m1, m2);
	// 		}
	// 	}
	// 	return 0;
		
	// }


//  Solution 2	
	public static int vivek_array(int arr[], int si, int ei) {
        if(si>=ei) {
			return 0;
		}
		for(int i=si;i<=ei;i++) {
			int sum1 = 0;
			int sum2 = 0;
			for(int k=si; k<=i;k++) {
				sum1+=arr[k];
			}
			for(int k=i+1;k<=ei;k++) {
				sum2+=arr[k];
			}
			if(sum1==sum2) {
				int left = vivek_array(arr,si,i);
				int right = vivek_array(arr,i+1,ei);
				return Math.max(left,right)+1;
			}
		}
		return 0;
	}

}
