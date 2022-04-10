package javaxswing;
import javax.swing.*;
import java.awt.event.*;

public class jpasswordfield {
	public static void main(String args[]) {
		JFrame f=new JFrame("password field");
		final JLabel l1=new JLabel();
		l1.setBounds(20,150,200,50);
		final JPasswordField value=new JPasswordField();
		value.setBounds(100,75,100,30);
		JLabel l2=new JLabel("Username");
		l2.setBounds(20,20,90,30);
		JLabel l3=new JLabel("Password");
		l3.setBounds(20,75,80,30);
		JButton b=new JButton("Login");
		b.setBounds(100,120,80,30);
		final JTextField t1=new JTextField();
		t1.setBounds(100,20,100,30);
		f.add(l1);f.add(value);f.add(l2);f.add(l3);f.add(b);f.add(t1);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String data="Username "+t1.getText();
				data+=",Password"+new String(value.getPassword());
				l1.setText(data);
			}
		});
	}
}
