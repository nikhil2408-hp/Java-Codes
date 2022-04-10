package javaxswing;
import java.io.*;
import javax.swing.*;

public class jfilechooser2 {
	public static void main(String args[]) {
		JFileChooser fc=new JFileChooser();
		int i=fc.showOpenDialog(null);
		if(i==JFileChooser.APPROVE_OPTION) {
			File f=fc.getSelectedFile();
			System.out.println(f.getPath());
			System.out.println(f.getName());
		}
		else if(i==JFileChooser.CANCEL_OPTION)
			System.out.println("canceled");
	}

}
