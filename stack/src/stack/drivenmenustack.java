package stack;
import java.util.*;
public class drivenmenustack {
	  int a[]={0,0,0,0,0};
	    int top=-1;
	    int amax=5;
	    Scanner s=new Scanner(System.in);
	public void pop() {
		if(top==-1)
			System.out.println("Underflow");
		else {
			a[top]=0;
			top=top-1;
			System.out.println("After poping element=");
			for(int k=0;k<5;k++) {
				System.out.println(" "+a[k]);
			}
		}
	}
	public void display() {
		System.out.print("Array in code=");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
	}
	    
	 public void push()
	{    System.out.println("Enter the item you want to push=");
		 int item=s.nextInt();
	   if(top>=(amax-1)) {
		   System.out.println("Overflow");
	   }
	   else {
		   top=top+1;
		   a[top]=item;
		   System.out.println("After pushing "+item+" in Stack");
		   for(int i=0;i<5;i++) {
			   System.out.println(" "+a[i]);
		   }
	   }
	}
	public void peep() {
		System.out.println("Enter which index number element you want=");
		int j=s.nextInt();
		System.out.println("number at entered index is "+a[j]);
	}
	public static void main(String args[]) {
		drivenmenustack obj=new drivenmenustack();
	    Scanner sc=new Scanner(System.in);
		System.out.println("STACK OPERATIONS");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.peep");
		System.out.println("4.display");
		System.out.println("Enter your choice=");
		int choice=sc.nextInt();
		if(choice==1)
			obj.push();
		else if(choice==2)
			obj.pop();
		else if(choice==3)
			obj.peep();
		else if(choice==4)
			obj.display();
		else
			System.out.println("Invalid Input");
		sc.close();
		}
	
}




























