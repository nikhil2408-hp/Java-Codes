package Chatting;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Server implements ActionListener {

	JPanel p1;
	 static JTextField t1;
	JButton b1;
	 static JPanel p2;
	 static ServerSocket skt;
	 static Socket soc;
	 static DataOutputStream dout;
	 static DataInputStream din;
	 Boolean typing;
	static  Box vertical=Box.createVerticalBox();
	 static JFrame f1=new JFrame();
	public static void main(String args[]) {
		new Server();
		String msgin="";
		try {
			skt=new ServerSocket(5000);
			while(true) 
			{         soc=skt.accept();
			          din=new DataInputStream(soc.getInputStream());
			           dout=new DataOutputStream(soc.getOutputStream());
			     
			while(true) {
				msgin=din.readUTF();
				JPanel p5=formatLabel(msgin);
				
				JPanel left=new JPanel(new BorderLayout());
				left.add(p5,BorderLayout.LINE_START);
				vertical.add(left);
				f1.validate();
			}
		}
		  	}catch(Exception e) {}
	}


 Server() {
	      p1=new JPanel();
	   p1.setLayout(null);
	   p1.setBackground(new Color(3,102,85));
	   p1.setBounds(0,0,450,70);
	  f1.add(p1);
	 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Chatting/icons/Shalini.png"));
	  Image i2=i1.getImage().getScaledInstance(60,60,Image.SCALE_AREA_AVERAGING);
	  	ImageIcon i3=new ImageIcon(i2);
	  	JLabel l1=new JLabel(i3);
	  	l1.setBounds(40,5,60,60);
	  	p1.add(l1);
	    
	  	ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Chatting/icons/3.png"));
		  Image i5=i4.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
		  	ImageIcon i6=new ImageIcon(i5);
		  	JLabel l2=new JLabel(i6);
		  	l2.setBounds(5,17,30,30);
		  	p1.add(l2);
		  	l2.addMouseListener(new MouseAdapter() {
		  		public void mouseClicked(MouseEvent e) {
		  			System.exit(0);
		  		}
		  	});
		 
		  	ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("Chatting/icons/3icon.png"));
		  Image i8=i7.getImage().getScaledInstance(13,25,Image.SCALE_DEFAULT);
			ImageIcon i9=new ImageIcon(i8);
			  	JLabel l3=new JLabel(i9);
			  	l3.setBounds(410,20,15,30);
	            p1.add(l3); 	
        
	         ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("Chatting/icons/video.png"));
	  		  Image i11=i10.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
	  			ImageIcon i12=new ImageIcon(i11);
	  			  	JLabel l4=new JLabel(i12);
	  			  	l4.setBounds(350,20,30,30);
	  	            p1.add(l4); 
	  	 
	  	      ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("Chatting/icons/phone.png"));
		  		  Image i14=i13.getImage().getScaledInstance(35,30,Image.SCALE_DEFAULT);
		  			ImageIcon i15=new ImageIcon(i14);
		  			  	JLabel l5=new JLabel(i15);
		  			  	l5.setBounds(290,20,25,30);
		  	            p1.add(l5); 
		
		 JLabel l6=new JLabel("Shalini");
		 l6.setFont(new Font("GAN_ULNIT",Font.PLAIN,18));
		 l6.setForeground(Color.WHITE);
		 l6.setBounds(110,15,100,20);
		 p1.add(l6);
		 
		 JLabel l7=new JLabel("Active Now");
		 l7.setFont(new Font("GAN_ULNIT",Font.BOLD,12));
		 l7.setForeground(Color.WHITE);
		 l7.setBounds(110,35,100,20);
		 p1.add(l7);
		 
		 Timer t=new Timer(1, new ActionListener()
		 {
	        public void actionPerformed(ActionEvent ae) {
                   if(!typing) {
                	   l7.setText("Active Now");
                   }
	        }
		 });
 t.setInitialDelay(1500);
		 
		 t1=new JTextField();
		 t1.setBounds(5,655,310,40);
		 t1.setFont(new Font("GAN_DENIT",Font.PLAIN,16));
		 f1.add(t1);
		 t1.addKeyListener(new KeyAdapter() {
			 public void keyPressed(KeyEvent e) {
				 l7.setText("typing....");
				 t.stop();
				 typing=true;
			 }
			 public void keyReleased(KeyEvent e) {
				 typing=false;
				 if(!t.isRunning()) {
					 t.start();
				 }
			 }
		 });
		 
		 b1=new JButton("SEND");
		 b1.setBounds(320,655,122,40);
		 b1.setBackground(new Color(7,56,78));
		 b1.setForeground(Color.WHITE);
		 b1.setFont(new Font("SAN_SERIT",Font.PLAIN,16));
		 b1.addActionListener(this);
	     f1.add(b1);
		 
		 p2=new JPanel();
		 p2.setBounds(5,75,450,570);
		 p2.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
		 f1.add(p2);
	
		 
	   f1.setBackground(Color.YELLOW);
	   f1.setSize(450,700);
	   f1.setLayout(null);
	   f1.setLocation(400,100);
	   f1.setUndecorated(true);
	   f1.setVisible(true);
   }
 public void actionPerformed(ActionEvent de) {
    try{
    	String out=t1.getText();
    JPanel p3=formatLabel(out);
    p2.setLayout(new BorderLayout());
   
    JPanel right=new JPanel(new BorderLayout());
    right.add(p3,BorderLayout.LINE_END);
    vertical.add(right);
    vertical.add(Box.createVerticalStrut(15));
    
    p2.add(vertical,BorderLayout.PAGE_START);
   
	dout.writeUTF(out);
	 t1.setText("");}
   catch(Exception we) {
	   System.out.println(we);
   };
 }
public static JPanel formatLabel(String out) {
	 JPanel p4=new JPanel();
	 p4.setLayout(new BoxLayout(p4,BoxLayout.Y_AXIS));
	 
	 JLabel l13=new JLabel("<html><p style =\"width : 150px\">"+out+"</p></html>");
	 l13.setFont(new Font("Tahoma",Font.PLAIN,16));
	 l13.setBackground(new Color(17,211,102));
	 l13.setOpaque(true);
	 l13.setBorder(new EmptyBorder(15,15,15,50));
	 
	 Calendar cal=Calendar.getInstance();
	 SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
	 JLabel l23=new JLabel();
	 l23.setText(sdf.format(cal.getTime()));
	
	 p4.add(l13);
	 p4.add(l23);
	 return p4;
 }
	
}
            