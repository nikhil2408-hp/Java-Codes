package iostream;
import java.io.*;
//import java.lang.*;

public class bufferreader  {
public static void main(String args[]) throws IOException {
	//System.out.println("Enter your name");
	InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ir);
	//int a=Integer.parseInt(br.readLine());
	    String str=br.readLine();
  System.out.println(str);
	}
}
