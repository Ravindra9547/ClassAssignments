//Write a program to print details of student using method.
package oopsconcept;
import java.util.Scanner;
class Student
{
int id;
String name,address,course;
float fees;

void setData(int i,String n,String add,String c,float f)  //method
{
	id=i;
	name=n;
	course=c;
	address=add;
	fees=f;
}
   void displayData()  //method
   {
	   System.out.println("Id:"+id);
	   System.out.println("Name:"+name);
	   System.out.println("Address:"+address);
	   System.out.println("Course:"+course);
	   System.out.println("Fees:"+fees);
   
   }
}//end of class
public class MethodDemo {
public static void main(String []args)
{
	 int id,n,i;
	 String name,course,address;
	 float fees;
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number of Student you want to enter:");
	 n=sc.nextInt();
	 
	 for(i=1;i<=n;i++)
	 {
		 System.out.println("======================");
		 System.out.print("Enter id:");
		 id=sc.nextInt();
		 
		 sc.nextLine();  //it will consume the delimiter(enter)
		 
		 System.out.print("Enter Name:");
		 name=sc.nextLine();
		 System.out.print("Enter address:");
		 address=sc.nextLine();
		 System.out.print("Enter course:");
		 course=sc.nextLine();
		 System.out.print("Enter fees:");
		 fees=sc.nextFloat();
		 
		 System.out.println("------------------------");
		 //anonymous object creation
		 Student obj=new Student();
		 obj.setData(id, name, address, course, fees);
		 obj.displayData();
	 }
	/* Student ravindra=new Student();
	 ravindra.setData(101,"Ravindra","Delhi","Java Full Stack",1200.0f); //calling/invoke method
	 ravindra.displayData();
	 
	 System.out.println("--------------------");
	 Student shiva=new Student();
	 shiva.setData(102,"Shiva","Delhi","Java",1200.0f);
	 shiva.displayData();
      */
}
}

