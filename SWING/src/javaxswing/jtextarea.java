package javaxswing;
import javax.swing.*;
import java.awt.event.*;

public class jtextarea implements ActionListener {
	JFrame f;
	JTextArea t1;
	JButton b1;
	JLabel l1,l2;
	jtextarea(){
		f=new JFrame();
		l1=new JLabel();
		l1.setBounds(50,25,100,30);
		l2=new JLabel();
		l2.setBounds(160,25,100,30);
        t1=new JTextArea();
        t1.setBounds(20,75,250,250);
        b1=new JButton("Count Words");
        b1.setBounds(150,350,120,30);
        b1.addActionListener(this);
		f.add(l1);f.add(l2);f.add(t1);f.add(b1);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		String text=t1.getText();
		String words[]=text.split("\\s");
		l1.setText("Words="+words.length);
		l2.setText("Character="+text.length());
	}
	public static void main(String args[]) {
		new jtextarea();
	}

}
