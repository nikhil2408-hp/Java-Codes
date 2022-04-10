package superdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Fungame {
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();//b
		Stack<Integer> stack1 = new Stack<Integer>();//a
	    List<Integer> list=new ArrayList<>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		
		stack1.add(3);
		stack1.add(2);
		stack1.add(1);
		
		while(stack.isEmpty()==false && stack1.isEmpty()==false) {
			if(stack.peek()>stack1.peek()) {
				stack1.pop();
				list.add(2);
			}
			else if(stack.peek()<stack1.peek()) {
				stack.pop();
				list.add(1);
			}
			
			else {
				stack.pop();
				stack1.pop();
				list.add(0);
			}
			
			
		}
		
		int[] arr = list.stream().mapToInt(i->i).toArray();;
		
		for(Integer x: arr) {
			System.out.println(x);
		}
		
		System.out.println(arr.length);
		
		
	}

}
