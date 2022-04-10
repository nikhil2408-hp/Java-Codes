package frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class calcevent implements ActionListener {
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    calcevent(){
    	 calcevent c=new calcevent();
    	 Frame f=new Frame("Calculator");
    		
    		Label l1=new Label("First Number");
    		Label l2=new Label("Second Number");
    		Label l3=new Label("Result");
    		TextField t1=new TextField(5);
    		TextField t2=new TextField(5);
    		TextField t3=new TextField(7);
    		Button b1=new Button("Add");
    		Button b2=new Button("Subtract");
    		Button b3=new Button("Multiply");
    		Button b4=new Button("Divison");
    		f.add(l1);
    		f.add(t1);f.add(l2);f.add(t2);f.add(l3);f.add(t3);
    		f.add(b1);f.add(b2);f.add(b3);f.add(b4);
    		f.setSize(500,500);
    		f.setLayout(new FlowLayout(FlowLayout.LEFT));
    		f.setVisible(true);
    		t1.addActionListener(c);
    		t2.addActionListener(c);
     }
	
	public static void main(String args[]) {
    	new calcevent();
    }
	
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
       String a=t1.getText();
       String b=t2.getText();
       double ans=0.00;
       if(s.equals("Add"))
    	   ans=Double.parseDouble(a)+Double.parseDouble(b);
       else if(s.equals("Subtract"))
    	   ans=Double.parseDouble(a)-Double.parseDouble(b);
       else if(s.equals("Multiply"))
    	   ans=Double.parseDouble(a)*Double.parseDouble(b);
       else if(s.equals("Divison"))
    	   ans=Double.parseDouble(a)/Double.parseDouble(b);
       t1.setText(Double.toString(ans));
		
	}
	
	 
}