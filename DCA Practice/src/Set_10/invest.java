package Set_10;
import java.util.*;

public class invest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int dd = sc.nextInt();sc.nextLine();
		String mm = sc.nextLine();
		sc.close();
		int[] dates = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] months = {"January", "Febraury", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		int i = 0;
		for( i = 0; i<12; i++) {
			if(months[i].equals(mm)) {
				break;
			}
		}
		int cnt = 183-(dates[i]-dd);
		while(cnt>0) {
			if(cnt>dates[i]) {
				cnt -= dates[i];
				i++;
			}else if(cnt<dates[i]) {
				//cnt = dates[i]-cnt;
				cnt++;
				break;
			}
			i = i%12;
		}
		System.out.print(cnt + " " + months[i+1]);
		 
		
	}

}
