package Set_5;
import java.util.*;
public class Convert_String{
	public static void main(String argv[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();
		int[] a1 = new int[100];
		int[] b1 = new int[100];
		
		
		int count = 0;
		
		a.toLowerCase();
		b.toLowerCase();
		for(int i=0; i<a.length(); i++) {
			a1[a.charAt(i)-97]++;
		}
		for(int i=0; i<b.length(); i++) {
			b1[b.charAt(i)-97]++;
		}
		for(int i = 0; i<27; i++) {
			int x = a1[i]-b1[i];
			count += (x<0)? -x:x;
		}
		
		System.out.println(count);
	}

}
