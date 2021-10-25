package Set_10;
import java.util.*;

public class adj_diff_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;
		int pre;
		while(n/10 != 0) {
			pre = n%10;
			n /= 10;
			if(Math.abs(pre-(n%10)) != 1) {
				flag = false;
				break;
			}
			
		}
		
		if(flag) {
			System.out.print("CORRECT");
		}else {
			System.out.print("INCORRECT");
		}
	}

}
