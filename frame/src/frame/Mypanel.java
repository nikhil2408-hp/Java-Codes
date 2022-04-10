package frame;
import java.awt.*;

public class Mypanel {
	public static void main(String args[])
	{
		Frame frame=new Frame("Nikhil Maurya");
		Panel panel=new Panel();
		frame.resize(500,500);
		frame.setBackground(Color.blue);
		frame.setLayout(null);
		panel.resize(250,250);
		panel.setBackground(Color.orange);
		frame.add(panel);
		frame.show();
	}

}
