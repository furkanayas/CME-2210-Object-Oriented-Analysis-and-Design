
public class Stockman extends Employee {
	
	Stockman(String name,String surname,int age,Phone phone, double salary, Address address, BankAccount bka)
	{
		super(name,surname,age,phone,salary,address,bka,2);	
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
	
	
	public double getSalary()
	{
		double salary = 3000*(1.2);
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", age=" + age + ", salary="
				+ salary + "]";
	}
	
	
	public static String printShelfItems()
	{
		String ret = "";
		for (int i = 0; i < Market.marketshelfitems.size(); i++) {
			
			ret = ret + i +" : "+ Market.marketshelfitems.get(i) +"\n";
		}
		
		return ret;

	}
	
	public static String printStockItems()
	{
		String ret = "";
		for (int i = 0; i < Market.marketstockitems.size(); i++) {
			ret = ret + i +" : "+ Market.marketstockitems.get(i) + "\n";
		}
		return ret;
	}

	public static  void StocktoShelf(Item item)
	{
		Item add = item;
		
		Market.marketstockitems.remove(item);	
		Market.marketshelfitems.add(add);
	}
	
	public static  void ShelftoStock(Item item)
	{
		Item add = item;
		
		Market.marketshelfitems.remove(item);	
		Market.marketstockitems.add(add);
	}
	
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
