package com.akrantha.employee;

public class Employee {
	private String firstName;
    private String lastName;
    private static int count = 0;
    
    public Employee( String first, String last )
     {
     firstName = first;
     lastName = last;
     ++count;
     System.out.printf( "Employee constructor: %s %s; count = %d\n", firstName, lastName, count );
     }
    public String getFirstName()
     {
     return firstName;
     }
    public String getLastName()
     {
     return lastName;
     }
 // static method to get static count value
    public static int getCount()
    {
    return count;
    } // end method getCount

}
