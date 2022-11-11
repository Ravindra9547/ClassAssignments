//Write a program to take 3 integer type variables from user and add them.

package basicprogram;

import java.util.Scanner;

public class Addition {
public static void main(String []args)
{
	int a,b,c,add;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 integer type variables:");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	add=a+b+c;
	System.out.println("The addition of 3 variables are:"+a+ "," +b+" and "+ c+" is:"+ add);
	
}
}
