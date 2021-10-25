package Set_8;
import java.util.*;

public class oary_culture{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0, y = 0 ,z =100;
		for(int i =1; i<=n; i++) {
			z = i%4;
			if(z == 1) {
				x += i*10;
			}else if(z == 2) {
				y += i*10;
			}else if(z == 3) {
				x -= i*10;
			}else if(z == 0){
				y -= i*10;
			}
		}
		System.out.println(x + " " + y);
	}
}
