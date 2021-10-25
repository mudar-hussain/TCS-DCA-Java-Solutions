package Set_9;
import java.util.*;

public class fre {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		for(int i = 0; i<10; i++) {
			int count = 0;
			for(int j = 0; j<in.length(); j++) {
				if(in.charAt(j) == (char)(i+'0')) count++;
			}
			System.out.print(count+" ");
		}
	}

}
