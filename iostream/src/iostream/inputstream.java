package iostream;

import java.io.FileInputStream;

import java.io.IOException;

public class inputstream {
	@SuppressWarnings("resource")
	public static void main(String args[]) throws IOException
	{
		int size = 0;
		FileInputStream fin;
		fin=new FileInputStream("D:/nikhil.java/overide/src/overide/"
				+ ""
				+ "overide.java");
		try {
			size=fin.available();
			System.out.println("total bytes:"+size);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("total bytes:"+size);
		
		
		
		
	}

}
