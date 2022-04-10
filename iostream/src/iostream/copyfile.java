package iostream;
import java.io.*;
public class copyfile {
	public static void main(String args[])
	{
		File infile=new File("D:/nnn/input.dat");
		File outfile=new File("D:/nnn/output.dat");
		FileReader ins=null;
		FileWriter outs=null;
		try {
			ins=new FileReader(infile);
			outs=new FileWriter(outfile);
			int ch;
			while((ch=ins.read())!=-1)
			{
				outs.write((char)ch);}
			}
			catch(IOException e)
			{
				System.out.println(e);
				System.exit(-1);
             }
			finally {
				try {
					ins.close();
					outs.close();
				}
				catch(IOException e) {}
			}
		}
		
		
	}


