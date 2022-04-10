package javaxswing;
import javax.swing.*;

public class menuexample {
	JMenu menu,submenu;
	JMenuItem i1,i2,i3,i4,i5;
	menuexample(){
		JFrame f=new  JFrame("welcome to Jurrasic park");
		JMenuBar mb=new JMenuBar();
		menu=new JMenu("Menu");
		submenu=new JMenu("SubMenu");
		i1=new JMenuItem("Item 1"); i2=new JMenuItem("Item 2");
		i3=new JMenuItem("Item 3"); i4=new JMenuItem("Item 4");i5=new JMenuItem("Java");
		menu.add(i1);menu.add(i2);menu.add(i3);submenu.add(i5);
		submenu.add(i4);menu.add(submenu);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public static void main(String args[]) {
		new menuexample();
	}

}
