package Set_10;
import java.util.*;

public class user_pwd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = "";
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) >='0' && str.charAt(i) <='9') continue;
			else {
				res += str.charAt(i);
			}
		}
		System.out.print(res);
	}

}
