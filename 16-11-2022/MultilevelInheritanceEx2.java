//Example of Multilevel Inheritance simple program.

package oopsconcept;
class AA //base class
{
	int i,j;
	
	void showij()
	{
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}
class BB extends AA   //intermediate/derived class
{
	int k;
	void showk()
	{
		System.out.println("k="+k);
	}
	void Sum()
	{
		System.out.println("i+j+k="+(i+j+k));
	}
}
class CC extends BB  // derived class
{
	int l;
	void showl()
	{
		System.out.println("l="+l);
	}
	void Mul()
	{
		System.out.println("i*j*k*l="+(i*j*k*l));
	}
}
public class MultilevelInheritanceEx2 {
public static void main(String []args)
{
	CC obj=new CC();
	obj.i=3;
	obj.j=4;
	obj.k=5;
	obj.l=6;
	obj.showij();
	obj.showk();
	obj.showl();
	obj.Sum();
	obj.Mul();
	
}
}
