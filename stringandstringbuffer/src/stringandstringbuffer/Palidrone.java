package stringandstringbuffer;
import java.util.Scanner;
public class Palidrone {
	
	
	public static void main(String args[]) {
		System.out.print("Enter Any String=");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] word=str.toCharArray();
		int n=word.length,count=0;
		int x=n;
		for(int i=0;i<=(x/2);i++) {
			if(word[i]==word[n-1]) {
				n=n-1;
				count=+1;
				}
		}
		if(count==(n/2))
			System.out.println("Your Enter String is Palidrone");
		else
			System.out.println("Your Entered String is not Palidrone");
		sc.close();
		
	}

}
