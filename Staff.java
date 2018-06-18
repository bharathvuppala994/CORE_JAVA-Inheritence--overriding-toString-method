import java.util.Date;

public class Staff extends Employee 
{
String title;
public Staff (String name,String address,int telephno,String email,String office,int salary,Date hired,String title) 
{
  super(name,address,telephno,email,office,salary,hired);
  this.title=title;
}

public String getTitle() 
{
	return title;
}

public void setTitle(String title)
{
	this.title = title;
}
public String toString()
{
	return("the name of the class is Staff and the staff name is  "+ getName());
	
}


}
