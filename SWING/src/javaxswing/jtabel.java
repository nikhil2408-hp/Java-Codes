package javaxswing;
import javax.swing.*;

public class jtabel {
	JFrame f;
	jtabel(){
		f=new JFrame();
		String data[][]= { {"101","Amit","670000"},
				{"102","Jai","100000"},
				{"103","Sachin","780000"}
			};
		String column[] ={"ID","NAME","SALARY"};
		JTable jt=new JTable(data,column);
		jt.setBounds(30,40,200,300);
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp);
		
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new jtabel();
	}

}
