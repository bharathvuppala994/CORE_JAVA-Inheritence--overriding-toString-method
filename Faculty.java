import java.util.Date;

public class Faculty extends Employee
{
int officehours;
String rank;
public Faculty (String name,String address,int telephno,String email,String office,int salary,Date hired,int officehours,String rank)
{
	super(name,address,telephno,email,office,salary,hired);
}
public int getOfficehours() {
	return officehours;
}
public void setOfficehours(int officehours)
{
	this.officehours = officehours;
}
public String getRank()
{
	return rank;
}
public void setRank(String rank) 
{
	this.rank = rank;
}


public String toString() {
	return("the name of the class is Faculty and the faculty name is  "+ getName());
}
}
