
public class Manager extends Employee {

	
	static String password = "1";
	static String id = "1";
	
	public static String getPassword() {
		return password;
	}

	public static String getId() {
		return id;
	}


	Manager(String name,String surname,int age,Phone phone, double salary, Address address, BankAccount bka)
	{
		super(name,surname,age,phone,salary,address,bka,1);	
	}
	
	public double getSalary()
	{
		double salary = 3000*(1.5);
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", age=" + age + ", salary="
				+ salary + "]";
	}
	
	
	public static void hireEmployee(String name,String surname,int age,Phone phone, double salary, Address address, BankAccount bka, int type)
	{
		
		Employee add = new Employee(name,surname,age,phone,salary,address,bka,type);
		
		Market.marketemployee.add(add);
		
	}
	
	public static void hireEmployee(Employee e)
	{
			
		Market.marketemployee.add(e);
		
	}
	
	public static void orderItem(Item item)
	{
		Market.marketcase.decreaseCaseMoney(item.getPrice());
		Market.marketstockitems.add(item);
	}
	
	public void fireEmployee(Employee e)
	{
		Market.marketemployee.remove(e);
	}
	
	public long calculateProfit()
	{
		long profit = 100000- Market.marketcase.getMoney();
		
		return profit;
	}
	
	public static String printEmployees()
	{
		String ret = "";
		for (int i = 0; i < Market.marketemployee.size(); i++) {
			ret = ret + i + " "+Market.marketemployee.get(i).toString() + "\n";
		}
		
		return ret;
	}
	
	public static void printGlobalOrderMarketItems()
	{
		for (int i = 0; i < GlobalOrderMarket.GlobalOrderMarketItems.size(); i++) {
			System.out.println(GlobalOrderMarket.GlobalOrderMarketItems.get(i));
		}
	}
	
	/*
	double calculateProfit(double case money){};
	double orderItem(orderrequest){}; fro  global  to stock
	getSalary();
	hire(person);
	fire(employee);
	toString();*/
	
}
