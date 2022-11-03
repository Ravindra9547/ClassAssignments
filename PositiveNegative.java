//Write a program to check whether the number is positive or negative.

package basicprogram;

import java.util.Scanner;

public class PositiveNegative {
public static void  main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter a number:");
	num=sc.nextInt();
	
	if(num>0)
		System.out.println("The given number is Positive.");
	else
		System.out.println("The given number is Negative.");
		
}
}
