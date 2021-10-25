package Set_9;

import java.util.Scanner;

public class target_diff {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int count = 0;
		for(int i = 0; i<n-1; i++) {
			for(int j = n-1; j>i; j--) {
				if(Math.abs(arr[i]-arr[j]) == target)
					count++;
			}
		}
		System.out.println(count);
	}
}
