package Set_8;
import java.util.*;

public class diff {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int even = 0, odd = 0;
		for(int i = 0; i<n.length(); i++) {
			if(i%2 != 0) {
				even += (int)n.charAt(i)-'0';
			}else {
				odd += (int)n.charAt(i)-'0';
			}
		}
		System.out.println(Math.abs(even-odd));
	}
}
