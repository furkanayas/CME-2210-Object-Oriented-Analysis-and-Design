import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name,String surname,int age,Phone phone, double salary, Address address, BankAccount bka
		Phone p1 = new Phone();
		Address a1 = new Address();
		BankAccount b1 = new BankAccount();

		Employee e1 = new Cashier("CFurkan","Ayas",22,p1,5000.0,a1,b1);
		Manager m = new Manager("MFurkan","Ayas",22,p1,3000.0,a1,b1);
		Employee e3 = new Stockman("StFurkan","Ayas",22,p1,3000.0,a1,b1);
		Employee e4 = new Security("SeFurkan","Ayas",22,p1,3000.0,a1,b1);

		
		Item i1 = new Item("ekmek",10,"000001");
		Item i2 = new Item("tuz",20,"000002");
		Item i3 = new Item("su",30,"000003");
		
		List<Employee> marketemployee = new ArrayList<Employee>();
		marketemployee.add(e1);marketemployee.add(e3);marketemployee.add(e4);
		
		List<Item> marketitems = new ArrayList<Item>();
		marketitems.add(i1);marketitems.add(i2);marketitems.add(i3);
		
		Market mark = new Market(m);
		
		System.gc();

		
	}

}
