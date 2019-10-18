
public class Item {

	public static final boolean withpieces = true; public static final boolean withweight = true;
	String name;
	double price;
	String barcode;//6bas
	boolean type;
	
	Item()
	{
		name ="non";
		price = 0.0;
		barcode = "000000";
		type = false;
	}

	Item(String name, double price, String barcode, boolean type) {
		this.name = name;
		this.price = price;
		this.barcode = barcode;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public static boolean isWithpieces() {
		return withpieces;
	}

	public static boolean isWithweight() {
		return withweight;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", barcode=" + barcode + ", type=" + type + "]";
	}
	
	
	
	
	
	
}
