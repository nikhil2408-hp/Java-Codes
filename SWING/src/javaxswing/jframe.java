package javaxswing;
import javax.swing.*;

public class jframe {
	jframe(){
		JFrame f=new JFrame();
		JButton b=new JButton();
		b.setBounds(50,100,100,100);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public static void main(String args[]) {
		new jframe();
	}

}
