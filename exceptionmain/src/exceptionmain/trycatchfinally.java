package exceptionmain;

public class trycatchfinally {
	public static void main(String args[])
	{
		try
		{  // int b[]=null;
		   // b[4]=8;
			//int a[]=new int[6];
		   //a[6]=5;
			int i=7;
			int j=0;
			int k=i/j;
			System.out.println("output is"+k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("stay in your limit");
		}
		catch(Exception e)
		{
			System.out.println("something wrong..");
		}
		finally
		{
			System.out.println("bye");
		}
	}

}
