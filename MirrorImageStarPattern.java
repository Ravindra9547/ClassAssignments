/*Write a program to print pattern of
 *1.upside mirror  image 
 *2.down side mirror image
 *3.full diamond shape
 */
package basicprogram;
import java.util.Scanner;
public class MirrorImageStarPattern {
public static void main(String[] args)  	
{  
	int rows,i,j,k;     // declare variables
	Scanner sc=new Scanner(System.in);
	System.out.print("Please enter number of Rows:");   // taking input from user
	rows=sc.nextInt();
	// upside mirror pattern
	for (i=1;i<=rows;i++)    //outer loop for number of rows
	{  
	  for (j=1;j<=rows-i;j++)  //inner loop for number of columns and space
	  {  
	    System.out.print(" ");  //print space
	  }  
	  for (k=1;k<=i;k++)     //start printing star after space
	  {  
	    System.out.print(" *");  //print *
	  }   
	  System.out.println();    //print new line after each row
	}  
	  // down mirror pattern
	for (i=rows-1;i>=1;i--)   //outer loop for number of rows
	{  
	  for (j=rows;j>i;j--)    //inner loop for number of columns and space
	  {  
	    System.out.print(" ");  //print space
	  }  
	  for (k=1;k<=i;k++)    //start printing star after space
	  {  
	     System.out.print(" *");   //print *
	  }  
	     System.out.println("");  //print new line after each row
	}  
}  
	  
}
