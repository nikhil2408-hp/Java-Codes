package inheritinterface;
interface demo
{
	void abc();
	default void show()
	{
		System.out.println("in demo");
	}
}
interface mydemo
{
	default void  show()
	{
		System.out.println("in my demo");
	}
}
class demoimp implements demo,mydemo
{
	public void abc()
	{
		System.out.println("in abc");
	}
   public void show()
   {
	mydemo.super.show();   
   }
}

public class interfaceinherutdemo {
  public static void main(String args[])
  {
	  demo obj=new demoimp();
	  obj.abc();
	  obj.show();
  }
}
