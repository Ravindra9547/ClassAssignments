//Write a program to print details of student using method.using method 
package oopsconcept;
import java.util.Scanner;
class Students
{
	// instance variable	
	int id;
	String name,address,course;
	float fees;

	void setData(int id,String name,String address,String course,float fees)  //parameter variable
	{
		this.id=id;
		this.name=name;
		this.course=course;
		this.address=address;
		this.fees=fees;
		//System.out.println("this keyword:"+this);
		//this.displayData();
		displayData();  //compiler automatically add this ex, this.displayData();
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
public class AnotherDemo {
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
		 
		 //anonymous object creation
		 System.out.println("------------------------");
		 new Students().setData(id, name, address, course, fees);
		// Students obj=new Students();
		// obj.setData(id,name,address,course,fees);
		// System.out.println("obj object:"+obj);
		// System.out.println("------------------------");
		// obj.displayData();
	 }

}
}