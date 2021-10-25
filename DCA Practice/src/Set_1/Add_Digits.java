package Set_1;
import java.util.*;

public class Add_Digits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum = 0;
		while(n!=0) {
			sum += n%10;
			n = n/10;
			
		}
		System.out.println(sum);
	}
}
