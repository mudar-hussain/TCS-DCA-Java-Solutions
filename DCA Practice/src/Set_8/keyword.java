package Set_8;
import java.util.*;

public class keyword {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String in = sc.nextLine();
	sc.close();
	String res = "not ";
	String[] str = {"break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"};
	for(int i = 0; i<str.length; i++) {
		if(in.equalsIgnoreCase(str[i])) {
			res = "";
		}
	}
	System.out.println(in + " is " + res + "a keyword");
	}
}
