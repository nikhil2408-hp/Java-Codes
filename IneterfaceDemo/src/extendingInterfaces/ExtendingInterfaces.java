package extendingInterfaces;
interface Run{
	void run();
}
interface Walk extends Run{
	void walk();
}

class Person implements Walk{//if a class implements interface then it should include 
	//method of interface which it implements and also method of another interface which is extended
	// by interface implements in a class	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Person is running");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.print("Person is walking");
		
	}
	
}

public class ExtendingInterfaces {
	public static void main(String args[]) {
		Walk wa=new Person();
		wa.walk();
		wa.run();
	}

}
