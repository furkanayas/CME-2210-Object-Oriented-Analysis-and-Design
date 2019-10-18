//2

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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.Color;

public class ManagerSwing extends JFrame{

//	public static Menu menu = DGSSystem.menu;
//public static DeuGroceryStore DGS = DGSSystem.DGS;
private JPanel contentPane;
private JTextField textFieldshst;
private JTextField txtFieldShelf;
private JTextField txtFieldStock;
private JTextField textFieldstsh;
private JTextField txtOperationResultBox;
private JTextField txtOperationNameBox;
private JTextField textFieldErrorResult;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
ManagerSwing frame = new ManagerSwing();
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
public ManagerSwing() {
	

	
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 1140, 560);
contentPane = new JPanel();
contentPane.setBackground(Color.CYAN);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);

textFieldshst = new JTextField();
textFieldshst.setToolTipText("You can enter your choose in here");
textFieldshst.setBounds(182, 71, 57, 26);
contentPane.add(textFieldshst);
textFieldshst.setColumns(10);


JTextArea txtAreaShelf = new JTextArea();
txtAreaShelf.setColumns(30);
txtAreaShelf.setBounds(592, 40, 80, 493);
contentPane.add(txtAreaShelf);
txtAreaShelf.setWrapStyleWord(true);
txtAreaShelf.setEditable(false);
txtAreaShelf.setText("...");
JTextArea txtAreaStock = new JTextArea();
txtAreaStock.setColumns(30);
txtAreaStock.setEditable(false);
txtAreaStock.setText("...");
txtAreaStock.setBounds(1063, 40, 51, 493);
contentPane.add(txtAreaStock);

JScrollPane scrollPaneShelf = new JScrollPane(txtAreaShelf);
scrollPaneShelf.setBounds(272, 52, 408, 480);
contentPane.add(scrollPaneShelf);

JScrollPane scrollPaneStock = new JScrollPane(txtAreaStock);
scrollPaneStock.setBounds(704, 52, 410, 480);
contentPane.add(scrollPaneStock);




txtFieldShelf = new JTextField();
txtFieldShelf.setBorder(null);
txtFieldShelf.setBackground(Color.CYAN);
txtFieldShelf.setText("Shelf");
txtFieldShelf.setBounds(272, 16, 130, 26);
txtFieldShelf.setEditable(false);
contentPane.add(txtFieldShelf);
txtFieldShelf.setColumns(10);
txtFieldStock = new JTextField();
txtFieldStock.setBackground(Color.CYAN);
txtFieldStock.setBorder(null);
txtFieldStock.setText("Stock");
txtFieldStock.setBounds(704, 16, 130, 26);
txtFieldStock.setEditable(false);
contentPane.add(txtFieldStock);
txtFieldStock.setColumns(10);
JLabel lblManagersystem = new JLabel("ManagerSystem");
lblManagersystem.setBounds(42, 40, 98, 16);
contentPane.add(lblManagersystem);




txtAreaShelf.setText(Stockman.printShelfItems());

txtAreaStock.setText(Stockman.printStockItems());


