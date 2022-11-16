//Example of Multilevel Inheritance 

package oopsconcept;
class BaseClass  //base class/super class
{
	int id;
	String name,address;
	
	public BaseClass(int id,String name,String address)   //constructor set value
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	/*public BaseClass()
	{
		super();
	}*/
	void displayData()  //method
	   {

		   System.out.println("Id:"+id);
		   System.out.println("Name:"+name);
		   System.out.println("Address:"+address);
	   }
}

	class ChildClass1 extends BaseClass
	{
		float marks;
		public ChildClass1(int id,String name,String address,float marks)
		{
		    super(id,name,address);   //super keyword
			this.marks=marks;
		}
		void displayData()
		{
			super.displayData();
			System.out.println("Marks:"+this.marks);//80.0f :for current class variable
		}
	}
	class  ChildClass2 extends ChildClass1
	{
		long Phno;
		public ChildClass2(int id,String name,String address,float marks,long Phno)
		{
			super(id,name,address,marks);
			this.Phno=Phno;
		}
		void displayData()
		{
			super.displayData();
			System.out.println("Phone number:"+Phno);
		}
	}

public class MultilevelInheritanceEx1 {
public static void main(String []args)
{
	ChildClass2 obj=new ChildClass2(1,"Ravindra","Delhi",80.0f,998877665);
	obj.displayData();
	
}
}
