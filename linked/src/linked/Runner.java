package linked;

 public class Runner {
	static LinkedList list=new LinkedList();
	public static void main(String args[]) {
     
     list.insert(7);
     list.insert(45);
     list.insert(14);
     list.insertAtFirst(25);
     list.insertAt(3,28);
     list.insertAt(4,33);
     list.deleteLast();
     
     
     list.show();
}
}