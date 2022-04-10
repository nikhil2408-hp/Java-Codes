package serialization;
import java.io.*;
class StudentInfo implements Serializable{
	String name;
	int roll;
	String contact;
	StudentInfo(String n,int r,String c){
		this.name=n;
		this.roll=r;
		this.contact=c;
	}
}

public class Serealizationinjava {
	public static void main(String args[]) {
		try {
			StudentInfo si=new StudentInfo("Nikhil",45689,"Plot no 34,Jawahar Nagar");
			FileOutputStream fo=new FileOutputStream("D://file3.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fo);
			oos.writeObject(si);
			oos.flush();
			oos.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		   System.out.println(e);
		}
		System.out.println("Writted SuccessFully");
	}

}
