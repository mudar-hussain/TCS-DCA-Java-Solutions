package Set_7;
import java.util.*;

public class time_machine {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year>=1700 && year<=1917) {
			if(year%4 == 0){
				System.out.print("12.9."+year);
			}else System.out.print("13.9."+year);
			
		}else if(year==1918) {
			System.out.print("10.10.1918");
		}else if(year>1918) {
			if(year%4 == 0 && year%100 != 0){
				System.out.print("12.9."+year);
			}else System.out.print("13.9."+year);
		}
	}

}
