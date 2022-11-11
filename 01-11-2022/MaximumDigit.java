//Write a program to find out the maximum among three numbers.

package basicprogram;

import java.util.Scanner;

public class MaximumDigit {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int num1,num2,num3;
	System.out.println("Enter three numbers:");
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	
	if(num1>num2)  // External 
	{
		if(num1>num3)  //internal
		{
			System.out.println(num1+ "is Greater.");
		}
		else   // internal else
		{
			System.out.println(num3+ " is Greater.");
		}
	}
	else     // External else
	{
		if(num2>num3)   // internal if
		{
			System.out.println(num2+ " is Greater.");
		}
		else  // internal else
		{
			System.out.println(num3+ " is Greater.");
		}
	}	
}    
}
