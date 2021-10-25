package Set_3;
import java.util.*;

public class Vowels {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		int total = 0;
		for(int i = 0; i<in.length(); i++) {
			if(in.charAt(i) == 'a' || in.charAt(i) == 'A' ||in.charAt(i) == 'e' || in.charAt(i) == 'E' || in.charAt(i) == 'i' || in.charAt(i) == 'I' || in.charAt(i) == 'o' || in.charAt(i) == 'O' || in.charAt(i) == 'u' || in.charAt(i) == 'U') {
				total++;
			}
		}
		System.out.println(total);
	}
}
