//Write a program to print star pattern.
//and its down side pattern
package basicprogram;

public class StarPattern {

public static void main(String []args)
{
	int i,j; // declare variable
	//upside pattern
	for(i=1;i<=5;i++)    // here loop print row till 5
	{
	  for(j=1;j<=i;j++)  // here loop print column till 
	 {
	  System.out.print(" *");   //print * in pattern
	 }
	  System.out.println();    //print new line after one row
	}
   
	// down side pattern          
	for(i=1;i<=5;i++)    // here loop print row till 5
	{
	  for(j=4;j>=i;j--)  // here loop print column 
	 {
	  System.out.print(" *");   //print * in pattern
	 }
	  System.out.println();    //print new line after one row
	}


}
}