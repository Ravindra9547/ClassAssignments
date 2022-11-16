//Example of Hierarchical Inheritance simple program.

package oopsconcept;
class Banks
{
	int rateofInterest()
	{
		return 8;
	}
}

class Sbi extends Banks
{
	@Override    //override annotation
	int rateofInterest()  // overridden method:same name,same parameters
	{
		return 7;
	}
}

class Axis extends Banks
{
	@Override  //override annotation
	int rateofInterest()  //overridden method
	{
		return 6;
	}
}
public class HierarchicalInheritanceEx2 {
public static void main(String []args)
{
	Sbi sbi=new Sbi();
	System.out.println("Rate of Interest:"+sbi.rateofInterest()+"%");
	
	Axis axis=new Axis();
	System.out.println("Rate of Interest:"+axis.rateofInterest()+"%");
}
}
