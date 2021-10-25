package Set_7;
import java.util.*;

public class diff_sets {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int diff = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		for(int i =0; i<n; i++) {
			for(int j = n-1; j>i; j--) {
				if(Math.abs(arr[i]-arr[j]) == diff) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
