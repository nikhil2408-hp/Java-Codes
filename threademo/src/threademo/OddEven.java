package threademo;

public class OddEven {
	public static void main(String args[])throws Exception {
		Thread t1=new Thread( () -> {
			for(int i=0;i<5;i=i+2) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				}catch(Exception e) {}
			}
		});
		
		Thread t2=new Thread( () -> {
			for(int i=1;i<=5;i=i+2) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				}catch(Exception e) {}
			}
		} ); 
		t1.start();
		t2.start();
		t1.join();
		Thread.sleep(1000);
		t2.join();
		
	}

}
