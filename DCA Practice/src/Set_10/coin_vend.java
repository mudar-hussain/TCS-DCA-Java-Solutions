package Set_10;
import java.util.*;

public class coin_vend {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		int res = 0;
		int total = r;
		/*while(total != 0) {
			if(total == 0) break;
			else if(total>2) {
				res++;
				total -= 2;
			}else if(total == 2) {
				total -= 2;
				res++;
			}else if(total == 1) {
			res++;
			total-=1;
		}*/
		if(r%2 == 2) {
		res += r/2;
		}else {
			res += 1;
			r--;
			res += r/2;
		}
		System.out.print(res);
	}
}
