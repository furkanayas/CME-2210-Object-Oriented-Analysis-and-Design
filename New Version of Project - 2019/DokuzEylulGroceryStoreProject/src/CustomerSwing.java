//3

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;


public class CustomerSwing extends JFrame {

/*	MarketSwing ms = new MarketSwing();

	Market themarket = ms.returnMarket();
	
	Customer thecustomer = ms.returnCustomer();
	
	*/
//public static DeuGroceryStore DGS = new DeuGroceryStore();
//public static Menu menu = new Menu();
//public static Menu menu = DGSSystem.menu;
//public static DeuGroceryStore DGS = DGSSystem.DGS;
private JPanel contentPane;
private JTextField textFieldTakeInput;
private JTextField textFieldValueResult;
private JTextField textFieldErrorResult;
private JTextField textFieldReleaseInput;
private JTextField txtOperationNameBox;
private JTextField textFieldCustomerInfoResult;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
CustomerSwing frame = new CustomerSwing();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}



Customer thecustomer = MarketSwing.returnCustomer();
Market themarket = MarketSwing.returnMarket();

/**
* Create the frame.
*/
public CustomerSwing() {
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(200, 200, 1157, 524);
contentPane = new JPanel();
contentPane.setBackground(Color.CYAN);
setContentPane(contentPane);
contentPane.setLayout(null);





JTextArea txtArea1 = new JTextArea(20,30);
txtArea1.setBounds(639, 72, 147, 410);
contentPane.add(txtArea1);

JScrollPane scrollPane = new JScrollPane(txtArea1);
scrollPane.setBounds(264, 72, 420, 410);
contentPane.add(scrollPane);


JTextArea txtArea2 = new JTextArea();
txtArea2.setBounds(1077, 74, 61, 97);
contentPane.add(txtArea2);

JScrollPane scrollPane_1 = new JScrollPane(txtArea2);
scrollPane_1.setBounds(718, 72, 420, 410);
contentPane.add(scrollPane_1);


JTextArea txtOperationResultBox = new JTextArea();
txtOperationResultBox.setColumns(15);
txtOperationResultBox.setEditable(false);
txtOperationResultBox.setBounds(6, 315, 246, 26);
contentPane.add(txtOperationResultBox);

JScrollPane scrollPane_2 = new JScrollPane(txtOperationResultBox);
scrollPane_2.setBounds(10, 396, 246, 48);
contentPane.add(scrollPane_2);



JLabel lblShelf = new JLabel("Shelf");
lblShelf.setBounds(264, 44, 61, 16);
contentPane.add(lblShelf);
JLabel lblBasket = new JLabel("Basket");
lblBasket.setBounds(718, 46, 61, 16);
contentPane.add(lblBasket);
JLabel lblInput = new JLabel("input:");
lblInput.setHorizontalAlignment(SwingConstants.CENTER);
lblInput.setBounds(135, 44, 61, 16);
contentPane.add(lblInput);
textFieldTakeInput = new JTextField();
textFieldTakeInput.setBounds(135, 72, 61, 26);
contentPane.add(textFieldTakeInput);
textFieldTakeInput.setColumns(10);
textFieldValueResult = new JTextField();
textFieldValueResult.setEditable(false);
textFieldValueResult.setBounds(191, 369, 61, 26);
contentPane.add(textFieldValueResult);
textFieldValueResult.setColumns(10);
textFieldErrorResult = new JTextField();
textFieldErrorResult.setBounds(42, 456, 210, 26);
contentPane.add(textFieldErrorResult);
textFieldErrorResult.setColumns(10);
textFieldReleaseInput = new JTextField();
textFieldReleaseInput.setBounds(135, 113, 61, 26);
contentPane.add(textFieldReleaseInput);
textFieldReleaseInput.setColumns(10);


JLabel lblCustomerInfo = new JLabel("Customer Info:");
lblCustomerInfo.setBounds(264, 19, 100, 16);
contentPane.add(lblCustomerInfo);
textFieldCustomerInfoResult = new JTextField();
textFieldCustomerInfoResult.setEditable(false);
textFieldCustomerInfoResult.setBounds(366, 14, 733, 26);
contentPane.add(textFieldCustomerInfoResult);
textFieldCustomerInfoResult.setColumns(10);




textFieldCustomerInfoResult.setText("Name : "+thecustomer.getName()+ "  Surname : " + thecustomer.getSurname() + "  Money : "+ Double.toString(thecustomer.getMoney()));
txtArea1.setText(Stockman.printShelfItems());
txtArea2.setText(thecustomer.printBasket());

JButton btnTakeItem = new JButton("Take item");
btnTakeItem.setForeground(Color.BLACK);
btnTakeItem.setBackground(Color.WHITE);
btnTakeItem.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//	txtArea1.setText(Stockman.printShelfItems());
//	txtArea2.setText(thecustomer.printBasket());
/*
try
{
}
catch(InputMismatchException er)
{
textFieldErrorResult.setText("That is not an integer, please try again." );
}
*/
int input = -1;
input = Integer.parseInt(textFieldTakeInput.getText());
if(input <= themarket.marketshelfitems.size() && input >= 0)
{

	Item item = themarket.marketshelfitems.get(input);
	thecustomer.takeItem(input);
	
	
textFieldValueResult.setText(Integer.toString(input));
//thecustomer.basket.add(themarket.marketshelfitems.remove(input));
txtOperationResultBox.setText(item.toString());
//input = -1;
textFieldTakeInput.setText(""); 
txtArea1.setText(Stockman.printShelfItems());
txtArea2.setText(thecustomer.printBasket());
textFieldErrorResult.setText("");
txtOperationNameBox.setText("Taken");
}
else
{

textFieldErrorResult.setText("bos yada sınırlar dısında");
}
}
});
btnTakeItem.setBounds(6, 72, 117, 29);
contentPane.add(btnTakeItem);

