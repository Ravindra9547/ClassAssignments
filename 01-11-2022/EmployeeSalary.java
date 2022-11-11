/*Write a program to input basic salary of an employee and calculate its 
  gross salary according to following:
  Basic salary <=10000: HRA=20%, DA=80%
  Basic salary <=20000: HRA-25%,DA=90% Basic salary >20000: HRA-30%,DA=95%
  hra =20% = basic salary*20/100:
  Gross salary: basic salary+hra+da;
*/
package basicprogram;

import java.util.Scanner;

public class EmployeeSalary {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	float basicsalary,hra,da,grosssalary;
	System.out.println("Enter basic salary of an employee:");
    basicsalary=sc.nextFloat();

    // Calculate D.A and H.R.A according to specified conditions 
    if(basicsalary <= 10000)
    {
        da  = basicsalary * 80/100;
        hra = basicsalary * 20/100;
    }
    else if(basicsalary <= 20000)
    {
        da  = basicsalary * 90/100;
        hra = basicsalary * 25/100;
    }
    else
    {
        da  = basicsalary * 95/100;
        hra = basicsalary * 30/100;
    }

    // Calculate gross salary 
    grosssalary = basicsalary + hra + da;

    System.out.println("Gross Salary of Employee is = "+ grosssalary);
	
}
}
