public class Person 
{

	
	String name;
    String address;
    int telephno;
    String email;

public Person(String name, String address, int telephno, String email)
{
	this.name=name;
	this.address=address;
	this.telephno=telephno;
	this.email=email;
}

public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public String getAddress()
{
	return address;
}
public void setAddress(String address)
{
	this.address = address;
}
public int getTelephno() 
{
	return telephno;
}
public void setTelephno(int telephno)
{
	this.telephno = telephno;
}
public String getEmail()
{
	return email;
}
public void setEmail(String email)
{
	this.email = email;
}

public String toString() 
{
	return ("The name of the class is person and the persons name is: " +getName());
}


}


