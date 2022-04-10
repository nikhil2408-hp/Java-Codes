package calculator;
import java.awt.event.*;
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
public class Calculator implements ActionListener {
	//create frame
	 static JFrame f;
	//Create TextFieield 
	 static JTextField t;
	 //store operator and operands
	 String s0,s1,s2;
	 Calculator()
	 {
		 s0=s1=s2="";
	 }
	public static void main(String args[])
	{
		//create frame
		f=new JFrame("Swing Calculator");
	
	try
	{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	}
	catch(Exception e)
	{
		System.err.println(e.getMessage());
	}
	Calculator c=new Calculator();
	t=new JTextField(20);
	t.setEditable(true);
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,bp,be,beq,beq1;
	b0=new JButton("0");
	b1=new JButton("1");
	b2=new JButton("2");
	b3=new JButton("3");
	b4=new JButton("4");
	b5=new JButton("5");
	b6=new JButton("6");
	b7=new JButton("7");
	b8=new JButton("8");
	b9=new JButton("9");
	ba=new JButton("+");
	bs=new JButton("-");
	bm=new JButton("*");
	bd=new JButton("/");
	bp=new JButton("^");
	beq=new JButton("=");
	beq1=new JButton("C");
	be=new JButton(".");
	JPanel p=new JPanel();
	b0.addActionListener(c);
	b1.addActionListener(c);
	b2.addActionListener(c);
	b3.addActionListener(c);
	b4.addActionListener(c);
	b5.addActionListener(c);
	b6.addActionListener(c);
	b7.addActionListener(c);
	b8.addActionListener(c);
	b9.addActionListener(c);
	ba.addActionListener(c);
	bs.addActionListener(c);
	bm.addActionListener(c);
	bd.addActionListener(c);
	bp.addActionListener(c);
	be.addActionListener(c);
	beq.addActionListener(c);
	beq1.addActionListener(c);
	p.add(t);
	p.add(b0);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	p.add(b5);
	p.add(b6);
	p.add(b7);
	p.add(b8);
	p.add(b9);
	p.add(ba);
	p.add(bs);
	p.add(bm);
	p.add(bd);
	p.add(bp);
	p.add(be);
	p.add(beq);
	p.add(beq1);
	p.setBackground(Color.BLUE);
	f.add(p);
	f.setSize(200,200);
	f.setVisible(true);
 }
  public void actionPerformed(ActionEvent e) {
	  String s=e.getActionCommand();
	  if((s.charAt(0)>='0' && s.charAt(0)<='9') || s.charAt(0)=='.')
	  {
		  if(s1.equals(""))
			  s0=s0+s;
		  else
			  s2=s2+s;
		  t.setText(s0+s1+s2);
	  }
	  else if(s.charAt(0)=='C')
	  {
		  s0=s1=s2="";
		   t.setText(s0+s1+s2);
	   }
	  else if(s.charAt(0)=='=')
	  {
		  double ans=0;
		  if(s1.equals("+"))
			  ans=Double.parseDouble(s0)+Double.parseDouble(s2);
		  else if(s1.equals("-"))
			  ans=Double.parseDouble(s0)-Double.parseDouble(s2);
		  else if(s1.equals("*"))
			  ans=Double.parseDouble(s0)*Double.parseDouble(s2);
		  else if(s1.equals("/"))
			  ans=Double.parseDouble(s0)/Double.parseDouble(s2);
		  else if(s1.equals("^"))
			  ans=Math.pow(Double.parseDouble(s0),Double.parseDouble(s2));
	    t.setText(s0+s1+s2+"="+ans);
	    s0=Double.toString(ans);
	    s1=s2="";
  }
	  else {
		  if(s1.equals("") || s2.equals(""))
			  s1=s;
		  else {
			  double ans=0;
			  if(s1.equals("+"))
				  ans=Double.parseDouble(s0)+Double.parseDouble(s2);
			  else if(s1.equals("-"))
				  ans=Double.parseDouble(s0)-Double.parseDouble(s2);
			  else if(s1.equals("*"))
				  ans=Double.parseDouble(s0)*Double.parseDouble(s2);
			  else if(s1.equals("/"))
				  ans=Double.parseDouble(s0)/Double.parseDouble(s2);
			  else if(s1.equals("^"))
				  ans=Math.pow(Double.parseDouble(s0),Double.parseDouble(s2));
			  s0=Double.toString(ans);
			  s1=s;
			  s2="";
		  }
		  t.setText(s0+s1+s2);
	  }
}
}