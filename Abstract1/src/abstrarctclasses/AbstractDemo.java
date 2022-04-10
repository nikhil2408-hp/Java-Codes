package abstrarctclasses;
abstract class Walks{//Abstract classes is not 100% abstract as we can declare and define non abstract method inside it
	abstract public void display();
	void run() {
		System.out.println("Java is Running");
	}
}

class Person extends Walks{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello i am java");
	}
	
}

public class AbstractDemo {
	public static void main(String args[]) {
		
		Walks wa=new Person();
		wa.run();
		wa.display();
		
	}

}
