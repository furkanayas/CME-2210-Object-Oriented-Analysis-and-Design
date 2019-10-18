
public class Employee {

	String name;
	String surname;
	int age;
	Phone phone;
	double salary;
	Address address;
	BankAccount bka;
	//final int cashier = 1;
	
	Employee() {
		
		name = "Non";
		surname = "Non";
		age = 0;
		//Phone p = new Phone();
		phone = new Phone();
		salary = 0.0;
		address = new Address();
		bka = new BankAccount();
	}
	
	Employee(String name,String surname,int age,Phone phone, double salary, Address address, BankAccount bka)
	{
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.phone = phone;
		this.salary = salary;
		this.address = address;
		this.bka = bka;
		
	}
	
	
	
	public BankAccount getBka() {
		return bka;
	}

	public void setBka(BankAccount bka) {
		this.bka = bka;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address, String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", age=" + age + ", phone=" + phone + ", salary="
				+ salary + "]";
	}
	
	
	
}
