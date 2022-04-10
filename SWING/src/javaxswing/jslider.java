package javaxswing;
import javax.swing.*;

public class jslider extends JFrame {
 jslider() {
	JSlider slider=new JSlider(JSlider.HORIZONTAL, 0, 100, 33);
	JPanel panel=new JPanel();
	panel.add(slider);
	add(panel);
	}
 public static void main(String args[]) {
	 jslider frame=new jslider();
	 frame.pack();
	 frame.setVisible(true);
 }

}
