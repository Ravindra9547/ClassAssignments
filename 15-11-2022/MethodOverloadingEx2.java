package oopsconcept;
import java.util.Scanner;
class Calculate
{
	void calculateSquare(float a)
    {
        System.out.println("Area of the square: "+a*a+" sq units");
    }
    void calculateRectangle(float l,float b)
    {
        System.out.println("Area of the rectangle: "+l*b+" sq units");
    }
    void calculateCircle(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of the circle: "+area+" sq units");
    }
    void calculateTriangle(float b,double h)
    {
        double area = 0.5*b*h;
        System.out.println("Area of the Triangle: "+area+" sq units");
    }
	
}
public class MethodOverloadingEx2 {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	float a,l,b;
	double r,h;
	System.out.print("Enter side :");
    a=sc.nextFloat();
	System.out.print("Enter length and breadth:");
	l=sc.nextFloat();
	b=sc.nextFloat();
	System.out.print("Enter Radius:");
	r=sc.nextDouble();
	System.out.print("Enter Height:");
	h=sc.nextDouble();
	
   	
	Calculate obj=new Calculate(); 
	 obj.calculateSquare(a);
	 obj.calculateRectangle(l,b);
	 obj.calculateCircle(r);
	 obj.calculateTriangle(b,h);
}
}