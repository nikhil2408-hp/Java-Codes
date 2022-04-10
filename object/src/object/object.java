package object;
class casio
{   public void add(int i,int j)
	{ System.out.println(i+j);}
    
    public void add(int i,int j,int k)
    { System.out.println(i+j+k);}

    public void add(double i,double j)
    { System.out.println((double)(i+j));}

}

public class object {
 public static void main(String args[])
 {  casio obj=new casio();
     obj.add(4,5);
     obj.add(8,5,4);
     obj.add(9.67, 7.89);
     
 }
 }

