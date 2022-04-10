package javaxswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jcolorchooser extends JFrame implements ActionListener {
	JButton b;Container c;
	private int lastx,lasty;
	Color color;
	jcolorchooser(){
		this.setBackground(Color.white);
		c=getContentPane();
		c.setLayout(new FlowLayout());
		b=new JButton("color");
		b.addActionListener(this);
		c.add(b);
}
	public void actionPerformed(ActionEvent e) {
		Color initial=Color.RED;
		 color=JColorChooser.showDialog(this,"Select a color",initial);
		//c.setBackground(color);
	}
	public static void main(String args[]) {
		jcolorchooser ch=new jcolorchooser();
		ch.setSize(400,400);
		ch.setVisible(true);
		ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public boolean mouseDown(MouseEvent e,int x,int y) {
		lastx=x;lasty=y;
		return true;
	}
	public boolean mouseDrag(MouseEvent e,int x,int y) {
	Graphics g=this.getGraphics();
	g.setColor(color);
	g.drawLine(lastx, lasty, x, y);
	lastx=x;
	lasty=y;
	return true;
	}

}
