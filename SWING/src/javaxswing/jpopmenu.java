package javaxswing;
import javax.swing.*;
import java.awt.event.*;

public class jpopmenu {
	jpopmenu(){
		final JFrame f=new JFrame("Popmenu example");
		final JPopupMenu pop=new JPopupMenu("Edit");
		JMenuItem cut=new JMenuItem("Cut");
		JMenuItem copy=new JMenuItem("Copy");
		JMenuItem paste=new JMenuItem("Paste");
		pop.add(cut);pop.add(copy);pop.add(paste);
		f.addMouseListener( new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				pop.show(f,e.getX(),e.getY());
			}
		});
		f.add(pop);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new jpopmenu();
	}

}
