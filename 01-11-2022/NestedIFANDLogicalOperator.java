package basicprogram;

import java.util.Scanner;
public class NestedIFANDLogicalOperator {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int num1,num2,num3,max=0;
	System.out.println("Enter three numbers:");
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	
	if((num1>num2) && (num1>num3))
		max=num1;
	
	else if((num2>num1) && (num2>num3))
		max=num2;
	
	else if((num3>num1) && (num3>num2))
	    max=num3;
	
	System.out.println("Maximum among all three numbers is:"+ max);
}
}
