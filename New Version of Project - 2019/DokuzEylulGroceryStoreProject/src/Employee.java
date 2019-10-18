
public class Employee implements EmployeeInterface {

	
	

	
	//static Customer thecustomer = MarketSwing.returnCustomer();
//	static Market themarket = MarketSwing.returnMarket();
	
	protected String name;
	protected String surname;
	protected int age;
	protected Phone phone;
	protected double salary;
	protected Address address;
	protected BankAccount bka;
	protected int type;
	
	final int nonetype = 0;
	final int manager = 1;
	final int stockman = 2;
	final int cashier = 3;
	final int securtiy = 4;	
	//manage 1 stockman 2 cashier 3 security 4
	
	Employee() {
		
		name = "Non";
		surname = "Non";
		age = 0;
		//Phone p = new Phone();
		phone = new Phone();
		salary = 0.0;
		address = new Address();
		bka = new BankAccount();
		type = nonetype;
	}
	
	Employee(String name,String surname,int age,Phone phone, double salary, Address address, BankAccount bka,int type)
	{
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.phone = phone;
		this.salary = salary;
		this.address = address;
		this.bka = bka;
		this.type = type;
		
	}
	
	public void getPayment()
	{
		double accountmoney = bka.getBalance();
		double newmoney = accountmoney + getSalary();
		bka.setBalance(newmoney);
	}
	
	
	public BankAccount getBankAccount () {
		return bka;
	}

	public void setBankAccount (BankAccount bka) {
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", age=" + age + ", salary="+ salary +"]";
	}
	
	
	
}
