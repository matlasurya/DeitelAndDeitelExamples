package employeeTest;

public class Employee {
	private String firstName,lastName;
	private double monthlySalary;
	public Employee(String fName,String lName,double mSalary)
	{
		firstName=fName;
		lastName=lName;
		monthlySalary=mSalary;
	}
	public String getfirstName()
	{
		return firstName;
		
	}
	public void setfirstName(String fName)
	{
		firstName=fName;
		
	}
	public String getlastName()
	{
		return lastName;
	
	}
	public void setlastName(String lName)
	{
		lastName=lName;
	}
		public double getmonthlySalary( double mSalary )
		{
			return monthlySalary=mSalary;
	}
		public double yearlySalary()
		{
			int year=12;
			return monthlySalary*year;
		}
		public double bonusAmount()
		{
			double bonus=(yearlySalary()*10)/100;
			return bonus;
			
		}

}
