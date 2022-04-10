package stack;
import java.util.*;

public class Balancedbracket {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		test:
			for(int i=0;i<t;i++) {
				String s=in.next();
				Stack<Character> stack=new Stack<>();
				for(char c:s.toCharArray()) {
					if(c=='[')
						stack.push(']');
					else if(c=='{')
						stack.push('}');
					else if(c=='(')
						stack.push(')');
					else {
						if(stack.isEmpty() || c!=stack.peek()) {
							System.out.println("NO");
							continue test;
						}
						else
							stack.pop();
					}
				}
				if(stack.isEmpty())
					System.out.println("YES");
				//else
					//System.out.println("NO");
			}
		in.close();
	}

}
