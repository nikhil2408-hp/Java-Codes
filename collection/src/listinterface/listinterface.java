package listinterface;

import java.util.ArrayList;
import java.util.List;

public class listinterface {
	public static void main(String args[])
	{
		List<Integer> val=new ArrayList<>();
		val.add(7);
		val.add(3);
		val.add(6);
		
		for(Object o:val)
		{
			System.out.println(o);
		}
		
	}

}
