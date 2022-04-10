package frame;
import java.awt.*;

public class choicedemo {
  public choicedemo() {
	  Frame f=new Frame("maurya");
	  Choice c=new Choice();
	  c.setBounds(100,100,100,100);
	  c.add("item1");
	  c.add("item2");
	  c.add("item3");
	  c.add("item4");
	  f.add(c);
	  f.setSize(400,400);
	  f.setLayout(null);
	  f.setVisible(true);
	  
  }
  public static void main(String args[]) {
	  new choicedemo();
  }
}
