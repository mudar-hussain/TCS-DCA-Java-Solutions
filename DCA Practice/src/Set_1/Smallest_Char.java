package Set_1;
import java.util.*;

public class Smallest_Char {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		char c = 'z';
		for(int i = 0; i<input.length(); i++) {
			if(c>input.charAt(i)) {
				c = input.charAt(i);
			}	
		}
		System.out.println(c);
		
	}
}
