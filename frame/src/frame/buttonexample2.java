package frame;
import java.awt.*;

public class buttonexample2 extends Component {
	public static void main(String args[]) {
		Frame f=new Frame();
		Button b=new Button("click");
		b.setBounds(50,100,80,30);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	

}
