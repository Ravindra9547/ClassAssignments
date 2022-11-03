//Write a program to find the total numbers ,average,percentage of five subjects.
// and show pass or fail if less than 300 marks.

package basicprogram;

import java.util.Scanner;
public class TotalMarks {
public static void main(String []args)
{
	float physics,chemistry,math,hindi,english,total,avg,per;  // declare variables
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks of Physics:");  // taking marks from users
	physics=sc.nextFloat();
	System.out.println("Enter marks of Chemistry:");
	chemistry=sc.nextFloat();
	System.out.println("Enter marks of Mathematics:");
	math=sc.nextFloat();
	System.out.println("Enter marks of Hindi:");
	hindi=sc.nextFloat();
	System.out.println("Enter marks of English:");
	english=sc.nextFloat();
	
	total=physics+chemistry+math+hindi+english;    // calculate total numbers
			
	System.out.println("The total marks is:" +total);
	
	avg=total/5;                                  //calculate average
	System.out.println("The average is:" +avg);
	
	per= (total/500)*100;                         // calculate percentage
	System.out.println("The percentage is:"+per +"%");
	
	if(total>=300)                            // putting condition to show pass or fail
	
	   System.out.println("Pass");
	
	else
	
		System.out.println("Fail");
	
}
}
