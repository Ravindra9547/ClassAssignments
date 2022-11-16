//Write a program using constructor.
package oopsconcept;
import java.util.Scanner;
class Emp
{
	int id;
	String name,designation;
	double bs;
	static String organization="Anudip";  //class/static variable
	
	//parameterized constructor : it will not return any value explicitly,implicitly
	//it will return reference of object
	public Emp(int id,String name,String designation,double bs)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.bs=bs;
	}
	
	static //static block
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter organization:");
		organization=sc.nextLine();
	}
	
	static void changeOrganization()  //change in specific variable
	{
		organization="Anudip Foundation";
	}
	public void display()
	{
		System.out.println("Id:"+this.id+ "\nName:"+this.name+"\nDesignation:"
	      +this.designation+"\nBasic Salary:"+this.bs+ "\nOrganization:"+organization);
		
	}
}
public class ConstructorDemo {
public static void main(String []args)
{
	Emp emp1=new Emp(101,"Ravindra Kumar Saw","Senior Manager",30000);
	Emp emp2=new Emp(102,"Shiva","Deputy Manager",20000);
	emp1.display();
	System.out.println("----------------------------");
	//invoke or call changeOrganiztion() method
	//Emp.changeOrganization();
	//changing object
	emp2.display();
}
}
