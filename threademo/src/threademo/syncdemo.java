package threademo;
class counter
{   Thread g=Thread.currentThread();
	int count=0 ;
	public  synchronized void increament()
	{
		count++;
		try{Thread.sleep(1500);} catch(Exception e) {}
		System.out.println("Thread-"+g.getName()+count);
	}
}

public class syncdemo extends Thread {
 public static void main(String args[])throws Exception
 {
	 counter c=new counter();
	 Thread t1=new Thread( () ->
	 {
		for(int i=1;i<=10;i++)
		{
			c.increament();
		}
	 });
	 t1.setName("t1");
	 Thread t2=new Thread( () ->
	 {
		for(int i=1;i<=10;i++)
		{
			c.increament();
		}
	 },"thread 2");
	 t2.setName("t2");
	 t1.start();
	 t2.start();
	 t1.join();
	 t2.join();
	 System.out.println("count "+c.count);
 }
}
