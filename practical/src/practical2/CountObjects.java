package practical2;

public class CountObjects {
	static int count=0;
	CountObjects(){
		count+=1;
		System.out.println("Object Created"+this);//this keyword will give unique id of object
		try {
			finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		CountObjects cn=new CountObjects();
		CountObjects cm=new CountObjects();
	    CountObjects ce=new CountObjects();
	    System.out.println("Number of Objects Created: "+count);
	    
	}
	protected void finalize() throws Throwable
    {
        System.out.println("Object garbage collected : " + this);
    }

}
