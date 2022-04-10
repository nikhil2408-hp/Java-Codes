package Money;
interface Money{
	void run();
}
class Credits implements Money{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Amount is Credited...");
	}
	
}

class Debit implements Money{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Amount is debited...");
	}
	
}

public class Monet {
	public static void main(String args[]) {
		Money me=new Credits();
		Money ma=new Debit();
		me.run();
		ma.run();
	}

}
