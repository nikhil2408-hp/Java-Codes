package frame;
import java.awt.*;

public class textfielddemo {
	
		public textfielddemo() {
		
		Frame f=new Frame();
		TextField t1=new TextField("welcome to bit");
		t1.setBounds(100,100,100,100);
		TextField t2=new TextField("online classes");
		t2.setBounds(100,150,100,100);
		f.add(t1);
		f.add(t2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
		public static void main(String args[])
		{
			new textfielddemo();
		}

}
