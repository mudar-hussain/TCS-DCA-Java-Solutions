package Set_9;
import java.util.*;

public class multiplication {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		long res = n%10;
		while(n != 0) {
			n /= 10;
			if(n == 0) break;
			res *= n%10;
			
			
		}
		System.out.println(res);
	}
}
