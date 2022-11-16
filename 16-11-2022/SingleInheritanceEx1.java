// Example of Single Inheritance

package oopsconcept;

class Parent
{
	void parentMethod()
	{
		System.out.println("This is parent class method.");
	}
}

class Child extends Parent
{
	void childMethod()
	{
		System.out.println("This is child class method.");
	}
}
public class SingleInheritanceEx1 {
public static void main(String []args)
{
	Child obj=new Child();
	obj.parentMethod();
	obj.childMethod();
}
}
