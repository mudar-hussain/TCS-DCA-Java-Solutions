package Set_2;
import java.util.*;

public class Reverse_Order {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();
		while(in!=0) {
			System.out.print(in%10);
			in /=10;
			
		}
	}

}
