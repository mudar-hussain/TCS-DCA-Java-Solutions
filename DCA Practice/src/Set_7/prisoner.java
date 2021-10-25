package Set_7;
import java.util.*;

public class prisoner {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr= new int[t];
		for(int i = 0; i<t; i++) {
			int n = sc.nextInt();
			int ca = sc.nextInt();
			int st = sc.nextInt();
			arr[i] = saveThePrisoner(n,ca,st);
		}
		for(int i = 0; i<t; i++) {
		System.out.println(arr[i]);
		}
	}
	public static int saveThePrisoner(int n, int ca, int st) {
		int res = 0;
		if((ca+st-1)%n == 0) {
			res = 0;
		}else res = (ca+st-1)%n;
		
		return res;
	}
}
