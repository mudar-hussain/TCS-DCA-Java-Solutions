package Set_9;
import java.util.*;

public class maxprofit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] st = {7,6,4,3,1};
		int min = 100000, profit = 0;;
		for(int i =0; i<st.length; i++) {
			if(st[i]<min) {
				min = st[i];
			}else if((st[i]-min)>profit) {
				profit = st[i] - min;
			}
		}
		System.out.println(profit);
	}
}
