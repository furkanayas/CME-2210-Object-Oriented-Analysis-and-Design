//1

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;



public class MarketSwing extends JFrame {
//public static DeuGroceryStore DGS = new DeuGroceryStore();
//public static Menu menu = new Menu();

private JPanel contentPane;

/**
* Launch the application.
*/

static Phone p1 = new Phone();
static Address a1 = new Address();
static BankAccount b1 = new BankAccount();

static Manager manager1 = new Manager("MAli","Koch",22,p1,3000.0,a1,b1);

GlobalOrderMarket gom = new GlobalOrderMarket();

static Employee cashier1 = new Cashier("CAslı","Yaratık",22,p1,5000.0,a1,b1);
static Employee stockman1 = new Stockman("StMehmet","Nimetsavar",22,p1,3000.0,a1,b1);
Employee security1 = new Security("SeAhmet","Kaya",22,p1,3000.0,a1,b1);

static ArrayList<Item> basket = new ArrayList<Item>();
static Customer thecustomer = new Customer("","",0.0,basket);

static Market themarket = new Market(manager1);


/*Market.getM().hireEmployee(cashier1);
themarket.getM().hireEmployee(stockman1);
themarket.getM().hireEmployee(security1);
*/
 
//manager1.hireEmployee(cashier1);manager1.hireEmployee(stockman1);manager1.hireEmployee(security1);
/*
public static Market returnMarket()
{
	return themarket;
}

public static Cashier returnCashier()
{
	return (Cashier) cashier1;
}
public static Stockman returnStockman()
{
	return (Stockman) stockman1;
}
*/
public static Customer returnCustomer()
{
	return thecustomer;
}

public static Market returnMarket()
{
	return themarket;
}


public static void main(String[] args) {
//	DeuGroceryStore DGS = new DeuGroceryStore();



EventQueue.invokeLater(new Runnable() {
public void run() {
try {
MarketSwing frame = new MarketSwing();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
*/
public MarketSwing() {
	
	Market.getM().hireEmployee(cashier1);
	Market.getM().hireEmployee(stockman1);
	Market.getM().hireEmployee(security1);
	
	
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 700, 300);
contentPane = new JPanel();
contentPane.setBackground(Color.CYAN);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);




JButton btnManagersystem = new JButton("Manager System");
btnManagersystem.setForeground(Color.BLACK);
btnManagersystem.setBackground(Color.RED);
btnManagersystem.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
	
			new ManagerLoginSwing().setVisible(true);
			setVisible(false);

	}
});
btnManagersystem.setBounds(250, 95, 200, 29);
contentPane.add(btnManagersystem);



JButton btnCustomersystem = new JButton("Customer System");
btnCustomersystem.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) 
	{
		new CustomerRegistrationSwing().setVisible(true);
		setVisible(false);
	}
});
btnCustomersystem.setBounds(250, 163, 200, 29);
contentPane.add(btnCustomersystem);
JLabel lblDokuzeylulgrocerystoresystem = new JLabel("DokuzEylulGroceryStoreSystem");
lblDokuzeylulgrocerystoresystem.setHorizontalAlignment(SwingConstants.CENTER);
lblDokuzeylulgrocerystoresystem.setBackground(Color.LIGHT_GRAY);
lblDokuzeylulgrocerystoresystem.setBounds(0, 33, 694, 36);
contentPane.add(lblDokuzeylulgrocerystoresystem);
}

}
