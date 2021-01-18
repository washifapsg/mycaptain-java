package Project5;

public class Employee {
	String Name;
	int Age;
	int Salary;
	String Address;
	public Employee(String Name,int Age,int Salary,String Address) 
	{
		this.Name=Name;
		this.Age=Age;
		this.Salary=Salary;
		this.Address=Address;
		System.out.println(Name+"\t"+Age+"\t"+Salary+"\t"+Address);
	}
	public static void main(String[] args)
	{
		System.out.println("Name\tAge\tSalary\tAddress");
		Employee empone= new Employee("Robert",1994,50000,"64C-WallsStreet");
		Employee emptwo= new Employee("Sam",2000,35000,"68C-WallsStreet");
		Employee empthree= new Employee("John",1999,45000,"26B-WallsStreet");
	}
}



