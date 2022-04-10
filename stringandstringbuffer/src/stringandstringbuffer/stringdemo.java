package stringandstringbuffer;
import java.lang.*;
import java.util.Optional;

public class stringdemo {
	public static void main(String args[])throws NullPointerException {
          String str="NIKHIL";
        //  System.out.println(str.length());
          //System.out.println(str.indexOf(str));
          //System.out.println(str.charAt(3));
           String str2=str.replace("NIKHIL"," Maurya ");
          System.out.println(str2.trim());
          //System.out.println(str.toLowerCase());
          int a=str.compareTo(str2);
          System.out.println(a);
          System.out.println(str.concat(" MAURYA"));
          
	}
}
