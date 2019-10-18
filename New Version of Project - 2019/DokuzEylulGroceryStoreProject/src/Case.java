
public class Case {
	
	long money;
	
	Case()
	{
		money = 100000;
	}
	
	Case(int money)
	{
		this.money = money;
	}
	
	public long getMoney()
	{
		return money;
	}
	
	public void setMoney(int money)
	{
		this.money = money;
	}
	
	public void increaseCaseMoney(double price)
	{
		money = (long) (money + price);
	}
	
	public void decreaseCaseMoney(double price)
	{
		long total = (long) (money - price);
		if(total < 0 )
		{
			System.out.println("Total money less than 0");
		}
		else
		{
			money = (long) (money - price);
		}

	}

	@Override
	public String toString() {
		return "The Case is --> [money=" + money + "]";
	}

}
