package collectionclass;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class collectionclass {
	public static void main(String args[])
	{
		List<Integer> val=new ArrayList<>();
		val.add(7);
		val.add(3);
		val.add(6);
		val.add(5);
		Collections.sort(val);
		//Collections.reverse(val);
		Collections.singletonList(val);
		
		for(Object o:val)
		{
			System.out.println(o);
		}
		
	}
}
