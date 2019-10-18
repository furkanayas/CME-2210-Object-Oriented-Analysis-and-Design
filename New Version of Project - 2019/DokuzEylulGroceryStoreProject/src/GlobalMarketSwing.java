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
import javax.swing.JScrollPane;



public class GlobalMarketSwing extends JFrame {
//public static DeuGroceryStore DGS = new DeuGroceryStore();
//public static Menu menu = new Menu();

private JPanel contentPane;
private JTextField textFieldBuyInput;
private JTextField textFieldMoney;

/**
* Launch the application.
*/
public static void main(String[] args) {
//	DeuGroceryStore DGS = new DeuGroceryStore();


EventQueue.invokeLater(new Runnable() {
public void run() {
try {
GlobalMarketSwing frame = new GlobalMarketSwing();
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


public GlobalMarketSwing() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 584, 625);
contentPane = new JPanel();
contentPane.setBackground(Color.CYAN);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);


JTextArea textArea = new JTextArea();
textArea.setBounds(482, 52, 83, 543);
contentPane.add(textArea);

JScrollPane scrollPane = new JScrollPane(textArea);
scrollPane.setBounds(16, 49, 550, 543);
contentPane.add(scrollPane);

textFieldMoney = new JTextField();
textFieldMoney.setBounds(383, 11, 91, 26);
contentPane.add(textFieldMoney);
textFieldMoney.setColumns(10);

textArea.setText(GlobalOrderMarket.printGMItems());
textFieldMoney.setText(Double.toString(Market.marketcase.getMoney()));


JButton btnBuy = new JButton("Buy");
btnBuy.setForeground(Color.BLACK);
btnBuy.setBackground(Color.RED);
btnBuy.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
	
	int input = Integer.parseInt(textFieldBuyInput.getText());
	
	Manager.orderItem(GlobalOrderMarket.GlobalOrderMarketItems.remove(input));
	
	textArea.setText(GlobalOrderMarket.printGMItems());
	textFieldMoney.setText(Double.toString(Market.marketcase.getMoney()));

}
});
btnBuy.setBounds(132, 11, 91, 29);
contentPane.add(btnBuy);
JButton btnReturn = new JButton("Return");
btnReturn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) 
{
new ManagerSwing().setVisible(true);
setVisible(false);
}
});
btnReturn.setBounds(485, 11, 91, 29);
contentPane.add(btnReturn);
JLabel lblGlobalOrderMarket = new JLabel("GlobalOrderMarket");
lblGlobalOrderMarket.setHorizontalAlignment(SwingConstants.LEFT);
lblGlobalOrderMarket.setBackground(Color.LIGHT_GRAY);
lblGlobalOrderMarket.setBounds(6, 6, 123, 36);
contentPane.add(lblGlobalOrderMarket);
textFieldBuyInput = new JTextField();
textFieldBuyInput.setHorizontalAlignment(SwingConstants.CENTER);
textFieldBuyInput.setBounds(235, 11, 68, 27);
contentPane.add(textFieldBuyInput);
textFieldBuyInput.setColumns(10);
JLabel lblMoney = new JLabel("Money:");
lblMoney.setBounds(329, 16, 55, 16);
contentPane.add(lblMoney);



}

}

