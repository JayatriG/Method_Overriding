class Super
{
	void show()
	{
		System.out.println("Super Class Method");
	}
}
class Sub extends Super
{
	void show()
	{
		System.out.println("Sub Class Method");
	}
}
public class Test
{
	public static void main(String args[])
	{
		Super sup=new Super();
		sup.show();
		Sub sub=new Sub();
		sub.show();
	}
}
