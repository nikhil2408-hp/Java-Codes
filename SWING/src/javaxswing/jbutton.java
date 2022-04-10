package javaxswing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jbutton {
	public static void main(String args[]) {
		JFrame f=new JFrame("Button Example");
		JButton b=new JButton("Click me");
		b.setBounds(50,100,100,100);
		JTextField t=new JTextField();
		t.setBounds(100,200,200,30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				t.setText("WELCOME TO BIT");
			}
		});
		f.add(b);f.add(t);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
