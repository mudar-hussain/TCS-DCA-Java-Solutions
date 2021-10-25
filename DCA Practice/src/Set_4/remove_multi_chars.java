package Set_4;
import java.util.*;

public class remove_multi_chars {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		String result = "";
		for(int i = 0; i<in.length(); i++) {
			if(in.charAt(i)=='7') {
				continue;
			}else if(i+1<in.length() && in.charAt(i) == '5' && in.charAt(i+1) == '6'){
				i++;
			}
			else {
				result += in.charAt(i);
			}
		}
		System.out.println(result);
	}
}
