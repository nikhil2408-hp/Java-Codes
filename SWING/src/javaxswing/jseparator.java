package javaxswing;
import javax.swing.*;
public class jseparator {
	JMenu menu,submenu;
	JMenuItem i1,i2,i3,i4;
	jseparator(){
		JFrame f=new JFrame();
	    JMenuBar mb =new JMenuBar();
		JMenu menu =new JMenu("Menu");
		i1=new JMenuItem("item 1");
		i2=new JMenuItem("item 2");
		menu.add(i1);menu.addSeparator();menu.add(i2);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new jseparator();
		
	}

}
