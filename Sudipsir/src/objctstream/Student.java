package objctstream;

import java.io.*;
public class Student implements Serializable
{
 private int rollNo;
 private String name;
 public Student(int rollNo , String name) // Constructor
 {
 this.rollNo = rollNo;
 this.name = name;
 }
 public int getRollNo()
{
 return rollNo;
}
 public String getName()
 {
 return name;
 }
 }//end of class Student
