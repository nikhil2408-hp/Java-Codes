package networkinjava;
import java.net.*;
import java.io.*;

public class Server {
	public static void main(String args[]) {
		try {
			System.out.println("Waiting for Client...");
			ServerSocket ss=new ServerSocket(5000);
			Socket soc=ss.accept();
			System.out.println("Connection Established");
			BufferedReader input=new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str=input.readLine();
			PrintWriter out=new PrintWriter(soc.getOutputStream());
			out.println("Server Says"+str);
			ss.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
