package Set_10;
import java.util.*;
public class phy_edu {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = 0;
		if(n == 0) {
			System.out.print("0");
		}else {
		for(int i = 1; i<n-1; i++) {
			if(arr[i-1]>arr[i] && arr[i]<arr[i+1]) res++;
		}
			System.out.print(res);
		}
	}
}
