
public class Market {
	final boolean withpieces = true; final boolean withweight = true;
	String name = "TheMarket";
	Item[] items;
	int marketsize = 100;
	
	public Market()
	{
		
		Item[] market = new Item[7];
		
		 
		Item ekmek = new Item("ekmek",1.25,"000001",withpieces);
		Item çikolata = new Item("çikolata",3.25,"000002",withpieces);
		Item dondurma = new Item("Dondurma",2.5,"000003",withpieces);	 
		Item su = new Item("Su",1,"000004",withpieces);
		
		
		Item biber = new Item("biber",2.00,"100001",withweight);
		Item domates = new Item("domates",2.25,"100002",withweight);
		Item muz = new Item("Muz",8.20,"100003",withweight);
		
		market[0] = ekmek;
		market[1] = çikolata;
		market[2] = dondurma;
		market[3] = su;
		market[4] = biber;
		market[5] = domates;
		market[6] = muz;
		
		
		items = new Item[marketsize];
		 
		int x = 0;
		for (int i = 0; i < market.length; i++) {
			
			for (int j = 0; j < 4; j++) {
				items[x] = market[i];
				x++;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public int getMarketsize() {
		return marketsize;
	}

	public void setMarketsize(int marketsize) {
		this.marketsize = marketsize;
	}
	
	
	
	 

}
