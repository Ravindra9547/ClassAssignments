//Write a program to find out reverse and check palindrome of a number.

package basicprogram;

import java.util.Scanner;

public class ReverseAndPalindrome {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int n,rem,rev=0,temp;
	System.out.println("Enter numbers to Reverse:"); //taking no. from user
	n=sc.nextInt();
	temp=n;                // assigning the n value in temp
	while(n>0)            // run loop till n is smaller than 0
	{
		rem=n%10;         // holding remainder
		rev=rev*10+rem;   //create reversed number
		n=n/10;
	}
	 System.out.println("The Reversed of "+temp+" is:" +rev);  // display reversed no./output
	 
	 if(temp==rev)   // palindrome if orignalInteger(temp) and reversedInteger(rev) are equal
	     System.out.println(temp+" is Palindrome number."); 
	 else
		 System.out.println(temp+" is not Palindrome number.");
}
}
