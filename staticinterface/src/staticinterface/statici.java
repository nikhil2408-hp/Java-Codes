package staticinterface;
interface demo
{
	int i=8;
	void show();
	static void abc()
	{
		System.out.print("hi");
	}
}

public class statici {
 public static void main (String args[])
 {
	 demo.abc();
 }
}
