package iostream;
import java.io.*;

public class fileinputstream {
  public static void main(String args[])
  {
	  try {
		  FileInputStream fi=new FileInputStream("D:/nnn/m.txt");
		  int i=0;
		  while((i=fi.read())!=-1) {
		System.out.print((char)i);}
          fi.close();
	  }
	  catch(IOException e)
	  {
		  System.out.println(e);
	  }
  }

}
