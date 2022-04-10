package javaxswing;
import javax.swing.*;

public class jlist {
	jlist(){
		JFrame f=new JFrame();
		DefaultListModel<String> l1=new DefaultListModel<>();
		l1.addElement("item 1");
		l1.addElement("item 2");
		l1.addElement("item 3");
		l1.addElement("item 4");
		JList<String> list=new JList<>(l1);
		list.setBounds(100,100,75,75);
		f.add(list);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new jlist();
	}

}
