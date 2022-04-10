package layout;
import java.awt.*;
//import java.io.*;

public class gridlayout2 {
   gridlayout2(){
	   Frame f=new Frame("Login page");
	   Label l1,l2,l3;
	   TextField t1,t2,t3;
	   Button b1,b2;
	   l1=new Label("Enter your Name");
	   l2=new Label("Enter your Roll no");
	   l3=new Label("Enter your marks");
	   t1=new TextField(8);
	   t2=new TextField(8);
	   t3=new TextField(8);
	   b1=new Button("Done");
	   b2=new Button("Enter");
	   f.add(l1);f.add(t1);f.add(l2);f.add(t2);f.add(l3);f.add(t3);f.add(b2);f.add(b1);
	   f.setLayout(new GridLayout(4,2));
	   f.setVisible(true);
	   f.setSize(300,300);
	   }
   public static void main(String args[]) {
	   new gridlayout2();
   }
}
