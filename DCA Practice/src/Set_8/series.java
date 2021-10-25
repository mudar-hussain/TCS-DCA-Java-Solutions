package Set_8;
import java.util.*;

public class series {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1 || n==0) {
			System.out.println('0');
		}else {
			if(n%2 == 0) {
				System.out.println(6*(n-(n/2)-1));
			}else{
				System.out.println(7*(n-(n/2)-1));
			}
		}
	}
}
