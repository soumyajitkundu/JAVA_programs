import java.io.*;
import java.util.Scanner;
class Addition
{
	public static void main(String args[])throws IOException
	{

		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter two other numbers ");
		a=Integer.parseInt(args[0]);		
		b=Integer.parseInt(br.readLine());
		c=sc.nextInt();
		d=a+b+c;
		System.out.println("The result after addition is : "+d);
	}
}

