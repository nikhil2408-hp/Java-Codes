package frame;
import java.awt.*;

public class Mylabel {
	public static void main(String args[]) {
		Frame f=new Frame();
		Label l1=new Label("line1");
		l1.setBounds(100,100,50,50);
		Label l2 =new Label("line2");
		l2.setBounds(100,150,50,50);
		f.add(l1);
		f.add(l2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		}

}
