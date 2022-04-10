package iostream;
import java.io.*;

public class intersetcalculator {
	public static void main(String args[])throws Exception
	{
		Float pa; 
		Float ri;
		int years;
		DataInputStream in= new DataInputStream(System.in);
		String tstring;
		System.out.println("enter principle amount=");
		System.out.flush();
		tstring=in.readLine();
		pa=Float.valueOf(tstring);
		System.out.println("enter rate of interest");
		System.out.flush();
		tstring=in.readLine();
		ri=Float.valueOf(tstring);
		System.out.println("Enter number of years");
		System.out.flush();
		tstring=in.readLine();
		years=Integer.parseInt(tstring);
		double interamount;
		interamount=pa*ri*years/100;
		System.out.println("Interset amount="+(double)(interamount)); 
		
		
		
		
	}

}
