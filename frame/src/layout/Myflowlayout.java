package layout;
import java.awt.*;

public class Myflowlayout {
	Frame f;
	Myflowlayout(){
		f=new Frame("flow layout");
		Button b1=new Button("1");
		Button b2 =new Button("2");
		Button b3=new Button("3");
		f.add(b1);f.add(b2);f.add(b3);
		f.setLayout(new FlowLayout(FlowLayout.LEADING));
		f.setSize(300,300);
		f.setVisible(true);
		}
	public static void main(String args[]) {
	  new Myflowlayout();
		
	}

}
