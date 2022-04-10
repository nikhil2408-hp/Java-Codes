package Solution;
import java.util.Scanner;
class PowerException extends RuntimeException{
	Exceptiomhandling g=new Exceptiomhandling();
	public  PowerException() {
		System.out.print("n or p should not be negative");
	}
}
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
	long power(int x,int y) {
	if (x<=0 || y<=0) {
		throw new PowerException();
	}
	else 
		return (long) Math.pow(x,y);
	}


public static class Exceptiomhandling {
	
	
	    public final static MyCalculator my_calculator = new MyCalculator();
	    public final static Scanner in = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        while (in .hasNextInt()) {
	            int n = in .nextInt();
	            int p = in .nextInt();
	            
	            try {
	                System.out.println(my_calculator.power(n, p));
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
	}
}

	