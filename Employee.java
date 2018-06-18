import java.util.Date;
public class Employee extends Person 
{
	String office;
	int salary;
	Date hired=new Date();
	
public Employee(String name, String address, int telephno, String email, String office, int salary, Date hired)
{
		super(name,address,telephno,email);
		this.office=office;
		this.salary=salary;
		
		
}
public String getOffice() 
{
		return office;
}
public void setOffice(String office) 
{
		this.office = office;
}
public int getSalary()
{
		return salary;
}
public void setSalary(int salary)
{
		this.salary = salary;
}
public Date getHired() 
{
		return hired;
}
public void setHired(Date hired) 
{
		this.hired = hired;
}

public String toString() 
{
		return("the name of the class is Employee and the employee name is  "+ getName());
}




}
