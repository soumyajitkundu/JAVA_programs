import java.util.Scanner;
class Cone
{
	double rad;
	double height;
	Cone()
	{
		rad=0;
		height=0;
	}
	Cone(double r, double h)
	{
		rad=r;
		height=h;
	}
	void vol()
	{
		System.out.println("The volume is "+((3.14)*rad*rad*(height/3)));
	}
	void area()
	{
		System.out.println("The area is "+((3.14)*rad*(rad+(Math.sqrt((rad*rad)+(height*height))))));
	}
}

class MyCone
{
	public static void main(String args[])
	{
		Cone c1=new Cone();
		c1.vol();
		c1.area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius and height of the second cone");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		Cone c2=new Cone(a,b);
		c2.vol();
		c2.area();
	}
}
		
		
	






