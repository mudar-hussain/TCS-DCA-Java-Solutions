package Set_9;
import java.util.*;

public class remove756 {
	public static void main(String ags[]) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	sc.close();
	for(int i = 0; i<str.length(); i++) {
		if(str.charAt(i) == '7') {
			str = str.substring(0,i)+str.substring(i+1);
		}else if(str.charAt(i) == '6' && i>0 && str.charAt(i-1) == '5') {
			str = str.substring(0,i-1)+str.substring(i+1);
		}
	}
	System.out.println(str);
	
	}
}
