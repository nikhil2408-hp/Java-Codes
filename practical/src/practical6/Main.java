package practical6;

import java.io.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws NegativeNumException{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a whole number");
    int num = s.nextInt();
    if (num < 0) {
      throw new NegativeNumException();
    }
    System.out.println("You passed the first test. Yayy!!");
    System.out.print("numerator: ");
    double numerator = s.nextDouble();
    System.out.print("denominator: ");
    double denominator = s.nextDouble();
    double div = numerator / denominator;
    System.out.println("result of division: " + div);
    System.out.println("Your basics of meth are on point");
    //checked Exception
    FileInputStream fis = null;
	try{
	    fis = new FileInputStream("B:/myfile.txt"); 
	}catch(FileNotFoundException fnfe){
            System.out.println("The specified file is not " +
			"present at the given path");
	 }
	int k; 
	try{
	    while(( k = fis.read() ) != -1) 
	    { 
		System.out.print((char)k); 
	    } 
	    fis.close(); 
	}catch(IOException ioe){
	    System.out.println("I/O error occurred: "+ioe);
	 }
  }
}

class NegativeNumException extends Exception {
  @Override
  public String toString() {
    return "You dumb ass! GO and revise your math basics";
  }
}
