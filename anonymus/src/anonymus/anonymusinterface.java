package anonymus;
interface abc
{
	void show();
}
public class anonymusinterface {
	public static void main(String args[])
	{
		abc obj=new abc()
	        {
		public void show()
		{
			System.out.println("i am best");
		}
	};
  obj.show();
}
}