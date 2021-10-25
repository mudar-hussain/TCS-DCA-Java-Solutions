package Set_5;
import java.util.*;

public class Unique_Digits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		int t = 0;
		for(int i = x; i<=y; i++) {
			HashSet<Integer> hs = new HashSet<Integer>();
			int cn = 0;
			if(i == 0) continue;
			while(i!=0) {
				hs.add(i%10);
				i /= 10;
				cn++;
			}
			if(cn == hs.size())
				t++;			
		}
		System.out.print(t);
		
	}

}
