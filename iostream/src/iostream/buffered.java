package iostream;
import java.io.*;

public class buffered {
	public static void main(String args[]) throws Exception
    { FileOutputStream fout =new FileOutputStream("D:/nnn/input.dat");
    BufferedOutputStream bout=new BufferedOutputStream(fout);
     String s="hello people";
     byte b[]=s.getBytes();
     bout.write(b);
     bout.flush();
     bout.close();
     fout.close();
    
     
		
	}
}
