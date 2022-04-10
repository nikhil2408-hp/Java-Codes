package threademo;

public class lamdaexpression {
	public static void main(String args[])
	{
		Thread t1=new Thread(() ->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("hi");
				try{Thread.sleep(1500);} catch(Exception e) {}
			}
		});
	   Thread t2=new Thread(() ->
	 {
		 for(int i=0;i<5;i++)
		 {
			 System.out.println("hello");
			 try{Thread.sleep(1500);} catch(Exception e) {}
			 
		 }
	 });
	// Thread t1=new Thread(obj1);
	// Thread t2=new Thread(obj2);
	 t1.start();
	 try{Thread.sleep(1500);} catch(Exception e) {}
	 t2.start();
	 
		
	}

}
