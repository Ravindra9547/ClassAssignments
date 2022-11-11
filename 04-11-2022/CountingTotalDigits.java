//Write a program to count number of digits in a number.
//using while loop

package basicprogram;

import java.util.Scanner;

public class CountingTotalDigits {
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	int count=0,n;
	System.out.println("Enter a number to count:");  // input number from user
	n =sc.nextInt();
	
	while(n!=0)      // run loop till n is greater than 0
	{
		count++;     // incrementing digit count
		n=n/10;      // remove last digit of 'n'
	}
	System.out.println("The Total number o Digits =" +count); //display the total digit/output 
}
}