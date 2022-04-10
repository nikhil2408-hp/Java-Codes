package enhanced;
class calc
{
	public int add(int...n)
	{  int sum=0;
		for(int i:n)
		{
          sum=sum+i;		
		}
       return sum;	
	}
	
	
}

public class varags {
	public static void main(String args[])
	{
		calc obj=new calc();
		System.out.print(obj.add(2,3,4));
	}

}
