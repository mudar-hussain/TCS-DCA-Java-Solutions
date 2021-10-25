package Set_8;
import java.util.*;


public class Three_words {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String one = sc.nextLine();
		String two = sc.nextLine();
		String three = sc.nextLine();
		Character[] vowels = {'A','E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
		for(int i = 0; i<one.length(); i++) {
			char c = one.charAt(i);
			if((c>'A' && c<='Z') || (c>'a' && c<='z')) {
			if(Arrays.asList(vowels).contains(c)==true) {
				one = one.substring(0,i)+"*"+one.substring(i+1);
			}}
		}
		for(int i = 0; i<two.length(); i++) {
			char c = two.charAt(i);
			if((c>'A' && c<='Z') || (c>'a' && c<='z')) {
			if(Arrays.asList(vowels).contains(c)!=true ) {
				two = two.substring(0,i)+"@"+two.substring(i+1);
			}
			}
		}
		three = three.toUpperCase();
		System.out.println(one+two+three);
	}

}
