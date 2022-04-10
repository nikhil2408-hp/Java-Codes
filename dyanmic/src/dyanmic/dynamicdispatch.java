package dyanmic;
class A
{
	public  void show()
	{
		System.out.println("in A");
	}
}
class B extends A
{
	public void show() 
	{
        System.out.println("in B");		
	}
}
class C extends A
{
	public void show()
	{
		System.out.println("in C");
	}
}

public class dynamicdispatch {
	public static void main(String args[])
	{
		A obj1=new B();
	    obj1.show();
	    
	    obj1=new C();
	    obj1.show();
	}

}
