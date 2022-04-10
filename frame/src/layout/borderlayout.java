package layout;

import java.awt.*;

public class borderlayout {
	Frame f;
	borderlayout(){
		f=new Frame("flow layout");
		Button b1=new Button("north");
		Button b2 =new Button("east");
		Button b3=new Button("west");
		Button b4=new Button("south");
		Button b5=new Button("center");
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.EAST);
		f.add(b3,BorderLayout.WEST);
		f.add(b4,BorderLayout.SOUTH);
		f.add(b5,BorderLayout.CENTER);
		
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new borderlayout();
	}

}
