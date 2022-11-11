//Write a program using constructor.
package oopsconcept;
class Emp
{
	int id;
	String name,designation;
	double bs;
	public Emp(int id,String name,String designation,double bs)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.bs=bs;
	}
	public void display()
	{
		System.out.println("Id:"+id+ "\nName:"+name+ "\nDesignation:"+designation+
				"\nBasic Salary:"+bs);
		
	}
}
public class ConstructorDemo {
public static void main(String []args)
{
	Emp emp1=new Emp(101,"Ravindra Kumar Saw","Senior Manager",20000);
	Emp emp2=new Emp(102,"Shiva","Deputy Manager",20000);
	emp1.display();
	emp2.display();
}
}
