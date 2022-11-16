//Example of Hierarchical Inheritance simple program.

package oopsconcept;
class One //base class
{
	void calcSquare(int x)
	{
		System.out.println("The Square of "+x+" is "+(x*x));
	}
}
class Two extends One  //intermediate/derived class
{
	void calcCube(int x)
	{
		System.out.println("The Cube of "+x+" is "+(x*x*x));
	}
}
class Three extends One   // derived class
{
	void calcSqrt()
	{
		int A=9;
		double R=Math.pow(A,0.5);
		System.out.println("The square root of " +A+" is "+R);		
	}
}
public class HierarchicalInheritanceEx1 {
public static void main(String []args)
{
	Two obj=new Two();
	Three ob=new Three();
	obj.calcSquare(3);
	obj.calcCube(3);
	ob.calcSqrt();
}
}