JButton btnDgssystem = new JButton("return DGS System");
btnDgssystem.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
new MarketSwing().setVisible(true);
setVisible(false);
}
});
btnDgssystem.setBounds(6, 384, 150, 30);
contentPane.add(btnDgssystem);
JButton btnListshelf = new JButton("ListShelf");
btnListshelf.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
txtFieldShelf.setText("Shelf");
txtFieldStock.setText("Stock");
String ekranabas = Stockman.printShelfItems();
txtAreaShelf.setText(ekranabas);
}
});
btnListshelf.setBounds(21, 135, 109, 30);
contentPane.add(btnListshelf);
JButton btnListstock = new JButton("ListStock");
btnListstock.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
txtFieldShelf.setText("Shelf");
txtFieldStock.setText("Stock");
String ekranabas = Stockman.printStockItems();
txtAreaStock.setText(ekranabas);
}
});
btnListstock.setBounds(131, 135, 109, 30);
contentPane.add(btnListstock);
JButton btnAdditemtShfSt = new JButton("Add Stock -> Shelf");
btnAdditemtShfSt.setToolTipText("Add ItemtoShelf from Stocks");
btnAdditemtShfSt.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) 
{
	//  stock -> shelf
	
	int input = -1;
	input = Integer.parseInt(textFieldstsh.getText());
	if(input <= Market.marketstockitems.size() && input >= 0)
	{

	textFieldstsh.setText(Integer.toString(input));
	Item item = Market.marketstockitems.get(input);
	Market.marketshelfitems.add(Market.marketstockitems.remove(input));
	txtOperationResultBox.setText(item.toString());
	//input = -1;
	textFieldstsh.setText(""); 
	txtAreaShelf.setText(Stockman.printShelfItems());
	txtAreaStock.setText(Stockman.printStockItems());
	textFieldErrorResult.setText("");
	txtOperationNameBox.setText("stock to shelf");
	}
	else
	{

	textFieldErrorResult.setText("bos yada sınırlar dısında");
	}
	


}
});
btnAdditemtShfSt.setActionCommand("Add Shelf to Stock");
btnAdditemtShfSt.setBounds(20, 100, 150, 30);
contentPane.add(btnAdditemtShfSt);
JButton btnBuyItmfrmrkt = new JButton("Shelf -> Stock");
btnBuyItmfrmrkt.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) 
{
	
	int input = -1;
	input = Integer.parseInt(textFieldshst.getText());
	if(input <= Market.marketshelfitems.size() && input >= 0)
	{

	textFieldshst.setText(Integer.toString(input));
	Item item = Market.marketshelfitems.get(input);
	Market.marketstockitems.add(Market.marketshelfitems.remove(input));
	txtOperationResultBox.setText(item.toString());
	//input = -1;
	textFieldshst.setText(""); 
	
	txtAreaShelf.setText(Stockman.printShelfItems());
	txtAreaStock.setText(Stockman.printStockItems());
	textFieldErrorResult.setText("");
	txtOperationNameBox.setText("shelf to stock");
	}
	else
	{

	textFieldErrorResult.setText("bos yada sınırlar dısında");
	}

}
});

btnBuyItmfrmrkt.setBounds(20, 70, 150, 30);
contentPane.add(btnBuyItmfrmrkt);
JButton btnLookDgsInfo = new JButton("Look DGS info");
btnLookDgsInfo.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
txtFieldShelf.setText("Market info");
txtFieldStock.setText("");
String ekranabas = Market.marketemployee.toString();
txtAreaShelf.setText(ekranabas);
txtAreaStock.setText(Stockman.printShelfItems() + Stockman.printStockItems());
}
});
btnLookDgsInfo.setToolTipText("Look DGS info");
btnLookDgsInfo.setBounds(21, 166, 212, 30);
contentPane.add(btnLookDgsInfo);

JLabel lblInput = new JLabel("Input: ");
lblInput.setHorizontalAlignment(SwingConstants.CENTER);
lblInput.setBounds(182, 39, 51, 20);
contentPane.add(lblInput);
textFieldstsh = new JTextField();
textFieldstsh.setBounds(182, 101, 57, 26);
contentPane.add(textFieldstsh);
textFieldstsh.setColumns(10);
txtOperationResultBox = new JTextField();
txtOperationResultBox.setBounds(6, 442, 254, 26);
contentPane.add(txtOperationResultBox);
txtOperationResultBox.setColumns(10);
txtOperationNameBox = new JTextField();
txtOperationNameBox.setText("Operation");
txtOperationNameBox.setBounds(6, 416, 134, 26);
contentPane.add(txtOperationNameBox);
txtOperationNameBox.setColumns(10);
textFieldErrorResult = new JTextField();
textFieldErrorResult.setBounds(45, 484, 215, 26);
contentPane.add(textFieldErrorResult);
textFieldErrorResult.setColumns(10);
JLabel lblError = new JLabel("Error:");
lblError.setBounds(6, 489, 61, 16);
contentPane.add(lblError);
JButton btnHirefireEmployee = new JButton("Hire/Fire Employee");
btnHirefireEmployee.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		new HireFireSwing().setVisible(true);
		setVisible(false);
	}
});
btnHirefireEmployee.setBounds(20, 203, 212, 29);
contentPane.add(btnHirefireEmployee);
JButton btnBuyfromGlobalMarket = new JButton("Buy from Global Market");
btnBuyfromGlobalMarket.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		new GlobalMarketSwing().setVisible(true);
		setVisible(false);
	}
});
btnBuyfromGlobalMarket.setBounds(21, 238, 211, 29);
contentPane.add(btnBuyfromGlobalMarket);

 
}
}
