package inner;
class outer
{ int a;
 public void show()
 { System.out.println("in outer");}
 
   class inner
  { 
	 public void display()
	 { System.out.println("in display");}
  }
 
}

public class innerdemo {
 public static void main(String args[])
 { outer obj=new outer();
   outer.inner obj1=obj.new inner();
   obj1.display();
   obj.show();
   }
}