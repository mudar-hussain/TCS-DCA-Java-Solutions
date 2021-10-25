package Set_10;
import java.util.*;

public class UNO {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		int sum = 10000;
		int t = n;
		while(sum%10 != 1) {
			 sum = 0;
			while(t!=0) {
				sum += t%10;
				t /= 10;
			}
			if(sum == 1) {
				flag = true;
				break;
			}
			t = sum; 
		}
		if(flag) {
			System.out.println("UNO");
		}else System.out.println("NOT UNO");
	}

}
