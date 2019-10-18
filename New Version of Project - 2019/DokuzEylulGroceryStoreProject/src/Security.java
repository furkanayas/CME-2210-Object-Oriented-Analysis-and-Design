
public class Security extends Employee {

	Security (String name,String surname,int age,Phone phone, double salary, Address address, BankAccount bka)
	{
		super(name,surname,age,phone,salary,address,bka,4);	
	}
	
	public double getSalary()
	{
		double salary = 3000*1;
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", age=" + age + ", salary="
				+ salary + "]";
	}
}
