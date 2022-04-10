package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class stud implements Comparable<stud>
{
	int rollno,marks;
	String name;
	public stud(int rollno, int marks, String name) {
		
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	public int compareTo(stud s)
	{
		return name.length()>s.name.length()?1:-1;
	}
	
	
}

public class compare {
	

	public static void main(String args[])throws Exception
	{
		List<stud> studs =new ArrayList<>();
	    
		studs.add(new stud(23,67,"nikhil"));
		studs.add(new stud(24,78,"mahesh"));
		studs.add(new stud(25,45,"harsh"));
		studs.add(new stud(26,79,"bin"));
        Collections.sort(studs,(i,j) -> i.marks>j.marks?1:-1);
		for(stud s: studs)
		{
			System.out.println(s);
		}
	}
}
