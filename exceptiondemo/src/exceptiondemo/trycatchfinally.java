package exceptiondemo;

public class trycatchfinally {
	public static void main(String[] args)
	{
		try
		{   
		    int i=7;
			int j=2;
			int k=i/j;
			System.out.println("output is k");
		}
		catch(ArthmeticException e)
		{
			System.err.println("error");
		}
		finally
		{
			System.out.println("bye");
		}
		
	}

}
