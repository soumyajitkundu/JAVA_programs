class First
{
	int x=5;
	void show()
	{
		
		System.out.println("Method called from main");
		
	}
	public static void main(String args[])
	{
		First ob=new First();
		System.out.println(ob.x);		
		ob.show();
	}
}
		
