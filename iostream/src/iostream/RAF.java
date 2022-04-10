package iostream;
import java.io.*;

public class RAF {
	public static void main(String args[])
	{
		try {
			RandomAccessFile file=new RandomAccessFile("D:/nnn/invent.dat","rw");
			file.writeChar('x');
			file.writeInt(234);
			file.writeDouble(34.456);
			System.out.println(file.readChar());
			System.out.println(file.readInt());
			System.out.println(file.readDouble());
			file.seek(0);
			System.out.println(file.readInt());
			file.seek(file.length());
			file.writeBoolean(true);
			file.seek(4);
			file.close();
		}
		catch(IOException e) 
		
		
		
		
		{}
 }

}
