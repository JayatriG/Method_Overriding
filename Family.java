class Parent
{
	void override(int i, String name)
	{
		System.out.println("Name of father is "+ name);
		System.out.println("Value of i: "+(i*2));
	}
}
class Child extends Parent
{
	void override(int i, String name)
	{
		System.out.println("Name of child is "+ name);
		System.out.println("Value of i: "+(i*10));
	}
}
public class Family
{
	public static void main(String args[])
	{
		Parent p=new Parent();
		Child c=new Child();
		p.override(4,"William");
		c.override(3,"George");
	}
}
		