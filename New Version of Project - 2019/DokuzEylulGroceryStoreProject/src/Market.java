import java.util.ArrayList;
import java.util.List;

public class Market {
	
	final String marketname = "TheMarket";
	static List<Item> marketshelfitems = new ArrayList<Item>();
	static List<Item> marketstockitems = new ArrayList<Item>();
	static List<Employee> marketemployee = new ArrayList<Employee>();
	static Case marketcase = new Case();
	static Manager m;	

	
	public Market(Manager m)
	{
		//this.m = m;
		

		
		Item i1 = new Item("ekmek",10,"000001");
		Item i2 = new Item("tuz",20,"000002");
		Item i3 = new Item("su",30,"000003");
		Item i4 = new Item("cikolata",10,"000004");
		Item i5 = new Item("portakal",20,"000005");
		Item i6 = new Item("limon",30,"000006");
		Item i7 = new Item("dergi",10,"000007");
		Item i8 = new Item("dondurma",20,"000008");
		Item i9 = new Item("tavuk",30,"000009");
		Item i10 = new Item("kırmızıet",10,"000010");
		Item i11 = new Item("jelibon",20,"000012");
		Item i12 = new Item("oyuncakaraba",30,"000013");
		
		 
		Market.marketshelfitems.add(i1);Market.marketshelfitems.add(i2);Market.marketshelfitems.add(i3);
		Market.marketshelfitems.add(i1);Market.marketshelfitems.add(i2);Market.marketshelfitems.add(i3);
		Market.marketshelfitems.add(i4);Market.marketshelfitems.add(i5);Market.marketshelfitems.add(i6);
		Market.marketshelfitems.add(i7);Market.marketshelfitems.add(i8);Market.marketshelfitems.add(i9);
		Market.marketshelfitems.add(i10);Market.marketshelfitems.add(i11);Market.marketshelfitems.add(i12);
		 
		Market.marketshelfitems.add(i1);Market.marketshelfitems.add(i2);Market.marketshelfitems.add(i3);
		Market.marketshelfitems.add(i1);Market.marketshelfitems.add(i2);Market.marketshelfitems.add(i3);
		Market.marketshelfitems.add(i4);Market.marketshelfitems.add(i5);Market.marketshelfitems.add(i6);
		Market.marketshelfitems.add(i7);Market.marketshelfitems.add(i8);Market.marketshelfitems.add(i9);
		Market.marketshelfitems.add(i10);Market.marketshelfitems.add(i11);Market.marketshelfitems.add(i12);
		
		 
		Market.marketshelfitems.add(i1);Market.marketshelfitems.add(i2);Market.marketshelfitems.add(i3);
		Market.marketshelfitems.add(i1);Market.marketshelfitems.add(i2);Market.marketshelfitems.add(i3);
		Market.marketshelfitems.add(i4);Market.marketshelfitems.add(i5);Market.marketshelfitems.add(i6);
		Market.marketshelfitems.add(i7);Market.marketshelfitems.add(i8);Market.marketshelfitems.add(i9);
		Market.marketshelfitems.add(i10);Market.marketshelfitems.add(i11);Market.marketshelfitems.add(i12);
		   
		
		Market.marketstockitems.add(i12);	Market.marketstockitems.add(i12);	Market.marketstockitems.add(i12);
		Market.marketstockitems.add(i11);	Market.marketstockitems.add(i11);	Market.marketstockitems.add(i11);
		
	}


	public static Manager getM() {
		return m;
	}
	
	public static Case getCase() {
		return marketcase;
	}
	



	


}
