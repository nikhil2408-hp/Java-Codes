package javaxswing;
import javax.swing.*;
import java.awt.event.*;

public class jtextfield implements ActionListener {
	  
	  JLabel l1,l2,l3;
	  JTextField t1,t2,t3;
	  JButton b1,b2,b3,b4;
	  jtextfield(){
		  JFrame f=new JFrame();
		  JLabel l1=new JLabel("First Number");
		  JLabel l2=new JLabel("Second Number");
		  JLabel l3=new JLabel("Result");
		  JTextField t1=new JTextField(5);
		  t1.setBounds(50,50,150,20);
		  JTextField t2=new JTextField(5);
		  t2.setBounds(50,100,150,20);
		  JTextField t3=new JTextField(7);
		  t3.setBounds(50,150,150,20);
		  JButton b1=new JButton("+");
		  b1.setBounds(50,200,50,50);
		  JButton b2=new JButton("-");
		  b2.setBounds(120,200,50,50);
		  JButton b3=new JButton("*");
		  b3.setBounds(190,200,50,50);
		  JButton b4=new JButton("/");
		  b4.setBounds(260,200,50,50);
		  f.setLayout(null);
		  f.add(l1);f.add(t1);f.add(l2);f.add(t2);f.add(l3);f.add(t3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);
		  f.setSize(600,600);
		  f.setVisible(true);
		  b1.addActionListener(this);
		  b2.addActionListener(this);
		  b3.addActionListener(this);
		  b4.addActionListener(this);
	  }
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		String msg;
		int f1,f2,f3=0;
		String s1=t1.getText();
		String s2=t2.getText();
		f1=Integer.parseInt(s1);
		f2=Integer.parseInt(s2);
		if(str.equals("+"))
				f3=f1+f2;
		else if(ae.getSource()==b2)
			f3=f1-f2;
		else if(ae.getSource()==b3)
			f3=f1*f2;
		else if(ae.getSource()==b4)
			f3=f1/f2;
		msg=String.valueOf(f3);
		t3.setText(msg);
	}
	  public static void main(String args[]) {
		  new jtextfield();
	  }

}
