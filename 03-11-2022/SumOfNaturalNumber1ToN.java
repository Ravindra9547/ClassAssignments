//Write a program print sum of natural number from 1 to n.

package basicprogram;

import java.util.Scanner;

public class SumOfNaturalNumber1ToN {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int n,sum=0,i;
	System.out.println("Enter range:");
	n=sc.nextInt();
	
	for(i=1;i<=n;i++)   // ++i; no change in loops
	{
		sum=sum+i;  // sum+=i;
		
	}
	  System.out.println("Sum of natural number from 1 to "+n+" is: "+sum);
}
}
