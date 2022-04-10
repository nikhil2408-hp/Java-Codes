package objctstream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
class ObjectRead{
 public static void main(String[] args)throws IOException {
 int i;
 String s;
 Student stud;
 
 try {
 FileInputStream file = new FileInputStream("d:\\objectdata.txt"); // create a File
//Input Stream with the file
 ObjectInputStream input = new ObjectInputStream(file);// create a Object Input
//Stream using the File Output Stream

 i = input.readInt();
 s = (String)input.readObject();
 stud = (Student) input.readObject();
 byte[] array = (byte[])input.readObject();
 input.close();
 System.out.println("i = " + i);
 System.out.println("s = " + s);
 System.out.println("Student Roll No " + stud.getRollNo());
 System.out.println("Student Name " + stud.getName());
 System.out.println(array);
 input.close();
 file.close();

 }
 catch (Exception e) {
System.out.println(e);
 }
 }//end of main
}//end of class ObjectRead
