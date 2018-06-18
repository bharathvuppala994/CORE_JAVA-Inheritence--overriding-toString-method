public class Student extends Person 
{
int classStatus;
public Student (String name,String address,int telephno,String email,int classStatus)
{
  
  super(name,address,telephno,email);
  this.classStatus=classStatus;
}

public int getClassStatus()
{
	return classStatus;
}

public void setClassStatus(int classStatus)
{
	this.classStatus = classStatus;
}
public String toString() 
{
	return ("the name of the class is student and the student name is  "   + getName());
}

}