package intrfacedemo;
class A
{
	public void show()
	{
		System.out.println("in a A");
	}
}

public class anonymus {
 public static void main(String args[])
 {
	 A obj=new A()
	        {
		 public void show()
		 {
			 System.out.println("i am best");
		 }
	         };
	        obj.show();
 }
}
