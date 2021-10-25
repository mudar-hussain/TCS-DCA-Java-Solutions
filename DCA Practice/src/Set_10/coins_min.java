package Set_10;
import java.util.Scanner;

public class coins_min {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.print(countWays(n));
}
	public static int countWays(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}else if(n == 2) {
			return 2;
		}
		return(countWays(n-1)+countWays(n-3));
	}
}
