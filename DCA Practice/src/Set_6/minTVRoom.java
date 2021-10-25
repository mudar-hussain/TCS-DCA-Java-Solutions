package Set_6;
import java.util.*;

public class minTVRoom {
	static int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r1 =sc.nextInt();
		int r2 = sc.nextInt();
		double t = sc.nextDouble();
		int res = 0;
		int i;
		for( i = n;i>=0; i--) {
			if(rent(i,n,r1,r2) >= t) {
				 res = i;
				 break;
			}
		}
		System.out.println(n-res);
	}
	public static double rent(int room, int n, int r1, int r2) {
		double res = 0;
		for(int i =1; i<=12; i++) {
			for(int j = 1; j<=days[i]; j++) {
				int p = (6-i)*(6-i) + Math.abs(j-15);
				if(p>room && p<n) {
					res += room*r2 + (p-room)*r1;
				}else if(p>room){
					res += room*r2 + (n-room)*r1;
				}else res+= p*r2;
			}
		}
		return res;
	}
}
