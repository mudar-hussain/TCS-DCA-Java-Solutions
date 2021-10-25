package Set_3;
import java.util.*;

public class Max_Digit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();
		int max = 0;
		while(in!=0) {
			if(max<in%10) {
				max = in%10;
			}
			in /= 10;
		}
		System.out.println(max);
		
	}
}
