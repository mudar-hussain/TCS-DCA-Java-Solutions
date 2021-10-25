package Set_7;
import java.util.*;
import java.lang.*;

public class b_f_string {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i = sc.nextInt();
		sc.close();
		String s1 = str.substring(str.length()-i) + str.substring(0,str.length()-i);
		String s2 = str.substring(i)+str.substring(0,i);
		System.out.println(s1);
		System.out.println(s2);
		if(s1.equalsIgnoreCase(s2) == true) {
			System.out.println("1");
			
		}else System.out.println("0");
	}

}
