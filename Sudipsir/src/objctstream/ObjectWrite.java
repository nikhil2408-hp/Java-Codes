package objctstream;

import java.io.*;
class ObjectWrite {
 public static void main(String[] args) {
 int sampleInt = 1024;
 String sampleString = new String("sampleString");
 Student sampleStudent = new Student( 1005, "sudip");
 byte[] a= {1,2,3,4,5};
 try {
 FileOutputStream file = new FileOutputStream("d:\\objectdata.txt"); // create a
//File Output Stream with the file
 ObjectOutputStream output = new ObjectOutputStream(file);// create a Object
//Output Stream using the File Output Stream
 // writes objects to output stream
 output.writeInt(sampleInt);
 output.writeObject(sampleString);
 output.writeObject(sampleStudent);
 output.writeObject(a);
 output.close();
 file.close();
 }
 catch (Exception e) {
System.out.println(e);
 }
 }//end main
}//end of class ObjectWrite