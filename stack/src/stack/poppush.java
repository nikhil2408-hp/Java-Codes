package stack;

public class poppush {
	    int a[]={0,0,0,0,0};
	    int top=-1;
	    int amax=5;
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
	    
	 public void push(int item)
	{  
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
	public static void main(String args[]) {
		poppush obj=new poppush();
		obj.push(26);
		obj.push(7);
		obj .push(19);
		obj.pop();
		obj.pop();
		obj.push(22);
		obj.push(13);
		obj.push(17);
		
	}

}
