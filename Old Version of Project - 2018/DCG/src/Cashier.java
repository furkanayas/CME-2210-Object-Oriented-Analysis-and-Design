
public class Cashier extends Employee implements Interf{
	
	 
	Cashier(String name,String surname,int age,Phone phone, double salary, Address address, BankAccount bka)
	{
		super(name,surname,age,phone,salary,address,bka);	
	}
	
	/*
	takePayment(pay());increase
	readBarcode(product);
	giveReceipt(toCustomer);
	getSalary();
	toString();*/
	
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
