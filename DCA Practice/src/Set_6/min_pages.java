package Set_6;
import java.util.*;

public class min_pages {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		sc.close();
		System.out.print(Math.min(p/2, n/2-p/2));
	}

}
