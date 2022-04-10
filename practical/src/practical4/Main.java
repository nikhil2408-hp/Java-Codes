package practical4;

import java.util.Scanner;

interface Shape {
	void area();
}
class Circle implements Shape{
	int rad;
	Circle(int rad){
		this.rad=rad;
	}
	public void area() {
		System.out.println("Area of Circle is: "+Math.PI*Math.pow(rad, 2));
	}
}

class Triangle implements Shape{
	int len,base;
	Triangle(int n,int m){
		len=n;
		base=m;
	}
	public void area() {
		System.out.println("Area of Triangle is: "+(0.5*len*base));
	}
}

public class Main {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter radius of circle: ");
	int rad=sc.nextInt();
	System.out.print("Enter length of Triangle: ");
	int len=sc.nextInt();
	System.out.print("Enter Base of Triangle: ");
	int base=sc.nextInt();
	Shape ci=new Circle(rad);
	Shape tri=new Triangle(len,base);
	ci.area();
	tri.area();
	
	
	}

}
