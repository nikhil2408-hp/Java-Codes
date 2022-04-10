package frame;
import java.awt.*;

public class textareademo {
	public textareademo() {
		Frame f=new Frame("nikhil");
		TextArea t1=new TextArea("welcome to bit "
				+ " online classes");
		t1.setBounds(100,100,100,100);
		f.add(t1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new textareademo();
	}

}
