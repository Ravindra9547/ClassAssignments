/*Write a program to print star pattern
 *1.up side 
 *2.down side
*/
package basicprogram;
import java.util.Scanner;
public class UpSideDownSideStarPattern {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int i,j,rows;            // declare variable 
	System.out.print("Please enter number of rows:");  //taking input from user
	rows=sc.nextInt();
	//up side pattern
	for(i=1;i<=rows;i++)     // here loop print row
	{
	  for(j=1;j<=i;j++)      // here loop print column
	  {
	    System.out.print(" *");   //print * here in pattern
	  }
	    System.out.println();      //print new line after one row
	}
	
	//down side pattern
	for(i=1;i<=rows;i++)    // here loop print row 
	{
	  for(j=rows-1;j>=i;j--)  // here loop print column 
	 {
	  System.out.print(" *");   //print * here in pattern
	 }
	  System.out.println();    //print new line after one row
	}
}
}

