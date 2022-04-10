package networkinjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cient {
	public static void main(String args[]) {
		try {
			System.out.println("Clientr Started");
			Socket soc=new Socket("127.0.0.1",5000);
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a string:");
			String str=in.readLine();
			PrintWriter out=new PrintWriter(soc.getOutputStream(),true);  
			out.println(str);
			BufferedReader usin=new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println(usin.readLine());
			soc.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
