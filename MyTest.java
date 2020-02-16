class Test
{
	int x=10;
	void fun()
	{
		System.out.println("Method called from different class");
	}
	
}

class MyTest
{
	public static void main(String args[])
	{
		Test ob=new Test();
		ob.fun();
		System.out.println(ob.x);
	}
}
