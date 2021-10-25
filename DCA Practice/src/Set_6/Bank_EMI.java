package Set_6;
import java.util.*;

public class Bank_EMI {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int N = sc.nextInt();
		int[] bank1_n = new int[10];
		double[]bank1_interest = new double[10];
		int x1 = sc.nextInt();
		for(int i = 0; i<x1; i++) {
			bank1_n[i] = sc.nextInt();
			bank1_interest[i] = sc.nextDouble();
		}
		int[] bank2_n = new int[10];
		double[]bank2_interest = new double[10];
		int x2 = sc.nextInt();
		for(int i = 0; i<x2; i++) {
			bank2_n[i] = sc.nextInt();
			bank2_interest[i] = sc.nextDouble();
		}
		double EMI1 = 0; 
		for(int i=0; i<x1; i++) {
			EMI1 += ((P*bank1_interest[i])/(1-(1/((1+bank1_interest[i])*(N*2))))) * bank1_n[i];
		}
		double EMI2 = 0; 
		for(int i=0; i<x2; i++) {
			EMI2 += ((P*bank2_interest[i])/(1-(1/((1+bank2_interest[i])*(N*2))))) * bank2_n[i];
		}
		if(EMI1>EMI2) System.out.println("Bank B");
		else if(EMI1<EMI2) System.out.println("Bank A");
	}
}
