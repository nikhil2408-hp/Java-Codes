



package encapsulation;







class student
   
{
	private int rollno;
	private String name;
	public int getRollno() {
		System.out.println("user is acessing the value");
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("value of roll no changed");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class encapsulationdemo {
	public static void main(String args[])
	{
		student s1=new student();
		s1.setRollno(2);
		s1.setName("Navin");
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
	}

}
