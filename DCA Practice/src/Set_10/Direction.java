package Set_10;
import java.util.*;

public class Direction {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toUpperCase();
		int sum1 = 0, sum2 = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == 'N') {
				sum1++;
			}else if(str.charAt(i) == 'S') {
				sum1--;
			}else if(str.charAt(i) == 'E') {
				sum2++;
			}else if(str.charAt(i) == 'W') {
				sum2--;
			}
		}
		if(sum1 == 0 && sum2 == 0)
			System.out.println("Returned Successfully");
		else 
			System.out.println("Not Returned Successfully");
	
	}
}
