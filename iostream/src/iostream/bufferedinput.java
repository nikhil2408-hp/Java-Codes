package iostream;
import java.io.*;

public class bufferedinput {
	public static void main(String args[])
	{  try {
		FileInputStream fin=new FileInputStream("D:/nnn/output.dat");
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i=0;
		while((i=bin.read())!=-1) {
			System.out.print((char)i);
			}
		bin.close();
		fin.close();
	}
	catch(IOException e) {}
	}

}
