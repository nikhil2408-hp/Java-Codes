package threademo;
class h implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hi");
			try{Thread.sleep(1500);} catch(Exception e) {}
			
		}
	}
}
class hell implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
			{
	           System.out.println("hello");
	           
	           try {Thread.sleep(1500);} catch(Exception e) {}
	           
			}
	}
}


public class rummable {
	public static void main(String args[])
	{
		h obj1=new h();
		hell obj2=new hell();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		try{Thread.sleep(1500);} catch(Exception e) {}
		t2.start();
	}

}
