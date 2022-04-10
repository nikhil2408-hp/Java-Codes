package inheritance;
class calculator
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
class calcadv extends calculator
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}
class calcvery extends calcadv
{
	public int multi(int i,int j)
	{
		return i*j;
	}
}
class calcveryadv extends calcvery
{
	public double divide(int i,int j)
	{
		return (double)i/j;
	}
}
public class inheritancedema {
	public static void main(String args[])
	{ calcveryadv c1=new calcveryadv();
	  int result1=c1.add(4,2);
	  int result2=c1.sub(4,2);
	  int result3=c1.multi(4,2);
	  double result4= c1.divide(4,3);
	  System.out.println(result2);
	  System.out.println(result1);
	  System.out.println(result3);
	  System.out.println(result4);
		}

}
