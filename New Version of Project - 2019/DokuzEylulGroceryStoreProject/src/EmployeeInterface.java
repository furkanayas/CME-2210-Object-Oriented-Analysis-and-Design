
public interface EmployeeInterface {

	//getsalary for each class
	
	public void getPayment();
	
	public BankAccount getBankAccount ();

	public void setBankAccount (BankAccount bka);

	public void setAddress(Address address);

	public Address getAddress();

	public void setAddress(Address address, String name);

	public String getName();

	public void setName(String name);

	public String getSurname();

	public void setSurname(String surname);

	public int getAge();

	public void setAge(int age);

	public Phone getPhone();

	public void setPhone(Phone phone);

	public double getSalary();

	public void setSalary(double salary);

	public int getType();

	public void setType(int type);
}
