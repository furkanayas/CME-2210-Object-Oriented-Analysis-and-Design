import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class Customer {
	

	
	protected String name;
	protected String surname;
	protected double money;
	protected List<Item> basket = new ArrayList<Item>();

	
	public Customer()
	{

	}
	
	public Customer(String name,String surname,double money, List<Item> basket)
	{
		this.name = name;
		this.surname = surname;
		this.money = money;
		this.basket = basket;
	}
	
	
	public void takeItem(int take)
	{
		basket.add(Market.marketshelfitems.remove(take));
		//Customer.basket.add(Market.marketshelfitems.remove(take));
	}
	
	public void removeItem(int take)
	{
		Market.marketshelfitems.add(basket.remove(take));
		//Customer.basket.add(Market.marketshelfitems.remove(take));
	}
	
	
	
	public String printBasket()
	{
		String ret = "";
		if(basket.size() == 0)
		{
			ret = "empty";
		}
		else
		{
			for (int i = 0; i < basket.size(); i++) {
				
				ret = ret + basket.get(i) +"\n";
			}			
		}
		

		return ret;
	}
	
	public double calculateBasket()
	{
		double ret = 0;
		for (int i = 0; i < basket.size(); i++) {
			
			ret = ret + basket.get(i).getPrice();
		}
		
		return ret;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Customer [getName()=" + getName() + ", getSurname()=" + getSurname() + ", getMoney()=" + getMoney()
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getBasket() {
		return basket;
	}

	public void setBasket(List<Item> basket) {
		this.basket = basket;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}



	

}
