import java.io.IOException;
import java.util.Scanner;

public class Menu implements Interf{
	
	static Scanner scan = new Scanner(System.in);
	
	
	static void emptyBasket(Item[] basket)
	{
		int i = 0;
		while(basket[i] != null)
		{
			basket[i] = null;
			i++;
		}
	}
	public static String customerInfo(Customer customer)
	{
		String ret = "";
		ret = "The costumer info :    empy basket size : " +emptyBasketSize(customer)+
			"\nName :" +customer.getName() +"  "+ "Surname : "+customer.getSurname()+
			"Money :" +customer.getMoney()+"  "+ "BasketSize : "+customer.getBasket().length;
	
		return ret;
	}
	
	/*
	 * int i  = 0;
		//System.out.println("num - name - price - barcode");
	
			while(items[i] != null)
		{		
			
				ret =ret + " "+ i+" / "+ items[i].getName() +" - " + items[i].getPrice() 
						+" - " + items[i].getBarcode()+"\n";			
			i++;
		}*/
	
	//
	public static String lookDGS(DeuGroceryStore DGS,Employee[] employee)
	{
		int i = 0;
		String ret = "";
		 
	
		while(employee[i] != null)
		{
			ret = ret + employee[i].getClass() +" / "
		+employee[i].getName() +" / "+employee[i].getSurname() +" / "
					+employee[i].getSalary() +" / "+
					" / "+employee[i].getAge() +" / "
					+employee[i].getPhone().getCountrycode() +" / "+" / "+employee[i].getPhone().getTennumber();
			i++;
		}
		
		ret =	"Employees : "+ DGS.getEmployenumber()+"\n"+
				"Balance : "+DGS.getBalance()+"\n"+
				"Shelfcapacity : "+DGS.getShelfcapacity() +
				" \nStockcapacity"+ DGS.getStockcapacity()+"\n"+ret;
		
		return ret;
	}
	
	public static String pay(Customer customer)
	{
		double payvalue = Bill(customer);
		String ret = "";
		customer.money = customer.money - payvalue;
		emptyBasket(customer.getBasket());
		ret = ret + "Bill :" + payvalue;
		ret = ret + "\nYour new money : "+customer.money;
		
		return ret;
		
	}
	
	public static double Bill(Customer customer)
	{
		double bill = 0;
		arrange(customer.basket);	
		
		int i = 0;
		while(customer.basket[i] != null)
		{
			bill = bill + customer.basket[i].getPrice();
			i++;
		}
		
		return bill;
	}
	
	public static String Billstring(Double bill)
	{
		String ret = String.valueOf(bill);
		
		return ret;
	}
	
	public static void removeIteminBaskettoShelves(Customer customer,Item[] shelves,int a)
	{
		//displayItems(deu);
		
		//displayItems(customer.getBasket());
		
		int choose = a;
		arrange(shelves);
		
		int i = 0;
		
		while(shelves[i] != null)
		{
			i++;
		}
		shelves[i] = customer.basket[choose];
		customer.basket[choose] = null;
		arrange(customer.basket);
	}
	
	public static void searchandBuyItem(Item[] shelf, Item[] basket,int a){
		arrange(shelf);arrange(basket);
		listShelf(shelf);
		
		
		int choose = a;
		
		int i = 0;
		
		while(basket[i] != null)
		{
			i++;
		}
		
		basket[i] = shelf[choose];
		shelf[choose] = null;
		
		
	}
	
	public static void addItemStocktoShelf(Item[] stock,Item[] shelf,int a)
	{
		listStock(stock);
		
		 
		int choose = a;
		
		arrange(shelf);
		
		int i = 0;
		
		while(shelf[i] != null)
		{
			i++;
		}
		
		Item addone = stock[choose];
		
		stock[choose] = null;
		
		shelf[i] = addone;
	}
	
	public static void addItemMarkettoStock(DeuGroceryStore DGS,int a)
	{
		Item[] stock = DGS.getStock();
		Item[] market = DGS.getMarket().getItems();
		
		arrange(stock);arrange(market);
		listStock(market);
	 
		int choose = a;
		
		int i = 0;
		
		while(stock[i] != null)
		{
			i++;
		}
		
		stock[i] = market[choose];
		
		double money = DGS.getBalance();
		money = money - market[choose].getPrice();
		
		 
		DGS.setBalance(money);
		DGS.getMainbankaccount().setBalance(money);
		market[choose] = null;
		
		DGS.setStock(stock);
		DGS.getMarket().setItems(market);
		
		
	}
	
	//o
	public static String lookMarket(Market market)
	{
		String ret = "";
		arrange(market.getItems());
		ret = "Name : "+market.getName()+"  */*  Size : "+market.getMarketsize();
		ret = ret + displayItems(market.getItems());
		return ret;
	}
	
	
	
	public static int emptyBasketSize(Customer customer)
	{
		arrange(customer.basket);
		int size = customer.basket.length;
		
		int i  = 0;
		
		while(customer.basket[i] != null)
		{			
			i++;
		}
		
		
		return size - i;
	}
	
	public static void arrange(Item[] items)
	{
		//list olmalıydı
		Item[] arrange = new Item[items.length];
		
		int a = 0;
		for (int i = 0; i < items.length; i++)
		{
			if(items[i] != null)
			{
				arrange[a] = items[i];
				a++;
			}
		}
		
		for (int i = 0; i < a; i++) {
			items[i] = arrange[i];
		}
		for (int i = a; i < items.length; i++) {
			items[i] = null;
		}
	}
	
