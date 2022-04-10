package handlingevents;
import java.awt.event.*;
import javax.swing.*;
public class Mouse extends JFrame implements MouseListener,MouseMotionListener{
	JLabel l;
	Mouse(){
	    l=new JLabel("Mouse");
		l.setBounds(20,50,100,20);
		add(l);
		setSize(500,300);
		setLayout(null);
		setVisible(true);
		addMouseListener(this);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		l.setText("Mouse Dragged");
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		l.setText("Mouse Moved");
   }
	@Override
	public void mouseClicked(MouseEvent e) {
		l.setText("Mouse Clicked");
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		l.setText("Mouse Pressed");
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		l.setText("Mouse Released");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		l.setText("Mouse Entered");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		l.setText("Mouse Exited");
		
	}
	public static void main(String args[]) {
		new Mouse();
	}
  
}
