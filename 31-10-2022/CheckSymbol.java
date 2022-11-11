// Write a program whether the number is character or number or zero.

package basicprogram;

import java.util.Scanner;
public class CheckSymbol {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	char ch;
	System.out.println("Enter a Symbol:");
	ch=sc.next().charAt(0);
	
	if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		System.out.println(ch+" is Character.");
		
	else if(ch>='0' && ch<='9')
	    System.out.println(ch+" is Number.");
	else
		System.out.println(ch+" is Special character.");
			
}

}
