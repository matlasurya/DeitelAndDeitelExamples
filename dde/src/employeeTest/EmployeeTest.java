package employeeTest;



public class EmployeeTest {
	
	public static void main(String[]args)
	{
		Employee emp1=new Employee("Suresh","matla",20000);
		Employee emp2=new Employee("surya","mca",15000);
		
		
		
		emp1.yearlySalary();
		if(emp1.yearlySalary()>0)
		{
		System.out.println("Employee-1 yearly salary is = "+emp1.yearlySalary());
		}
		else
		{
			System.out.println("Employee-1 Salary always Positive only");
		}
		emp2.yearlySalary();
		System.out.println("Employee-2 yearly salary is = "+emp2.yearlySalary());
	    System.out.println("After Adding 10% Bonus");
		System.out.println("Employee-1 salary + 10% raise= "+(emp1.yearlySalary()+emp1.bonusAmount()));
		System.out.println("Employee-2 salary + 10% raise= "+(emp2.yearlySalary()+emp2.bonusAmount()));
	}

}
