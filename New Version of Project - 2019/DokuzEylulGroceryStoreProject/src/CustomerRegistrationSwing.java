//3

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



public class CustomerRegistrationSwing extends JFrame {
//public static DeuGroceryStore DGS = new DeuGroceryStore();
//public static Menu menu = new Menu();

private JPanel contentPane;
private JTextField txtCust;
private JTextField txtOne;
private JTextField textField_2;

/**
* Launch the application.
*/
public static void main(String[] args) {

EventQueue.invokeLater(new Runnable() {
public void run() {
try {
CustomerRegistrationSwing frame = new CustomerRegistrationSwing();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}


Customer thecustomer = MarketSwing.returnCustomer();

/**
* Create the frame.
*/
public CustomerRegistrationSwing() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 700, 300);
contentPane = new JPanel();
contentPane.setBackground(Color.CYAN);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);
JButton btnStartShopping = new JButton("Start Shopping");
btnStartShopping.setForeground(Color.BLACK);
btnStartShopping.setBackground(Color.RED);
btnStartShopping.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
	
	String name = txtCust.getText();
	String surname = txtOne.getText();
	double money = Double.parseDouble(textField_2.getText());
	
	
	thecustomer .setName(name);
	thecustomer .setSurname(surname);
	thecustomer .setMoney(money);

	

	new CustomerSwing().setVisible(true);
	setVisible(false);
	

}
});
btnStartShopping.setBounds(250, 189, 200, 29);
contentPane.add(btnStartShopping);



JButton btnCustomersystem = new JButton("Return");
btnCustomersystem.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) 
{
	
	new MarketSwing().setVisible(true);
	setVisible(false);

}
});
btnCustomersystem.setBounds(250, 230, 200, 29);
contentPane.add(btnCustomersystem);
JLabel lblDokuzeylulgrocerystoresystem = new JLabel("DokuzEylulGroceryStoreSystem");
lblDokuzeylulgrocerystoresystem.setHorizontalAlignment(SwingConstants.CENTER);
lblDokuzeylulgrocerystoresystem.setBackground(Color.LIGHT_GRAY);
lblDokuzeylulgrocerystoresystem.setBounds(6, 6, 694, 36);
contentPane.add(lblDokuzeylulgrocerystoresystem);
JLabel lblName = new JLabel("Name:");
lblName.setBounds(198, 54, 61, 16);
contentPane.add(lblName);
JLabel lblSurname = new JLabel("Surname:");
lblSurname.setBounds(181, 95, 61, 16);
contentPane.add(lblSurname);
JLabel lblMoney = new JLabel("Money:");
lblMoney.setBounds(181, 123, 61, 16);
contentPane.add(lblMoney);
txtCust = new JTextField();
txtCust.setText("cust");
txtCust.setBounds(252, 49, 130, 26);
contentPane.add(txtCust);
txtCust.setColumns(10);
txtOne = new JTextField();
txtOne.setText("one");
txtOne.setBounds(250, 82, 130, 26);
contentPane.add(txtOne);
txtOne.setColumns(10);
textField_2 = new JTextField();
textField_2.setText("300");
textField_2.setBounds(252, 118, 130, 26);
contentPane.add(textField_2);
textField_2.setColumns(10);
}
}



