import java.util.Scanner;
class Cyl
{
	double rad;
	double height;
	Cyl()
	{
		rad=0;
		height=0;
	}
	Cyl(double r, double h)
	{
		rad=r;
		height=h;
	}
	void circum()
	{
		System.out.println("The circumference is "+(2*(3.14)*rad*(rad+height)));
	}
	void area()
	{
		System.out.println("The area is "+(3.14*rad*rad*height));
	}
}

class MyCylinder
{
	public static void main(String args[])
	{
		Cyl c1=new Cyl();
		c1.circum();
		c1.area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius and height of the second cylinder");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		Cyl c2=new Cyl(a,b);
		c2.circum();
		c2.area();
	}
}
		
		
	
