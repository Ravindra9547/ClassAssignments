//Example of Single Inheritance using super keyword with constructor

package oopsconcept;

class Person
{
	int id;
	String name,address;
	float marks=34.7f;
	public Person(int id,String name,String address)   //constructor set value
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void displayData()  //method
	   {
		   System.out.println("Id:"+id);
		   System.out.println("Name:"+name);
		   System.out.println("Address:"+address);
	   }
}

class StudentDetails extends Person
{
	float marks=56.07f;
	public StudentDetails(int id,String name,String address,float marks)
	{
	    super(id,name,address);   //super keyword
		this.marks=marks;
	}
	void getData()
	{
		float marks=56.7f;
		super.displayData();
		System.out.println("Local variable Marks:"+marks); //56.07
		System.out.println("StudentDetails Marks:"+this.marks);//80.0f
		System.out.println("Person Marks:"+super.marks);//34.7f
	}
}
public class SingleInheritanceEx2 {
public static void main(String []args)
{
	StudentDetails obj=new StudentDetails(1,"Ravindra","Delhi",80.0f);
	obj.getData();
}
}
