
public class Stockman extends Employee implements Interf{
	
	Stockman(String name,String surname,int age,Phone phone, double salary, Address address, BankAccount bka)
	{
		super(name,surname,age,phone,salary,address,bka);	
	}
	Stockman()
	{
		name ="Stockman1";surname="Stocksurname1";age=20;
		Phone p = new Phone("+90","505505");
		Address a = new Address("Tr","izmir","sokak",20,5);
		BankAccount b= new BankAccount("Finans",1000);	
		phone = p;
		salary=2200.0;address = a; bka=b;
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
	
	void listShelf(){};
	void listStock(){};
	
	/*
	
	checkShelf();
	checkStock();
	takeProductRequest();fromCustomer
	makeOrderRequest();toEmployee
	addShelf();
	addStock();
	removeStock();
	getSalary();
	toString();*/
}
