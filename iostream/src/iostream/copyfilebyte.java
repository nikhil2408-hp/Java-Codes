package iostream;
import java.io.*;

public class copyfilebyte {
	public static void main(String args[])
	{
		FileInputStream infile=null;
		FileOutputStream outfile=null;
		byte bytereads;
		try {
			infile=new FileInputStream("D:/nnn/input.dat");
			outfile=new FileOutputStream("D:/nnn/oute.dat");
			bytereads=(byte)infile.read();
			while(bytereads!=-1)
			{
				outfile.write(bytereads);
				bytereads=(byte)infile.read();}
			}
			catch(IOException e)
			{
				System.out.print(e);
			}
			finally {
				try {
					infile.close();
					outfile.close();
				}
				catch(IOException e) {}
			}
			
		}
	}


