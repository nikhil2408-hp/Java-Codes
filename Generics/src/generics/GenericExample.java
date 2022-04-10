package generics;
class Demo<T,U>{
	T obj1;
	U obj2;
	Demo(T obj1,U obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
   public void print() {
	   System.out.println(obj1.getClass().getSimpleName());
	   System.out.println(obj2.getClass().getSimpleName());
   }
	
}

public class GenericExample {
	public static void main(String args[]) {
		Demo<String,Integer> de=new Demo<String,Integer>("Nikhil",24);
		de.print();
	}

}
