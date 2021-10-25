package Set_4;
import java.util.Scanner;

public class digit_multi {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int res = find(n);
		if(res == 0) 
			System.out.println("Not Possible");
		System.out.println(res);
		
	}
	public static int find(int n) {
		int[] res = new int[50];
		if(n<10) {
			return n+10;
		}
		int j = 0,m=0;
		for(int i=9; i>1; i--) {
			while(n%i == 0) {
				n /= i;
				res[j++] = i;
				
				
			}
		}
		if(n>10) return -1;
		for(int i = j-1; i>=0; i--) {
			m = 10*m + res[i];
		}
		
		
		return m;
	}
}
