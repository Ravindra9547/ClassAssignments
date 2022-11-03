//Write a program to find out the given number is Odd or Even.

package basicprogram;

import java.util.Scanner;

public class EvenOddNumber {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter a Number to check Even or Odd:");
	num=sc.nextInt();

	if(num%2==0)
	   System.out.println(num+ " is Even number.");
	else
		System.out.println(num+ " is Odd number.");
		
}
}

