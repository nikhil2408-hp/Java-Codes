package methodDefine;
interface Demo{
	private void display(){//private method can be defined inside interface as it is private so it is not accessed outside class
		System.out.println("call is started");
	}
	default void call() {
		display();
	}
	default void end() {//default method can also be defined inside interface and it is inherited to subclass and also not be override
		System.out.println("Call is ended");
	}
}

public class Methodininterface implements Demo {
public static void main(String args[]) {
	Demo dm=new Methodininterface();
	dm.call();
	dm.end();
}
}
