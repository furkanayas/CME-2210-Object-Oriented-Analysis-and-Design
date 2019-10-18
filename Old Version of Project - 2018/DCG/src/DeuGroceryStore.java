import java.util.Arrays;
import java.util.Scanner;

public class DeuGroceryStore implements Interf{
	Scanner scan = new Scanner(System.in);
	public static final boolean withpieces = true; public static final boolean withweight = true;
	
	 Market market;
	 Employee[] employees;
	 Manager manager;
	 Cashier[] cashier;
	 Stockman[] stockman;
	 Security[] security;
	 
	 Phone[] phone;
	 Address[] address;
	 int employenumber = 10;
	
	 Item[] stock;
	 int stockcapacity = 250;
	
	 Item[] shelves;
	 int shelfcapacity = 100;
	 
	 double balance = 10000.0;
	 BankAccount mainbankaccount;
	 BankAccount[] employebankaccounts;
	 Customer customer;
	 
	// super(name,surname,age,phone,salary,address,bka);
	public DeuGroceryStore()
	{
		market  = new Market();
		
		employees = new Employee[employenumber];
		phone = new Phone[employenumber];
		address = new Address[employenumber];
		employebankaccounts = new BankAccount[employenumber];
		phone[0] = new Phone();//use array for add new phone the phonebook, and can reach every phone
		//"+90",507301
		address[0] = new Address();
		BankAccount bka = new BankAccount();
		mainbankaccount = new BankAccount("DGSbankaccount",balance);		 
		//employees[0] = new Manager("Manager","Furkan",21,phone[0],2200.0,address[0],bka);
		 
		
		employees[0] = new Manager("Manager","Furkan",21,phone[0],2200.0,address[0],bka);
		employees[1] = new Cashier("Cashier1","Ayas",21,phone[0],2200.0,address[0],bka);
		employees[2] = new Stockman();
		employees[3] = new Security("Securiy1","Aslı",21,phone[0],2200.0,address[0],bka);
		
		stock = new Item[stockcapacity];
		Item ekmek = new Item("ekmek",1.25,"000001",withpieces);
		Item çikolata = new Item("çikolata",3.25,"000002",withpieces);
		
		Item biber = new Item("biber",2.00,"100001",withweight);
		Item domates = new Item("domates",2.25,"100002",withweight);
		
		 
			stock[0] = ekmek;
			stock[1] = ekmek;
			stock[2] = çikolata;
			stock[3] = çikolata;
			stock[4] = biber;
			stock[5] = biber;
			stock[6] = domates;
			stock[7] = domates;
		
		shelves = new Item[shelfcapacity];
		
		shelves[0] = ekmek;shelves[1] = çikolata;shelves[2] = biber;
		
		customer = new Customer();
		
		//Item i = new Item("Item",10.0,011011,true);
 
		//menusystem();
	}
	
	
/*	
	
	

	public Market getMarket() {
		return market;
	}










	public void setMarket(Market market) {
		this.market = market;
	}

*/








	public Manager getManager() {
		return manager;
	}


	public void setManager(Manager manager) {
		this.manager = manager;
	}


	public Cashier[] getCashier() {
		return cashier;
	}


	public void setCashier(Cashier[] cashier) {
		this.cashier = cashier;
	}


	public Stockman[] getStockman() {
		return stockman;
	}


	public void setStockman(Stockman[] stockman) {
		this.stockman = stockman;
	}


	public Security[] getSecurity() {
		return security;
	}


	public void setSecurity(Security[] security) {
		this.security = security;
	}


	public BankAccount[] getEmployebankaccounts() {
		return employebankaccounts;
	}






	public void setEmployebankaccounts(BankAccount[] employebankaccounts) {
		this.employebankaccounts = employebankaccounts;
	}






	public Market getMarket() {
		return market;
	}






	public void setMarket(Market market) {
		this.market = market;
	}





 





	public Phone[] getPhone() {
		return phone;
	}










	public void setPhone(Phone[] phone) {
		this.phone = phone;
	}










	public Address[] getAddress() {
		return address;
	}










	public void setAddress(Address[] address) {
		this.address = address;
	}










	 
	@Override
	public String toString() {
		return "DeuGroceryStore [market=" + market + ", employees=" + Arrays.toString(employees) + ", manager="
				+ manager + ", cashier=" + Arrays.toString(cashier) + ", stockman=" + Arrays.toString(stockman)
				+ ", security=" + Arrays.toString(security) + ", phone=" + Arrays.toString(phone) + ", address="
				+ Arrays.toString(address) + ", employenumber=" + employenumber + ", stock=" + Arrays.toString(stock)
				+ ", stockcapacity=" + stockcapacity + ", shelves=" + Arrays.toString(shelves) + ", shelfcapacity="
				+ shelfcapacity + ", balance=" + balance + ", mainbankaccount=" + mainbankaccount
				+ ", employebankaccounts=" + Arrays.toString(employebankaccounts) + ", customer=" + customer + "]";
	} 
	public Employee[] getEmployees() {
		return employees;
	} 
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public int getEmployenumber() {
		return employenumber;
	}

	public void setEmployenumber(int employenumber) {
		this.employenumber = employenumber;
	}

	public Item[] getStock() {
		return stock;
	}

	public void setStock(Item[] stock) {
		this.stock = stock;
	}

	public int getStockcapacity() {
		return stockcapacity;
	}

	public void setStockcapacity(int stockcapacity) {
		this.stockcapacity = stockcapacity;
	}

	public Item[] getShelves() {
		return shelves;
	}

	public void setShelves(Item[] shelves) {
		this.shelves = shelves;
	}

	public int getShelfcapacity() {
		return shelfcapacity;
	}

	public void setShelfcapacity(int shelfcapacity) {
		this.shelfcapacity = shelfcapacity;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount getMainbankaccount() {
		return mainbankaccount;
	}

	public void setMainbankaccount(BankAccount mainbankaccount) {
		this.mainbankaccount = mainbankaccount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	 

}
