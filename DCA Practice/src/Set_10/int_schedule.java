package Set_10;
import java.util.*;

public class int_schedule {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] start = new int[n];
		int[] end = new int[n];
		for(int i = 0; i<n; i++) {
			start[i] = sc.nextInt();
		}
		for(int i = 0; i<n; i++) {
			end[i] = sc.nextInt();
		}
		int res = 1;
		int pre = end[0];
		if(n == 1) {
			System.out.print(res);
		}else {
		for(int i = 1; i<n; i++) {
			
			if(pre <= start[i]){
				
				pre = end[i];
				++res;
			}
		}
		System.out.print(res);
		}
	}
}
