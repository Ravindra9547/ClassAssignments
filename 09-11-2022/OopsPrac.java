//example without using  this keyword using method(class and object)
/*package oopsconcept;

class test {

	int age=18;
	String name= "Rupu"; //instance variable
	void show()
	{
		System.out.println(age+"  "+name);
		}
	
}

public class OopsPrac {
public static void main(String []args)
{
	test rups=new test();
	rups.show();
}
}*/
package oopsconcept;
import java.util.Scanner;
class test
{
		int age,num,id;
		String name,course;
	     void setData(int n,int ids,int ag,String na,String cs) {
	    	num=n; 
	    	id=ids;
	        age=ag;
	        name=na;
	        course=cs;
	     }
	    void displayData () {
	    
	    	System.out.println("Student ids:"+id);
	    	System.out.println("Student ag:"+age);
	    	System.out.println("Student na :"+name);
	    	System.out.println("Student cs :"+course);
	    }
	   }   //end of class
            public class OopsPrac {
            public static void main(String []args)
       {
            	
	    		   int id,num,age;
	    		   String name,course;
	    		   Scanner sc=new Scanner(System.in);
	    		
	    			System.out.print("Enter no of student:");
	    			   num=sc.nextInt();
	    			System.out.println("==>==>==>==>==>==>==>==>==>==>");
	    			for(int i=1;i<=num;i++) 
	    			{
	    			
	    			System.out.print("Enter id of student:");
	     		    id=sc.nextInt();
	    			System.out.print("Enter age of student:");
	     		    age=sc.nextInt();
	     		   
	     		    sc.nextLine(); // delimeter
	    			System.out.print("Enter name of student:");
	     		    name=sc.nextLine();
	    			System.out.print("Enter course of student:");
	     		    course=sc.nextLine();
	     		   System.out.println("----------------------------");
	     		   test obj=new test();
	     		   obj.setData(num,id,age,name,course);
	     		   obj.displayData();    	
	    			}	    	 
	     }
}

