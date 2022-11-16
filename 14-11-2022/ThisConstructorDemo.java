package oopsconcept;
class A
{
	public A()
	{
		System.out.println("this is default constructor!!");
	}
	
	public A(int a)
	{
		this(); //invoke default constructor
		System.out.println("the value of a is: "+a);
	}
	public A(float b)  // multiple constructor with function overloading
	{
		this(10);
		System.out.println("the value of b is: "+b);
	}
}
public class ThisConstructorDemo {
public static void main(String []args)
{
	A obj=new A(30.5f);
}
}
