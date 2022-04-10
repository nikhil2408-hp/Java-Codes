package overide;
class A
{
	public void show()
	{
		System.out.println("in A");
	}
}
class B extends A
{
	public void show()
	{   //overide
		super.show();
		System.out.println("in B");
	}
}

public class overide {
	public static void main(String args[])
	{
		B obj=new B();
		obj.show();
	}

}
