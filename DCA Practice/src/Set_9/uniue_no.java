package Set_9;

import java.util.Arrays;
import java.util.Scanner;

public class uniue_no {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int top = sc.nextInt();
		int bot = sc.nextInt();
		sc.close();
		int count = 0;
		boolean visit[] = new boolean[10];
		for(int i = top; i<bot; i++) {
			int num = i;
			
			//{false,false,false,false,false,false,false,false,false,false};
			Arrays.fill(visit, false);
			
			while(num != 0) {
				if(visit[num%10] == true) break;
				visit[num%10] = true;
				num /= 10;
			}
			if(num == 0) {
				count++;
			}
		}
		if(count>0) System.out.println(count);
		else System.out.println("No Unique Number");
	}
}
