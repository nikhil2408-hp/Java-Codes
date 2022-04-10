package functionzlinterfce;
interface abc
{
   void show();
}

public class funtional {
 public static void main(String args[])
 {
	 abc obj=() ->System.out.println("i am best");
	 obj.show();
	 
 }
}
