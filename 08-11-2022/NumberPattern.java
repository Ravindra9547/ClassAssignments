/*Write a program to print pattern like 
 *  1       1234
 *  12      123
 *  123     12
 *  1234    1
 *  and
 *  1       4444
 *  22      333
 *  333     22
 *  4444    1
*/
package basicprogram;

public class NumberPattern {
public static void main(String []args)
{
	int i,j; // declare variable
	for(i=1;i<=4;i++)    // here loop print row 
	{
	  for(j=1;j<=i;j++)  // here loop print column  
	 {
	  System.out.print(j);   //print pattern in number form
	 }
	  System.out.println("");    //print new line after one row
	}
	
	
	for(i=3;i>=1;i--)    // here loop print row
	{
	  for(j=1;j<=i;j++)  // here loop print column  
	 {
	  System.out.print(j);   //print pattern in number form
	 }
	  System.out.println();    //print new line after one row
	}
	
	System.out.println("-----");
	for(i=1;i<=4;i++)    // here loop print row 
	{
	  for(j=1;j<=i;j++)  // here loop print column 
	 {
	  System.out.print(i);   //print pattern in number form
	 }
	  System.out.println();    //print new line after one row
	}
	

	for(i=3;i>=1;i--)    // here loop print row 
	{
	  for(j=1;j<=i;j++)  // here loop print column 
	 {
	  System.out.print(i);   //print pattern in number form
	 }
	  System.out.println();    //print new line after one row
	}
}
}