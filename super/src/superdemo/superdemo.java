package superdemo;
class A
{ 
	 A() 
	{
		System.out.println("in A");
		
	}
	public A(int i)
	{
		System.out.println("in A int");
	}
}
class B extends A
{
	 B()
	{   //super();
		System.out.println("in B");
	}
	public B(int i)
	{   super(i);
		System.out.println("in B int");
	}
}


public class superdemo {
	 public static void main(String main[])
	 {
		 B obj=new B();
		 
	 }
		
	

}
