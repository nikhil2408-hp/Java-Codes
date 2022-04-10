package defaultinterface;
interface demo
{
	void abc();
	default void show()
	{
		System.out.println("ina a show");
	}
}
class nikhil implements demo
{
    public void abc()
    {
    	System.out.println("in abc");
    }
}

public class defaultcdemo {
	public static void main(String args[])
	{
		demo obj=new nikhil();
		obj.abc();
		obj.show();
	}

}
