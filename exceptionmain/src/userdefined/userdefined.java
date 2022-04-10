package userdefined;

public class userdefined {
 public static void main(String args[])
 {
	 int i,j;
	 i=7;
	 j=9;
	 try
	 {
		 int k=i/j;
		 if(k==0)
			 throw new NikhilException(" this is not possible");
		 System.out.println(k);
	 }
	 catch(NikhilException e)
	 {
		 System.out.println("error"+e.getMessage());
	 }
 }
}
