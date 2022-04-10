package iostream;
import java.io.*;

public class mergingoffile {
	public static void main(String args[])throws Exception
	{
		FileInputStream file1=new FileInputStream("D:/nnn/input.dat");
		FileInputStream file2=new FileInputStream("D:/nnn/output.dat");
		SequenceInputStream file3=new SequenceInputStream(file1,file2);
		BufferedInputStream inbuffer=new BufferedInputStream(file3);
		BufferedOutputStream outbuffer=new BufferedOutputStream(System.out);
		int ch=0;
		while((ch=inbuffer.read())!=-1) {
			outbuffer.write((char)ch);
			}
		inbuffer.close();
		outbuffer.close();
		file3.close();
		file1.close();
		file2.close();
	}

}
