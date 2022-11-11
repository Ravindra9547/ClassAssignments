//Write a program to calculate factorial of a number.
//in another method


package basicprogram;

import java.util.Scanner;

public class Factorials {
public static void main(String []args)
{
		Scanner sc=new Scanner(System.in);
		int i,num,fact=1;           //declare variables
		System.out.print("Enter a number:");       // taking input from user
		num=sc.nextInt();
		System.out.println("The Factorial of "+num+ "! is:");
		
		for(i=num;i>=1;i--)      //running loop
	 {    
		fact=fact*i;   //calculating factorial
		if(i==1)         // check condition here
			System.out.print(i+"=");
		else
			System.out.print(i+"*");
			
	 }
			System.out.println(fact);
		
}
}

