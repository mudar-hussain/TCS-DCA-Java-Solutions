package Set_10;
import java.util.*;

public class sq_end {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sq = n*n;
		int temp = n, len = 0;
		while(temp != 0){
			len++;
			temp /= 10;
		}
		String ss = String.valueOf(sq);
		if(ss.substring(ss.length()-len).equals(String.valueOf(n))) {
			System.out.print("Yes");
		}else System.out.print("No");
	}
}
