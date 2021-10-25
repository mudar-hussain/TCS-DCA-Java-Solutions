package Set_5;
import java.util.Scanner;
public class LogicPyramid
{
  public static void main (String[]args)
  {
    int n, a = 0, b = 3,re;
    Scanner sc = new Scanner (System.in);
      n = sc.nextInt ();
    for (int i = 1; i <= n; i++)
      {
	for (int j = 1; j <= i; j++)
	  {
	    a = a + 2;
	    if (i == 1)
	      b = 3;
	    else
	      b = b + 4;
	    re = a * b;
	    int len = String.valueOf(re).length();
	    len = 5-len;
	    while(len-->0) {
	    	System.out.print("0");
	    }
	    System.out.print(re+"\t");
	  }
	System.out.println ();
      }
  }
}
