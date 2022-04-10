package threademo;


public class joinisalive {
	public static void main(String args[])throws Exception
	{
		Thread t1=new Thread(() ->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("hi");
				try{Thread.sleep(1500);} catch(Exception e) {}			}
		},"hi thread");
	   Thread t2=new Thread(() ->
	 {
		 for(int i=0;i<5;i++)
		 {
			 System.out.println("hello");
			 try{Thread.sleep(1500);} catch(Exception e) {}
			 
		 }
	 },"hello Thread");
	
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	 t1.start();
//	 Thread.sleep(1500);
	 t2.start();
	// System.out.println(t1.isAlive());
	 t1.join();
	 t2.join();
	 System.out.println(t2.isAlive());
	 System.out.println("Bye");
	 
		
	}
}
