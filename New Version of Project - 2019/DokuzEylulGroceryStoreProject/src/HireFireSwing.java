//1

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;



public class HireFireSwing extends JFrame {
//public static DeuGroceryStore DGS = new DeuGroceryStore();
//public static Menu menu = new Menu();

private JPanel contentPane;
private JTextField textFieldName;
private JTextField textFieldFire;
private JTextField textFieldSurname;
private JTextField textFieldAge;
private JTextField textFieldCountryCode;
private JTextField textFieldTenNumber;
private JTextField textFieldCountry;
private JTextField textFieldCity;
private JTextField textFieldStretName;
private JTextField textFieldStreetNumber;
private JTextField textFieldDoorNumber;
private JTextField textFieldEmployeeType;
private JTextField textFieldSalary;

/**
* Launch the application.
*/
public static void main(String[] args) {
//	DeuGroceryStore DGS = new DeuGroceryStore();

Phone p1 = new Phone();
Address a1 = new Address();
BankAccount b1 = new BankAccount();

Manager m = new Manager("MFurkan","Ayas",22,p1,3000.0,a1,b1);

Employee e1 = new Cashier("CFurkan","Ayas",22,p1,5000.0,a1,b1);
Employee e3 = new Stockman("StFurkan","Ayas",22,p1,3000.0,a1,b1);
Employee e4 = new Security("SeFurkan","Ayas",22,p1,3000.0,a1,b1);


final Market market = new Market(m);

m.hireEmployee(e1);m.hireEmployee(e3);m.hireEmployee(e4);
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
HireFireSwing frame = new HireFireSwing();
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
public HireFireSwing() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 1076, 623);
contentPane = new JPanel();
contentPane.setBackground(Color.CYAN);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);

JTextArea textArea = new JTextArea();
textArea.setBounds(329, 73, 715, 422);
contentPane.add(textArea);

textArea.setText(Manager.printEmployees());

JButton btnHire = new JButton("Hire");
btnHire.setForeground(Color.BLACK);
btnHire.setBackground(Color.RED);
btnHire.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
	
	String name = textFieldName.getText();
	String surname = textFieldSurname.getText();
	int age = Integer.parseInt(textFieldAge.getText());
	
	String countrycode = textFieldCountryCode.getText();
	String tennumber = textFieldTenNumber.getText();

	
	String country = textFieldCountry.getText();
	String city = textFieldCity.getText();
	String streetname = textFieldStretName.getText();
	
	int streetnumber = Integer.parseInt(textFieldStreetNumber.getText());
	int doornumber = Integer.parseInt(textFieldDoorNumber.getText());
	
	int employeetype = Integer.parseInt(textFieldEmployeeType.getText());
	
	double salary = Double.parseDouble(textFieldSalary.getText());
	
	Phone p1 = new Phone(countrycode,tennumber);
	Address a1 = new Address(country,city,streetname,streetnumber,doornumber);
	BankAccount b1 = new BankAccount();
	
	Employee el = new Employee(name,surname,age,p1,salary,a1,b1,employeetype);
	
	Market.marketemployee.add(el);
	
	textArea.setText(Manager.printEmployees());
	
}
});
btnHire.setBounds(6, 566, 246, 29);
contentPane.add(btnHire);
JButton btnFire = new JButton("Fire");
btnFire.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) 
{
	int input = Integer.parseInt(textFieldFire.getText());
	
	Market.marketemployee.remove(input);
	textArea.setText(Manager.printEmployees());
	
}
});
btnFire.setBounds(471, 507, 231, 29);
contentPane.add(btnFire);
JLabel lblDokuzeylulgrocerystoresystem = new JLabel("DokuzEylulGroceryStoreSystem");
lblDokuzeylulgrocerystoresystem.setHorizontalAlignment(SwingConstants.CENTER);
lblDokuzeylulgrocerystoresystem.setBackground(Color.LIGHT_GRAY);
lblDokuzeylulgrocerystoresystem.setBounds(6, 6, 694, 36);
contentPane.add(lblDokuzeylulgrocerystoresystem);
textFieldName = new JTextField();
textFieldName.setText("ahmet");
textFieldName.setBounds(122, 54, 130, 26);
contentPane.add(textFieldName);
textFieldName.setColumns(10);
JLabel lblName = new JLabel("Name:");
lblName.setBounds(16, 59, 61, 16);
contentPane.add(lblName);
JLabel lblSurname = new JLabel("Surname:");
lblSurname.setBounds(16, 87, 61, 16);
contentPane.add(lblSurname);
JLabel lblAge = new JLabel("Age:");
lblAge.setBounds(16, 115, 61, 16);
contentPane.add(lblAge);
JLabel lblPhone = new JLabel("Phone:");
lblPhone.setBounds(16, 202, 61, 16);
contentPane.add(lblPhone);
JLabel lblCountryCode = new JLabel("Country Code:");
lblCountryCode.setBounds(16, 230, 92, 16);
contentPane.add(lblCountryCode);
JLabel lblTenNumber = new JLabel("Ten Number:");
lblTenNumber.setBounds(16, 258, 92, 16);
contentPane.add(lblTenNumber);
JLabel lblCountry = new JLabel("Country");
lblCountry.setBounds(16, 330, 61, 16);
contentPane.add(lblCountry);
JLabel lblCity = new JLabel("City:");
lblCity.setBounds(16, 358, 61, 16);
contentPane.add(lblCity);
JLabel lblStreetName = new JLabel("Street Name:");
lblStreetName.setBounds(16, 386, 92, 16);
contentPane.add(lblStreetName);
JLabel lblStreetNumber = new JLabel("Street Number:");
lblStreetNumber.setBounds(16, 413, 105, 16);
contentPane.add(lblStreetNumber);
JLabel lblDoorNumber = new JLabel("Door Number:");
lblDoorNumber.setBounds(16, 441, 92, 16);
contentPane.add(lblDoorNumber);
textFieldFire = new JTextField();
textFieldFire.setBounds(329, 507, 130, 26);
contentPane.add(textFieldFire);
textFieldFire.setColumns(10);

