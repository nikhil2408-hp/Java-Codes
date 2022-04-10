package iostream;
import java.io.File;
import java.io.IOException;
public class STATUSOFFILE 
 { public static void getpaths(File f)throws Exception
	{
	 System.out.println("name="+f.getName());
	 System.out.println	("path="+f.getPath());
	  System.out.println("parent="+f.getParent());
	 }
  public static void getinfo(File f)throws Exception
  {
	  if(f.exists())
	  {
		  System.out.println("file exits");
		  System.out.println(f.canRead()?"and is readable":"");
		  System.out.println(f.canWrite()?"and is writtable":"");
		  System.out.println("file is last modified"+f.lastModified());
		  System.out.println("file is"+f.length()+"bytes");
	  }
	  else
		  System.out.println("file does not exist");
		  
}	
  public static void main(String args[]) throws Exception
	{
		File filetocheck;
		//if(args.length>0)
		//{
			//for(int i=0;i<args.length;i++)
			//{
				filetocheck=new File("D:/nnn/m.txt");
				getpaths(filetocheck);
				getinfo(filetocheck);			
		//	}
	//	}
		
	
	//else
	//	System.out.println("usage:java file name?");

}
}