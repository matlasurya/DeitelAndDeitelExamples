package com.akrantha.methodparameter;
//import java.util.Scanner;
public class GradeBookTest {
	// main method begins program execution
	public static void main(String args[])
	{
		// create Scanner to obtain input from command window
		//Scanner input=new Scanner(System.in);
		
		// create a GradeBook object and assign it to myGradeBook
		GradeBook myGradeBook=new GradeBook("java","suresh");
		System.out.println();
	
		myGradeBook.setInstructorName("goutam");
		
		System.out.println(myGradeBook.toString());
	}// end main

}// end class GradeBookTest
