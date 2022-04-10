package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Hello {
  public static void main(String args[])throws IOException {
	 List<Integer> ranked=new ArrayList<Integer>();
	 ranked.add(100); ranked.add(100);
	 ranked.add(90);
	 ranked.add(80);
	 ranked.add(75);
	 ranked.add(60);
	 
	 List<Integer> player=new ArrayList<Integer>();
	 player.add(50);
	 player.add(65); player.add(77); player.add(90); player.add(102);
	 int count=0;
	 
	 Set<Integer> ranked1=new TreeSet<Integer>(ranked).descendingSet();
	 ranked1.addAll(ranked);
	   for (Integer x : ranked1)
           System.out.println(x);
	   
		   
		   List<Integer> result=new ArrayList<Integer>();
		   for(int i=0;i<player.size();i++) {
			   for(Integer x: ranked1) {
				   if(player.get(i)<x)
					   count+=1;
				   if(player.get(i)>x)
					   break;
	   }
			   result.add(count+1);
			   count=0;
		   }
	   
	
	   
	   for(Integer x: result)
		   System.out.println(x);
 
	 
      
	  
		}
}
