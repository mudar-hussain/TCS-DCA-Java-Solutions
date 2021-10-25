package Set_4;
import java.util.*;

public class product_of_digitd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int product = 1;
		while(n!=0) {
			product *= n%10;
			n /= 10;
		}	
		System.out.println(product);
	}
}
