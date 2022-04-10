package javaxswing;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class jtree {
	JFrame f;
	jtree(){
		f=new JFrame();
		DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");
		DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
		DefaultMutableTreeNode font=new DefaultMutableTreeNode("Font");
		style.add(color);style.add(font);
		DefaultMutableTreeNode red=new DefaultMutableTreeNode("Red");
		DefaultMutableTreeNode blue=new DefaultMutableTreeNode("BLUE");
		DefaultMutableTreeNode green=new DefaultMutableTreeNode("GREEN");
		DefaultMutableTreeNode yellow=new DefaultMutableTreeNode("Yellow");
		color.add(red);color.add(blue);color.add(green);color.add(yellow);
	     JTree jt=new JTree(style);f.add(jt);
	     f.setSize(400,400);
	     f.setVisible(true);
}
public static void main(String args[]) {
	new jtree();
}


}