JLabel lblValue = new JLabel("Value:");
lblValue.setHorizontalAlignment(SwingConstants.TRAILING);
lblValue.setBounds(128, 374, 47, 16);
contentPane.add(lblValue);
JLabel lblError = new JLabel("Error:");
lblError.setBounds(6, 461, 40, 16);
contentPane.add(lblError);
JButton btnReleaseItem = new JButton("Release item");
btnReleaseItem.setBackground(Color.RED);
btnReleaseItem.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) 
{
int input2 = -1;
input2 = Integer.parseInt(textFieldReleaseInput.getText());
if(input2 <= themarket.marketshelfitems.size() && input2 >= 0)
{
	Item item = thecustomer.basket.get(input2);
	
	thecustomer.removeItem(input2);
	
textFieldValueResult.setText(Integer.toString(input2));

//themarket.marketshelfitems.add(thecustomer.basket.remove(input2));
txtOperationResultBox.setText(item.toString());
//input = -1;
textFieldTakeInput.setText(""); 
textFieldReleaseInput.setText(""); 
txtArea1.setText(Stockman.printShelfItems());
txtArea2.setText(thecustomer.printBasket());
textFieldErrorResult.setText("");
txtOperationNameBox.setText("Release");
}
else
{

textFieldErrorResult.setText("bos yada sınırlar dısında");
}
}
});
btnReleaseItem.setBounds(6, 113, 117, 29);
contentPane.add(btnReleaseItem);
txtOperationNameBox = new JTextField();
txtOperationNameBox.setBorder(null);
txtOperationNameBox.setBackground(Color.CYAN);
txtOperationNameBox.setEditable(false);
txtOperationNameBox.setText("Operation");
txtOperationNameBox.setBounds(6, 369, 117, 26);
contentPane.add(txtOperationNameBox);
txtOperationNameBox.setColumns(10);




JButton btnCalculateBasket = new JButton("Calculate Basket");
btnCalculateBasket.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) 
{
double price = thecustomer.calculateBasket();
txtOperationNameBox.setText("Basket Price");
txtOperationResultBox.setText(Double.toString(price));
}
});
btnCalculateBasket.setBounds(6, 154, 190, 29);
contentPane.add(btnCalculateBasket);


JButton btnBuyBasket = new JButton("Buy Basket");
btnBuyBasket.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{

	Cashier.takePayment(thecustomer);
	
	txtArea2.setText(thecustomer.printBasket());
	
//thecustomer.setMoney(thecustomer.getMoney() - thecustomer.calculateBasket());
txtOperationNameBox.setText("Customer money");
txtOperationResultBox.setText(Double.toString(thecustomer.getMoney()));
textFieldCustomerInfoResult.setText("Name : "+thecustomer.getName()+ "  Surname : " + thecustomer.getSurname() + "  Money : "+ Double.toString(thecustomer.getMoney()));

}
});
btnBuyBasket.setBounds(6, 194, 190, 29);
contentPane.add(btnBuyBasket);












/*
int[] selct = new int[themarket.marketshelfitems.size()];
for (int i = 0; i < themarket.marketshelfitems.size(); i++) {
selct[i] = i;
}
JComboBox comboBox = new JComboBox(selct);
comboBox.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
// Object obj = comboBox.getSelectedItem(); 
int inp;
inp = (int) comboBox.getSelectedItem();
//	comboBox.setSelectedItem("item2");
//	   obj = comboBox.getSelectedItem(); 

   // If the new value is not in the list of valid items, the call is ignored
//	   comboBox.setSelectedItem("item3");
//	   obj = comboBox.getSelectedItem();
 

thecustomer.basket.add(themarket.marketshelfitems.remove(inp));
String ekranabas = Stockman.printShelfItems();
txtEkranthecustomer.setText(ekranabas);
 
}
});
comboBox.setBounds(6, 62, 182, 65);
contentPane.add(comboBox);
*/
/*
String[] a = new String[themarket.marketshelfitems.size()];
for (int i = 0; i < themarket.marketshelfitems.size(); i++) {
a[i] = themarket.marketshelfitems.get(i).getBarcode();
}
JComboBox comboBox = new JComboBox(a);
comboBox.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
// Object obj = comboBox.getSelectedItem(); 
String inp = "";
inp = (String) comboBox.getSelectedItem();
//	comboBox.setSelectedItem("item2");
//	   obj = comboBox.getSelectedItem(); 

   // If the new value is not in the list of valid items, the call is ignored
//	   comboBox.setSelectedItem("item3");
//	   obj = comboBox.getSelectedItem();
 
Item item = new Item();
 
for (int i = 0; i < themarket.marketshelfitems.size(); i++)
{
if(inp.equals(themarket.marketshelfitems.get(i)))
{
item = themarket.marketshelfitems.get(i);
}
}
themarket.marketshelfitems.remove(item);
thecustomer.basket.add(item);
String ekranabas = Stockman.printShelfItems();
txtEkranthecustomer.setText(ekranabas);
 
}
});
comboBox.setBounds(6, 62, 182, 65);
contentPane.add(comboBox);
*/

 
}
}

