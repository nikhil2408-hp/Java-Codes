package iostream;
import java.io.*;
public class sequenceinput {
	public static void main(String args[])throws Exception
	{
		FileInputStream input1=new FileInputStream("D:/nnn/input.dat");
		FileInputStream input2=new FileInputStream("D:/nnn/output.dat");
		SequenceInputStream inst=new SequenceInputStream(input1,input2);
		int j=0;
		while((j=inst.read())!=-1) {
			System.out.print((char)j);
				}
		inst.close();
		input1.close();
		input2.close();
		
	}

}