	/*public static voidlistShelf(Item[] items)
	{
		arrange(items);
		displayItems(items);
	}
	*/
	//*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****
	public static String listStock(Item[] items)
	{
		arrange(items);
		return displayItems(items);
	}
	
	public static String listShelf(Item[] items)
	{
		arrange(items);
		return displayItems(items);
	}
	
	
	public static String displayItems(Item[] items)
	{
		//arrange(DeuGroceryStore.customer.basket);
		String ret = "";
		if(items[0] == null)
		{
			//System.out.println("Is empty");
			return "is empty";
		}
		else
		{
		
		int i  = 0;
		//System.out.println("num - name - price - barcode");
	
		//*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****/*****
			while(items[i] != null)
		{		
			
				ret =ret + " "+ i+" / "+ items[i].getName() +" - " + items[i].getPrice() 
						+" - " + items[i].getBarcode()+"\n";			
			i++;
		}
	/*	while(items[i] != null)
		{		
			
				System.out.println(i+" / "+ items[i].getName() +" - " + items[i].getPrice() 
						+" - " + items[i].getBarcode());
			
			i++;
		}*/
		}
		return ret;
	}

	public static void addBasket(Item[] shelf,Item[]basket)

	{
		arrange(basket);
		int i = 0;
		
		while(basket[i] != null)
		{
			i++;
		}
		int a = basket.length;
		if(basket[a-1] != null)
		{
			System.out.println("basket already full");
		}
		else
		{
			listShelf(shelf);
			
			System.out.println("Choose one");
			int choose = scan.nextInt();
			
			int a1 = 0;
			
			while(basket[a1] != null)
			{
				a1++;
			}
			 basket[a1] = shelf[choose];
			 shelf[choose] = null;
			 arrange(shelf);
			System.out.println("The item added basket succesfully");
		}
		
	}
	
	public static void sistem(DeuGroceryStore DGS)
	{
	int customerselection = -1;
	int adminselection = -1;
	int who = -1;
	System.out.println("Choose 1 for Admin/Manager System \nChoose 2 for Customer Interface\n");
	who = scan.nextInt();
	
	if(who == 1)
	{
		while (adminselection != 0)
		{
		System.out.println("The DeuGroceryStore info :");
		System.out.println("Balance :" +DGS.getBalance()+"  */*  "+ "Employenumber : "+DGS.getEmployenumber());
		System.out.println("ShelfCapacity :" +DGS.getShelfcapacity()+"  */*  "+ "StockCapacity : "+DGS.getStockcapacity());
		System.out.println("MainBankAccountBalance :" +DGS.getMainbankaccount().balance+"  */*  \n");
		System.out.println("DeuGroceryStore Management System");
		System.out.println("1)List Shelf");
		System.out.println("2)List Stock");
		System.out.println("3)Add Item toShelf fromStocks");
		System.out.println("4)Buy Item fromMarket");
		System.out.println("5)Look DGS info");
		System.out.println("6)Look theMarket info");
		System.out.println("0)BacktoSystemMenu");
		System.out.println("What is your selection ?\n");

		adminselection = scan.nextInt();
		
		if(adminselection == 1)
		{
			listShelf(DGS.shelves);
		}
		else if(adminselection == 2)
		{
			listStock(DGS.stock);
		}
		
		else if(adminselection == 3)
		{
		//	addItemStocktoShelf(DGS.stock, DGS.shelves);
		}
		else if(adminselection == 4)
		{
		//	addItemMarkettoStock(DGS);
		}
		else if(adminselection == 5)
		{
			lookDGS(DGS,DGS.getEmployees());
		}
		else if(adminselection == 6)
		{
			lookMarket(DGS.getMarket());
		}	
		
		else if(adminselection == 0)
		{
			sistem(DGS);
		}
		else
		{
			sistem(DGS);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println();
		}
	}//the admin
	}//who = 1
	else if(who == 2)
	{
	while (customerselection != 0)
	{
 
		customerInfo(DGS.getCustomer());
		System.out.println();
		System.out.println("Customer Buy Services");
		System.out.println("1)diplayBasket");
		System.out.println("2)Look shelves");
		System.out.println("3)SearchItemInShelvesandPick");
		System.out.println("4)RemoveItemInBasket");	
		System.out.println("5)Calculate Basket price");
		System.out.println("6)Take sale Ticket and Pay");
		System.out.println("0)Exit");
		//System.out.println("7)RequestItemfromStockman");
		System.out.println("What is your selection ?");
		System.out.println();
		customerselection = scan.nextInt();
		
	
		if(customerselection == 1)
		{
			displayItems(DGS.getCustomer().getBasket());
		}
		
		else if(customerselection ==2 )
		{
			
			listShelf(DGS.getShelves());
		}
		
		else if(customerselection == 3)
		{		
			//searchandBuyItem(DGS.getShelves(),DGS.getCustomer().getBasket(),int);
		}
		else if(customerselection == 4)
		{
	//		removeIteminBaskettoShelves(DGS.getCustomer(),DGS.getShelves());
		}
		else if(customerselection == 5)
		{
		
			System.out.println("Bill : " + Bill(DGS.getCustomer()));
			
		}
		else if(customerselection == 6)
		{
		 
			pay(DGS.getCustomer());
			emptyBasket(DGS.getCustomer().getBasket());
			
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println();
		}
	}//customer
	}//who************
	}//sistem
	
	    
//TESTER
		 
}

