//Write a program to check the number is Strong number or not.
//example 145=1!+4!+5!=1+24+120=145

package basicprogram;
import java.util.Scanner;
public class StrongNumber {
public static void main(String  []args)
{
        int num,temp,rem,i,sum=0;  // declare and initialize variables
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");   // taking input from user
        num=sc.nextInt();
        temp=num;                  // assign num value in temp
        
        while (num>0)  //145>0  14>0 1>0
        {
            rem=num%10;   // holding remainder
            int fact=1;   
            for(i=1;i<=rem;i++)  //loop from 1 to <=rem
            {
                fact*=i;    //fact=fact*i :calculate factorial
            }
            sum+=fact;     
            num=num/10;
        }
        if (temp==sum)  //print Strong number if temp is equal to sum
          {
              System.out.println(sum+" is Strong Number");  //output
          }
        else 
          {
             System.out.println(sum+" is not a Strong Number");  //output
          }
} 

}

