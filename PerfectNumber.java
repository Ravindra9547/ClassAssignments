//Write a program find out Perfect number.

package basicprogram;
import java.util.Scanner;
public class PerfectNumber {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int num,sum=0,i;    // declare and initialize variables
	System.out.println("Please enter a number to check Perfect or Not:");//taking input from user
	num=sc.nextInt();
	
	for(i=1;i<num;i++) //loop from 1 to < num
	{
		if(num%i==0)  //using modulo:for remainder and comparing with 0
		{
			sum+=i;   //sum
		}
	}
	if(num==sum)   //print perfect number if num is equal to sum
		System.out.println(num+" is a Perfect number.");  // output
	else
	    System.out.println(num+" is not a Perfect number.");  //output
}
}
