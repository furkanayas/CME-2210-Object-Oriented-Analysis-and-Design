import java.util.ArrayList;
import java.util.List;

public class Cashier extends Employee{

	 
	Cashier(String name,String surname,int age,Phone phone, double salary, Address address, BankAccount bka)
	{
		super(name,surname,age,phone,salary,address,bka,3);	
	}
	
	public double getSalary()
	{
		double salary = 3000*1;
		return salary;
	}
	
	/*
	takePayment(pay());increase
	readBarcode(product);
	giveReceipt(toCustomer);
	getSalary();
	toString();*/
	
	
	public static void takePayment(Customer customer)
	{
		double payment = 0;
		for (int i = 0; i < customer.basket.size(); i++) {
			
			payment = payment + customer.getBasket().get(i).getPrice();
		
		}
		double money = customer.getMoney();
		
	
		customer.setMoney((money-payment));
		Market.getCase().increaseCaseMoney(payment);
		
		//for (int i = 0; i < customer.basket.size(); i++) {
		List<Item> emptybasket = new ArrayList<Item>();
			customer.setBasket(emptybasket);
		//}

		/*if(money < payment)
		{
			System.out.println("customer can't afford");
		}
		else
		{
			
		}*/
	}
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", age=" + age +  ", salary="
				+ salary + "]";
	}

	
}
