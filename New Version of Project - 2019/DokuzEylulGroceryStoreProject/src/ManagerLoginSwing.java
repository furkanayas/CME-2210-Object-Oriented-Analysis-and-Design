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



public class ManagerLoginSwing extends JFrame {
//public static DeuGroceryStore DGS = new DeuGroceryStore();
//public static Menu menu = new Menu();

private JPanel contentPane;
private JTextField textField;
private JTextField textField_1;

/**
* Launch the application.
*/
public static void main(String[] args) {
//	DeuGroceryStore DGS = new DeuGroceryStore();

Phone p1 = new Phone();
Address a1 = new Address();
BankAccount b1 = new BankAccount();

Manager m = new Manager("MFurkan","Ayas",22,p1,3000.0,a1,b1);
final Market market = new Market(m);
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
public ManagerLoginSwing() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 700, 300);
contentPane = new JPanel();
contentPane.setBackground(Color.CYAN);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);
JButton btnLogin = new JButton("Login");
btnLogin.setForeground(Color.BLACK);
btnLogin.setBackground(Color.RED);
btnLogin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
	
	String id = textField.getText();
	String password = textField_1.getText();
	
	if(Manager.getId().equals(id) && Manager.getPassword().equals(password))
	{
		
		new ManagerSwing().setVisible(true);
		setVisible(false);
		
	}
	
	else
	{
		new MarketSwing().setVisible(true);
		setVisible(false);
	}
	



}
});
btnLogin .setBounds(250, 202, 200, 29);
contentPane.add(btnLogin);
JButton btnReturn = new JButton("Return");
btnReturn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) 
{
new MarketSwing().setVisible(true);
setVisible(false);

}
});
btnReturn.setBounds(250, 243, 200, 29);
contentPane.add(btnReturn);
JLabel lblDokuzeylulgrocerystoresystem = new JLabel("DokuzEylulGroceryStoreSystem");
lblDokuzeylulgrocerystoresystem.setHorizontalAlignment(SwingConstants.CENTER);
lblDokuzeylulgrocerystoresystem.setBackground(Color.LIGHT_GRAY);
lblDokuzeylulgrocerystoresystem.setBounds(6, 6, 688, 36);
contentPane.add(lblDokuzeylulgrocerystoresystem);
JLabel lblManagerId = new JLabel("Manager Id");
lblManagerId.setHorizontalAlignment(SwingConstants.CENTER);
lblManagerId.setBounds(290, 54, 118, 16);
contentPane.add(lblManagerId);
textField = new JTextField();
textField.setBounds(250, 82, 200, 26);
contentPane.add(textField);
textField.setColumns(10);
JLabel lblManagerPassword = new JLabel("Manager Password");
lblManagerPassword.setHorizontalAlignment(SwingConstants.CENTER);
lblManagerPassword.setBounds(290, 120, 118, 16);
contentPane.add(lblManagerPassword);
textField_1 = new JTextField();
textField_1.setBounds(250, 148, 200, 26);
contentPane.add(textField_1);
textField_1.setColumns(10);
}
}
