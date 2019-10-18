
public class Customer {
	
	String name;
	String surname;
	double money;
	boolean paytype;// true for cash , false for credit
	int size;
	Item[] basket;
	
	public Customer()
	{
		size = 10;
		name = "Furkan";
		surname = "Ayas";
		money =100;
		paytype=true;
		basket = new Item[size];
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public boolean isPaytype() {
		return paytype;
	}

	public void setPaytype(boolean paytype) {
		this.paytype = paytype;
	}

	public Item[] getBasket() {
		return basket;
	}

	public void setBasket(Item[] basket) {
		this.basket = basket;
	}
	
	

}
