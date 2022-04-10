package com.telusko;

import com.telusko.test.students;

public class engineer extends students 
{
  public void show()
  {
	  marks=77;//protected data members are accessible within same package and also in
	  //other package subclass
	  age=27;//will throw error default data members are only accessible in same package 
  }
}
