// Write a program to find the maximum value.

package basicprogram;

import java.util.Scanner;

public class FindMaximum {
public static void main(String []args)
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two number");
	a=sc.nextInt();
	b=sc.nextInt();
	
	if(a>b)
		System.out.println("Maximum:"+a);
	else
		System.out.println("Maximum:"+b);
		
}
}