textFieldSurname = new JTextField();
textFieldSurname.setText("yıldırım");
textFieldSurname.setBounds(122, 82, 130, 26);
contentPane.add(textFieldSurname);
textFieldSurname.setColumns(10);
textFieldAge = new JTextField();
textFieldAge.setText("21");
textFieldAge.setBounds(122, 110, 130, 26);
contentPane.add(textFieldAge);
textFieldAge.setColumns(10);
textFieldCountryCode = new JTextField();
textFieldCountryCode.setText("+90");
textFieldCountryCode.setBounds(122, 225, 130, 26);
contentPane.add(textFieldCountryCode);
textFieldCountryCode.setColumns(10);
textFieldTenNumber = new JTextField();
textFieldTenNumber.setText("1234512345");
textFieldTenNumber.setBounds(122, 253, 130, 26);
contentPane.add(textFieldTenNumber);
textFieldTenNumber.setColumns(10);
JLabel lblAddress = new JLabel("Address:");
lblAddress.setBounds(16, 302, 61, 16);
contentPane.add(lblAddress);
textFieldCountry = new JTextField();
textFieldCountry.setText("turkey");
textFieldCountry.setBounds(122, 325, 130, 26);
contentPane.add(textFieldCountry);
textFieldCountry.setColumns(10);
textFieldCity = new JTextField();
textFieldCity.setText("izmir");
textFieldCity.setBounds(122, 353, 130, 26);
contentPane.add(textFieldCity);
textFieldCity.setColumns(10);
textFieldStretName = new JTextField();
textFieldStretName.setText("gul");
textFieldStretName.setBounds(122, 381, 130, 26);
contentPane.add(textFieldStretName);
textFieldStretName.setColumns(10);
textFieldStreetNumber = new JTextField();
textFieldStreetNumber.setText("273");
textFieldStreetNumber.setBounds(122, 408, 130, 26);
contentPane.add(textFieldStreetNumber);
textFieldStreetNumber.setColumns(10);
textFieldDoorNumber = new JTextField();
textFieldDoorNumber.setText("8");
textFieldDoorNumber.setBounds(122, 436, 130, 26);
contentPane.add(textFieldDoorNumber);
textFieldDoorNumber.setColumns(10);


JButton btnPrintEmployee = new JButton("Print Employee");
btnPrintEmployee.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		textArea.setText(Manager.printEmployees());
		
	}
});
btnPrintEmployee.setBounds(329, 40, 117, 29);
contentPane.add(btnPrintEmployee);
JButton btnReturn = new JButton("Return");
btnReturn.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		new ManagerSwing().setVisible(true);
		setVisible(false);
	}
});
btnReturn.setBounds(471, 40, 117, 29);
contentPane.add(btnReturn);
JLabel lblEmployeeType = new JLabel("Employee Type:");
lblEmployeeType.setBounds(16, 512, 105, 16);
contentPane.add(lblEmployeeType);
textFieldEmployeeType = new JTextField();
textFieldEmployeeType.setText("4");
textFieldEmployeeType.setBounds(122, 507, 45, 26);
contentPane.add(textFieldEmployeeType);
textFieldEmployeeType.setColumns(10);
JLabel lblSalary = new JLabel("Salary:");
lblSalary.setBounds(16, 538, 61, 16);
contentPane.add(lblSalary);
textFieldSalary = new JTextField();
textFieldSalary.setText("3000");
textFieldSalary.setBounds(122, 533, 130, 26);
contentPane.add(textFieldSalary);
textFieldSalary.setColumns(10);
}
}
