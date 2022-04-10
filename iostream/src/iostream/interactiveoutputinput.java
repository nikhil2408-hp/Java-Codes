package iostream;

import java.io.*;
import java.util.*;

public class interactiveoutputinput {
       // static DataInputStream din=new DataInputStream(System.in);
	//	static StringTokenizer st;
     public static void main(String args[]) throws IOException
 {
  // DataOutputStream dos=new DataOutputStream("invent.dat");
 // System.out.println("enter a code number");
 // st=new StringTokenizer(din.readLine());
  //int code=Integer.parseInt(st.nextToken());
 // System.out.flush();
 // System.out.println("enter the code number");
 // st=new StringTokenizer(din.readLine());
 /// int items=Integer.parseInt(st.nextToken());
  //System.out.flush();
  //System.out.println("enter the cost");
  //st=new StringTokenizer(din.readLine());
 // float cost=Float.valueOf(st.nextToken());
 // dos.writeInt(code);
 // dos.writeInt(items);
 // dos.writeFloat(cost);
 // dos.close();
  DataInputStream di=new DataInputStream(new FileInputStream("invent.dat"));
  int codeNumber=di.readInt();
  int totalitems=di.readInt();
  double itemcost=di.readDouble();
  double totalcost=totalitems+itemcost;
  di.close();
  System.out.println("codenumber"+codeNumber);
  System.out.println("totalitem"+totalitems);
  System.out.println("itemcost"+itemcost);
  System.out.println("totalcost"+totalcost);
  }
 }
