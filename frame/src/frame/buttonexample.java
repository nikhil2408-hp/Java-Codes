package frame;
import java.awt.*;

public class buttonexample extends Frame {
	buttonexample(){
		//Frame f=new Frame();
		Button b=new Button("Click me");
		b.setBounds(50,100,100,30);
		add(b);
		setSize(400,400); 
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[]) {
		buttonexample b=new buttonexample();
	}
}
