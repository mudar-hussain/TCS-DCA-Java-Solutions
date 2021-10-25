package Set_8;
import java.util.*;
import java.math.*;
public class series2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1 || n==0) {
			System.out.println('1');
		}else {
			if(n%2 == 0) {
				System.out.println((int)Math.pow(3, n-(n/2)-1));
			}else{
				System.out.println((int)Math.pow(2, n-(n/2)-1));
			}
		}
	}
}
