package frame;
import java.awt.*;

public class checkboxdemo {
	public checkboxdemo(){
       Frame f=new Frame();
       CheckboxGroup cgg=new CheckboxGroup();
       Checkbox c1=new Checkbox("C++",cgg,false);
       c1.setBounds(100,100,50,50);
       Checkbox c2=new Checkbox("Java",cgg,true);
       c2.setBounds(100,150,50,50);
       f.add(c1);
       f.add(c2);
       f.setSize(400,400);
       f.setLayout(null);
       f.setVisible(true);
	}
	public static void main(String args[]) {
		new checkboxdemo();
	}

}
