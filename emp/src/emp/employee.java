package emp;
class emp
{ int id;
  int salary;
  static String ceo;
  static
  { ceo="larry";
    System.out.println("in static");
  }
  
  
  public emp()
  { id=1;
    salary=3000;
    System.out.println("in construtor");
  }
  public void show()
  { System.out.println(id+":"+salary+":"+ceo);}
}

public class employee 
{  public static void main(String args[])
{
 emp navin=new emp();
 emp rahul=new emp();
 navin.show();
 rahul.show();
 }
}