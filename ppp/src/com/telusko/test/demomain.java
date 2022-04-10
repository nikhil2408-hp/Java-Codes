package com.telusko.test;

public class demomain {
	public static void main(String args[])
	{students s=new students();
	s.rollno=9;
	s.marks=99;
	s.age=33;
	s.name="Navin";//will throw error because private are not accessible outside class
	}
}
