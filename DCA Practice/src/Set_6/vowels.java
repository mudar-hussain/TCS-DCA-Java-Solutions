package Set_6;
import java.util.*;

public class vowels {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] vowels = {0,2,1,2,2,2,1,2,2,2,1,3,2,3,4,3,1,1,2,1,1,2,2,2,3};
		int count  = 0,j = 1,k = 0;
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]<=15) {
			count += vowels[arr[i]];
			}else if(arr[i]>15 && arr[i] < 20) {
				count += 2 + vowels[arr[i]];
			}else {
				if(arr[i]%10 == 0) {
					count += vowels[arr[i]-(4*j+k)];
					j += 2;k++;
				}
				if(arr[i]%10 != 0) {
					int x = arr[i]-arr[i]%10;
					count += vowels[x]+vowels[arr[i]-(4*j+k)];
					j += 2;k++;
				}
			}
		}
		int result = 0;
		if(count>100) {
			System.out.println("greater 100");
		}else {
			for(int a = 0; a<n; a++) {
				for(int b = n-1; b>=a; b--) {
					if(arr[a]+arr[b] == count) {
						result++;
					}
				}
			}
		}
		if(result == 0)
			System.out.println("zero");
		else if(result == 1)
			System.out.println("one");
		else if(result == 2)
			System.out.println("two");
		else if(result == 3)
			System.out.println("three");
		else if(result == 4)
			System.out.println("four");
		else if(result == 5)
			System.out.println("five");
		else if(result == 6)
			System.out.println("six");
		else if(result == 7)
			System.out.println("seven");
		else if(result == 8)
			System.out.println("eight");
		else if(result == 9)
			System.out.println("nine");
	}
}
