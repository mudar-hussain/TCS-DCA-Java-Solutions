package Set_9;
import java.util.*;
import java.lang.*;

public class String_Length {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int flag = 0;
		
		for(int i = 1; i<in.length(); i++) {
			if(in.charAt(in.length()-i)>= '0' && in.charAt(in.length()-i)<= '9') {
			if(((in.substring(0,in.length()-i)).length())==Integer.parseInt(in.substring(in.length()-i))) {
				flag = 1;
				break;
			}
			}else break;
		}
		if(flag == 1) {
			System.out.println("Yes");
		}else 
			System.out.println("No");
		
	}

}
