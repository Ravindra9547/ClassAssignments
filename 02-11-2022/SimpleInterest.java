// Write a program to calculate simple interest.

package basicprogram;

import java.util.Scanner;

public class SimpleInterest {
public static void main(String []args)
{
	//Declaring variables
	float principle,time,rate,si;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Principle amount:");
	principle=sc.nextFloat();
	System.out.println("Enter Time:");
	time=sc.nextFloat();
	System.out.println("Enter Rate:");
	rate=sc.nextFloat();
	
	si=(principle*time*rate)/100;
	
	//calculation simple interest
	System.out.println("The Simple Interst is:" +si);
	
}
}
