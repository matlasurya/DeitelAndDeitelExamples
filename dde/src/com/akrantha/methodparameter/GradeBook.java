// Class declaration with one method that has a parameter.
package com.akrantha.methodparameter;

public class GradeBook {
	private String courseName;
	private String instructorName;
	
public GradeBook(String cName,String iName)
{
	courseName=cName;
	instructorName=iName;
	
}
public void setCourseName(String name)
	{
		courseName=name;
		
	}
	public String getCourseName()
	{
		return courseName;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	// display a welcome message to the GradeBook user
	public void displayMessage(String courseName,String instructorName)
	{
	System.out.printf("Welcome to the grade Book for\n%s!\n");
	}
	public String toString()
	{
		return String.format("instructorName is: %s\n course name is:%s",getInstructorName(),getCourseName());
	}

}
