import java.util.Date;
public class Persontester 
{
public static void main(String[] args) 
{
  Date hired=new Date();
  Person bharath = new Person("bharath", "",2,"");
  bharath.toString();
  System.out.println(bharath.toString());

Employee Emp1=new Employee("Emp1","",1,"","",25000,hired);
Emp1.toString();
System.out.println(Emp1.toString());

Student Stu1=new Student("Stu1", "",2,"",2);
Stu1.toString();
System.out.println(Stu1.toString());

Faculty Fac1=new Faculty("Fac1", "",2,"","",10000,hired,8,"");
Fac1.toString();
System.out.println(Fac1.toString());

Staff Sta1=new Staff("Sta1", "",2,"","",10000,hired,"");
Sta1.toString();
System.out.println(Sta1.toString());

}

}