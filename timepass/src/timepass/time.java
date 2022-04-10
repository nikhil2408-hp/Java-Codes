package timepass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class time {
	public static void main(String args[])
	{ Integer n=0,m=0,k=0,a=0;
	System.out.println("enter the number");
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 m=sc.nextInt();
	 k=sc.nextInt();
	 a=sc.nextInt();
		List<Integer> val=new ArrayList<>();
		val.add(n);
		val.add(m);
		val.add(k);
		val.add(a);
//		Comparator<Integer> c=( i,j) ->
		//	        {
			//          return i%10>j%10?1:-1;
				//};
				
	  Collections.sort(val,(i,j) -> (i%10>j%10?1:-1));
	  System.out.println("numbers in sorted form");
	  
		
		for(Object o:val)
		{
			System.out.println(o);
		}
		
	}

}
