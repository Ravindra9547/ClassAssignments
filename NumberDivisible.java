//Write a program to find out given is divisible by 5 and 11 or not.

package basicprogram;

import java.util.Scanner;

public class NumberDivisible {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter a Number:");
	num=sc.nextInt();
	if((num%5==0) && (num%11==0))
    
        System.out.println("Number is divisible by 5 and 11.");
    
    else
        System.out.println("Number is not divisible by 5 and 11.");
    

}
}
