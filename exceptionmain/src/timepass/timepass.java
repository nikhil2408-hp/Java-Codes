package timepass;

import java.util.Scanner;

public class timepass {
	public static void main(String args[])throws Exception
	{
		int a[]=new int[2];
		// a=Integer.parseInt(args[0]);
		// b=Integer.parseInt(args[1]);
		Scanner sc=new Scanner(System.in);
		try {
		for(int i=0;i<=1;i++)
			{a[i]=sc.nextInt();}
		//b=sc.nextInt();
		int k=a[0]/a[1];
		System.out.println("output is"+k);
		}
		catch(ArithmeticException e)
		{
           System.out.println("cannot divide by zero");			
		}
		
		
	}

}
