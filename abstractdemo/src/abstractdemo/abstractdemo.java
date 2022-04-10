package abstractdemo;
 abstract class writer
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
class pen extends writer
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}
class pencil extends writer
{
	public double divide(int i,int j)
	{
		return (double)i/j;
	}
}
class printer
{
	public void show(Number i)
	{
		System.out.println(i);
	}
}

public class abstractdemo {
	public static void main(String args[])
	{
		printer obj=new printer();
		obj.show(5.54);
		pen obj1=new pen();
		pencil obj2=new pencil();
		System.out.println(obj1.add(4,3));
		System.out.println(obj1.sub(5,4));
		System.out.println(obj2.divide(5,3));
	}

}
