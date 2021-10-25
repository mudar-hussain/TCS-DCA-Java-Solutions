package Set_2;
import java.util.*;

public class Largest_Char {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		char A = 'A';
		for(int i = 0; i<in.length(); i++) {
			if(A<in.charAt(i)) {
				A = in.charAt(i);
			}
		}
		System.out.println(A);
	}

}
