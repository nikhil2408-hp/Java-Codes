package threademo;

public class Joindemo extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(450);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]) {
		Joindemo j1=new Joindemo();
		Joindemo j2=new Joindemo();
		Joindemo j3=new Joindemo();
		j1.start();
		try {
			j1.join(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		j2.start();
		j3.start();
		
	}

}
