package comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class compara {public static void main(String args[])
{
	List<Integer> val=new ArrayList<>();
	val.add(789);
	val.add(378);
	val.add(645);
	val.add(536);
//	Comparator<Integer> c=( i,j) ->
	//	        {
		//          return i%10>j%10?1:-1;
			//};
			
  Collections.sort(val,(i,j) -> (i%10>j%10?1:-1));
  
	
	for(Object o:val)
	{
		System.out.println(o);
	}
	 }
}
