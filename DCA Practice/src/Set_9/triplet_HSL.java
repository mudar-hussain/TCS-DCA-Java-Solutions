package Set_9;
import java.util.*;

public class triplet_HSL {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		in = in.toUpperCase();
		int count = 0;
		for(int i =0; i<in.length()-2; i++) 
			if(in.charAt(i) == 'H') 
				for(int j =i+1; j<in.length()-1; j++) 
					if(in.charAt(j) == 'S') 
						for(int k =j+1; k<in.length(); k++)
							if(in.charAt(k) == 'L') count++;
		System.out.println(count);
	}
}
