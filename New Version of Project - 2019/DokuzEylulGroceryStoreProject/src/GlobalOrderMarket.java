import java.util.ArrayList;
import java.util.List;

public class GlobalOrderMarket {
	final String GlobalOrderMarket = "TheGlobalOrderMarket";
	static List<Item> GlobalOrderMarketItems = new ArrayList<Item>();
	static Case GlobalOrderMarketCase = new Case();
	
	public GlobalOrderMarket()
	{	
		List<Item> Items = new ArrayList<Item>();
		
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
		Item i13 = new Item("domates",10,"000010");
		Item i14 = new Item("zeytin",20,"000012");
		Item i15 = new Item("peynir",30,"000013");
		

		Items.add(i1);Items.add(i2);Items.add(i3);Items.add(i4);Items.add(i5);
		Items.add(i6);Items.add(i7);Items.add(i8);Items.add(i9);Items.add(i10);
		Items.add(i11);Items.add(i12);Items.add(i13);Items.add(i14);Items.add(i15);
		

		for (int j = 0; j < Items.size(); j++) {
			for (int i = 0; i < 4; i++) {	
			GlobalOrderMarketItems.add(Items.get(j));
			}
		}
	}
	
	public static String printGMItems()
	{
		String ret = "";
		for (int i = 0; i < GlobalOrderMarketItems.size(); i++) {
			
			ret = ret + i +" : "+ GlobalOrderMarketItems.get(i) +"\n";
		}
		
		return ret;

	}
	

}
