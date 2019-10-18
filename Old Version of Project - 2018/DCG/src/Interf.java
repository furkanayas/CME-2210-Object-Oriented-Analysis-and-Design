import java.util.Scanner;

public interface Interf {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void customerInfo(Customer customer){}
	
	public static void lookDGS(DeuGroceryStore DGS,Employee[] employee){}
	
	public static void pay(Customer customer){}
	
	public static void removeIteminBaskettoShelves(Customer customer,Item[] shelves){}
	
	public static void searchandBuyItem(Item[] shelf, Item[] basket){}
	
	public static void addItemStocktoShelf(Item[] stock,Item[] shelf){}
	
	public static void addItemMarkettoStock(Item[] market,Item[] stock,double DGSbalance){}
	
	public static void lookMarket(Market market){}
	
	public static void listShelf(Item[] items){}
	
	public static void listStock(Item[] items){}
	
	public static void arrange(Item[] items){}
	
	public static void displayItems(Item[] items){}

	public static void addBasket(Item[] shelf,Item[]basket){}
	
	
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

	
	
//abstract methods
	/*public static void pay(){}
	public static double Bill(){return 0;}
	public static void removeIteminBasket(){}
	public static void searchItem(){}
	public static void addItemInStock(String name, double price, long barcode, boolean type){}
	public static void listShelf(){}
	public static void listStock(){}
	public static int emptyBasketSize(){return 0;}
	public static void arrange(Item[] items){}
	public static void displayBasket(){}
	public static void addBasket(Item addone){}*/
}
	
	

















	
	
	/*
	public static void pay()
	{
		double payvalue = Bill();
		
		DeuGroceryStore.customer.money = DeuGroceryStore.customer.money - payvalue;
		System.out.println("Your new money : "+DeuGroceryStore.customer.money);
	}
	
	public static double Bill()
	{
		double bill = 0;
		arrange(DeuGroceryStore.customer.basket);
		int i = 0;
		while(DeuGroceryStore.customer.basket[i] != null)
		{
			bill = DeuGroceryStore.customer.basket[i].getPrice();
			i++;
		}
		
		return bill;
	}
	
	public static void removeIteminBasket()
	{
		displayBasket();
		
		System.out.println("Choose number for remove Item");
		int choose = scan.nextInt();
		
		
		DeuGroceryStore.customer.basket[choose] = null;
		arrange(DeuGroceryStore.customer.basket);
		System.out.println("We remove that item");
	}
	
	public static void searchItem(){}
	
	 

	public static void addItemInStock(String name, double price, long barcode, boolean type)
	{
		
		arrange(DeuGroceryStore.mainstock.items);
		Item addone = new Item(name,price,barcode,type);
		int i = 0;
		while(i < DeuGroceryStore.stockcapacity)
		{
			if(DeuGroceryStore.mainstock.items[i] == null)
			{
				break;
			}
			else
			{
				i++;
			}
		}
		
		DeuGroceryStore.mainstock.items[i] = addone;
	}
	
	public static void listShelf()
	{
		arrange(DeuGroceryStore.shelves.items);
		int i = 0;
		
		while(DeuGroceryStore.shelves.items[i] != null)
		{
			System.out.println(i+" / "+ DeuGroceryStore.shelves.items[i].getName() +" - " + DeuGroceryStore.shelves.items[i].getPrice() 
					+" - " + DeuGroceryStore.shelves.items[i].getBarcode());
			i++;
		}
	}
	
	public static void listStock()
	{
		arrange(DeuGroceryStore.mainstock.items);
		int i = 0;
		
		while(DeuGroceryStore.mainstock.items[i] != null)
		{
			System.out.println(i+" / "+ DeuGroceryStore.mainstock.items[i].getName() +" - " + DeuGroceryStore.mainstock.items[i].getPrice() 
					+" - " + DeuGroceryStore.mainstock.items[i].getBarcode());
			i++;
		}
	}
	
	public static int emptyBasketSize()
	{
		arrange(DeuGroceryStore.customer.basket);
		int size = DeuGroceryStore.customer.basket.length;
		
		int i  = 0;
		
		while(DeuGroceryStore.customer.basket[i] != null)
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
	}
	
	public static void displayBasket()
	{
		arrange(DeuGroceryStore.customer.basket);
		 
		if(DeuGroceryStore.customer.basket[0] != null)
		{
			System.out.println("basket is empty");
		}
		
		int i  = 0;
		
		while(DeuGroceryStore.customer.basket[i] != null)
		{		
			
				System.out.println(i+" / "+ DeuGroceryStore.customer.basket[i].getName() +" - " + DeuGroceryStore.customer.basket[i].getPrice() 
						+" - " + DeuGroceryStore.customer.basket[i].getBarcode());
			
			i++;
		}	
		
	}

	public static void addBasket(Item addone)

	{
		arrange(DeuGroceryStore.customer.basket);
		int i = 0;
		
		while(DeuGroceryStore.customer.basket[i] != null)
		{
			i++;
		}
		int a = DeuGroceryStore.customer.basket.length;
		if(DeuGroceryStore.customer.basket[a-1] != null)
		{
			System.out.println("basket already full");
		}
		else
		{
			DeuGroceryStore.customer.basket[i] = addone;
			System.out.println("The item added basket succesfully");
		}
		
	}*/
