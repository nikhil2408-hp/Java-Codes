package threademo;
class example
{
	synchronized static void display() {
		Thread g=Thread.currentThread();
		   for(int i=0;i<5;i++) {
			   try{Thread.sleep(1000);} catch(Exception e) {}
			   System.out.println("Thread-"+g.getName()+i);
		   }
	}
}
class t extends Thread{
	public void run() {
		example.display();
	}
}

public class synchronizedbock {
	public static void main(String args[]) {
		t t1=new t();
//		t t2=new t();
		t t3=new t();
		t1.start();
//		 t2.start();
		t3.start();
		
	}

}
