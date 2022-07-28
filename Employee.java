 class EmployeeInfo
{
	private String Name;
	private int Year;
	private int Salary;
	private String Address;
	public String getName()
	{
		return Name;
	}
	public int getYear()
	{
		return Year;
	}
		public int getSalary()
	{
		return Salary;
	}
		public String getAddress()
	{
		return Address;
	}
	public void setName(String newValue)
	{
		Name = newValue;
	}
	public void setYear(int newValue)
	{
		Year = newValue;
	}
	public void setSalary(int newValue)
	{
		Salary = newValue;
	}
		public void setAddress(String newValue)
	{
		Address = newValue;
	}
}
public class Employee
{
	public static void main(String args[])
	{
		EmployeeInfo obj1 = new EmployeeInfo ();
		EmployeeInfo obj2 = new EmployeeInfo ();	
		EmployeeInfo obj3 = new EmployeeInfo ();		
		obj1.setName("Robert");
		obj1.setYear(1994);
		obj1.setSalary(64);
		obj1.setAddress("WallsStreat");
		obj2.setName("Sam");
		obj2.setYear(2000);
		obj2.setSalary(68);
		obj2.setAddress("WallsStreat");
		obj3.setName("John");
		obj3.setYear(1999);
		obj3.setSalary(26);
		obj3.setAddress("WallsStreat");
		System.out.println("Name"+" "+"Year of joining"+" "+"Salary"+" "+"Address" );
		System.out.println(obj1.getName()+" "+obj1.getYear()+" "+obj1.getSalary()+"C"+" "+obj1.getAddress());
		System.out.println(obj2.getName()+" "+obj2.getYear()+" "+obj2.getSalary()+"D"+" "+obj2.getAddress());
		System.out.println(obj3.getName()+" "+obj3.getYear()+" "+obj3.getSalary()+"B"+" "+obj3.getAddress());
	}
}
