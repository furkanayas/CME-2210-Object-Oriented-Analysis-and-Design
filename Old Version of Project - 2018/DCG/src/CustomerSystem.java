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


public class CustomerSystem extends JFrame {

	//public static DeuGroceryStore DGS = new DeuGroceryStore();
	//public static Menu menu = new Menu();
	public static Menu menu = DGSSystem.menu;
	public static DeuGroceryStore DGS = DGSSystem.DGS;
	
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerSystem frame = new CustomerSystem();
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
	public CustomerSystem() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		JTextArea txtEkranCustomer = new JTextArea();
		txtEkranCustomer.setBounds(200, 40, 400, 200);
		contentPane.add(txtEkranCustomer);
		
		JLabel lblCustomersystem = new JLabel("CustomerSystem");
		lblCustomersystem.setBounds(36, 19, 120, 16);
		contentPane.add(lblCustomersystem);


		
		/*textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					String a = "enter a basılmıyor";
					txtEkranCustomer.setText(a);
				}
			}
		});*/
		
		
		JButton btnDgssystem = new JButton("DGSSystem");
		btnDgssystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				new DGSSystem().setVisible(true);
			}
		});
		btnDgssystem.setBounds(70, 220, 100, 30);
		contentPane.add(btnDgssystem);
		
		JButton btnDiplaybasket = new JButton("diplayBasket");
		btnDiplaybasket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String ekranabas = menu.displayItems(DGS.getCustomer().getBasket());
				txtEkranCustomer.setText(ekranabas);
			}
		});
		btnDiplaybasket.setBounds(20, 40, 150, 30);
		contentPane.add(btnDiplaybasket);
		
		JButton btnLookShelves = new JButton("Look shelves");
		btnLookShelves.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String ekranabas = menu.listShelf(DGS.getShelves());
				txtEkranCustomer.setText(ekranabas);
			}
		});
		btnLookShelves.setBounds(20, 70, 150, 30);
		contentPane.add(btnLookShelves);
		
		JButton btnPicktem = new JButton("PickItem");
		btnPicktem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				   
				 String ekranabas = menu.listShelf(DGS.getShelves());
				 txtEkranCustomer.setText(ekranabas);
				 textField.addKeyListener(new KeyAdapter() {
					 int input = -1;
					@Override
					public void keyPressed(KeyEvent e) 
					{
						if(e.getKeyCode() == KeyEvent.VK_ENTER)
						{
							
							input =  Integer.parseInt(textField.getText());
							
							 menu.searchandBuyItem(DGS.getShelves(),DGS.getCustomer().getBasket(),input);
							 String ekranabas = menu.listShelf(DGS.getShelves());
							 txtEkranCustomer.setText(ekranabas);
						}
						input = -1;
					}
				});
			}
		});
		btnPicktem.setToolTipText("SearchItemInShelvesandPick");
		btnPicktem.setBounds(20, 100, 150, 30);
		contentPane.add(btnPicktem);
		
		JButton btnRemovetem = new JButton("RemoveItem");
		btnRemovetem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String ekranabas = menu.displayItems(DGS.getCustomer().getBasket());
					txtEkranCustomer.setText(ekranabas);	      
					textField.addKeyListener(new KeyAdapter() {
						int input = -1;
						@Override
						public void keyPressed(KeyEvent e) 
						{
							if(e.getKeyCode() == KeyEvent.VK_SPACE)
							{
								
								input =  Integer.parseInt(textField.getText());							
								menu.removeIteminBaskettoShelves(DGS.getCustomer(),DGS.getShelves(),input);								  					        
							        String ekranabas = menu.displayItems(DGS.getCustomer().getBasket());
									txtEkranCustomer.setText(ekranabas);
								
							}
							input = -1;
						}
					});
				
			}
		});
		btnRemovetem.setToolTipText("RemoveItemInBasket");
		btnRemovetem.setBounds(20, 130, 150, 30);
		contentPane.add(btnRemovetem);
		
		JButton btnCalculatePrice = new JButton("Calculate price");
		btnCalculatePrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String ekranabas = menu.displayItems(DGS.getCustomer().getBasket());
			
				String ek = menu.Billstring(menu.Bill(DGS.getCustomer()));
				
				txtEkranCustomer.setText(ekranabas+"\n"+ek);
			}
		});
		btnCalculatePrice.setToolTipText("Calculate Basket price");
		btnCalculatePrice.setBounds(20, 160, 150, 30);
		contentPane.add(btnCalculatePrice);
		
		JButton btnBuybasket = new JButton("BuyBasket");
		btnBuybasket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
		
				String ekranabas = menu.pay(DGS.getCustomer());
				txtEkranCustomer.setText(ekranabas);
			}
		});
		btnBuybasket.setToolTipText("Take sale Ticket and Pay");
		btnBuybasket.setBounds(20, 190, 150, 30);
		contentPane.add(btnBuybasket);
		
		
		textField = new JTextField();
		textField.setToolTipText("You can enter your choose in here");
		textField.setBounds(182, 262, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		

		
		
		JLabel lblSystemscreen = new JLabel("SystemScreen");
		lblSystemscreen.setBounds(200, 15, 130, 20);
		contentPane.add(lblSystemscreen);

		JLabel lblInputscreen = new JLabel("InputScreen : ");
		lblInputscreen.setBounds(80, 265, 90, 20);
		contentPane.add(lblInputscreen);
		
		JLabel lblImportantHnt = new JLabel("Important Hınt");
		lblImportantHnt.setToolTipText("Pickitem'a bastıktan sonra input screen'e sayı girip enter'a basın\nRemove item da ise sayıyı girdikten sonra space e basın\nHer işlemden sonra kutudaki sayıyı silip tekrar girerseniz\n daha verimli kullanabilirsiniz");
		lblImportantHnt.setBounds(420, 265, 100, 20);
		contentPane.add(lblImportantHnt);
		
		 
		
	}
}
