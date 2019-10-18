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

public class ManagerSystem extends JFrame{

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
					ManagerSystem frame = new ManagerSystem();
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
	public ManagerSystem() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextArea txtEkran = new JTextArea();
		txtEkran.setBounds(200, 40, 400, 200);
		contentPane.add(txtEkran);
		txtEkran.setWrapStyleWord(true);
		txtEkran.setEditable(false);
		txtEkran.setText("...");
		
		JLabel lblManagersystem = new JLabel("ManagerSystem");
		lblManagersystem.setBounds(45, 21, 98, 16);
		contentPane.add(lblManagersystem);
		
		JButton btnDgssystem = new JButton("DGSSystem");
		btnDgssystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				new DGSSystem().setVisible(true);			
			}
		});
		btnDgssystem.setBounds(70, 220, 100, 30);
		contentPane.add(btnDgssystem);
		String s = "Add Item \ntoShelf fromStocks";
		
		JLabel lblSystemScreen = new JLabel("SystemScreen");
		lblSystemScreen.setBounds(200, 15, 130, 20);
		contentPane.add(lblSystemScreen);
		
		JButton btnListshelf = new JButton("ListShelf");
		btnListshelf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{			
				String ekranabas = menu.listShelf(DGS.getShelves());
				txtEkran.setText(ekranabas);
				
			}
		});
		btnListshelf.setBounds(20, 40, 150, 30);
		contentPane.add(btnListshelf);
		
		JButton btnListstock = new JButton("ListStock");
		btnListstock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String ekranabas = menu.listStock(DGS.getStock());
				txtEkran.setText(ekranabas);
			}
		});
		btnListstock.setBounds(20, 70, 150, 30);
		contentPane.add(btnListstock);
		
		JButton btnAdditemtShfSt = new JButton("Add Item tShfSt");
		btnAdditemtShfSt.setToolTipText("Add ItemtoShelf fromStocks");
		btnAdditemtShfSt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String ekranabas = menu.listStock(DGS.getStock());
				txtEkran.setText(ekranabas);
				
				textField.addKeyListener(new KeyAdapter() {
					int input = -1;
					@Override
					public void keyPressed(KeyEvent e) 
					{
						if(e.getKeyCode() == KeyEvent.VK_ENTER)
						{	
						
							input =  Integer.parseInt(textField.getText());
							
							menu.addItemStocktoShelf(DGS.stock, DGS.shelves,input);
							
							String ekranabas = menu.listStock(DGS.getStock());
							txtEkran.setText(ekranabas);
						}
						input = -1;
					}
					
					
				});
			}
		});
		btnAdditemtShfSt.setActionCommand("Add ItemtoShelf fromStocks");
		btnAdditemtShfSt.setBounds(20, 100, 150, 30);
		contentPane.add(btnAdditemtShfSt);
		
		JButton btnBuyItmfrmrkt = new JButton("Buy ItmFrMrkt");
		btnBuyItmfrmrkt.setToolTipText("Buy Item fromMarket");
		btnBuyItmfrmrkt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String ekranabas = menu.lookMarket(DGS.getMarket());
				txtEkran.setText(ekranabas);
				
				textField.addKeyListener(new KeyAdapter() {
					int input = -1;
					@Override
					public void keyPressed(KeyEvent e) 
					{
						if(e.getKeyCode() == KeyEvent.VK_SPACE)
						{	
							
							input =  Integer.parseInt(textField.getText());
							
							menu.addItemMarkettoStock(DGS,input);
							
							String ekranabas = menu.lookMarket(DGS.getMarket());
							txtEkran.setText(ekranabas);
						}
						input = -1;
					}
					
					
				});
			}
		});
		btnBuyItmfrmrkt.setBounds(20, 130, 150, 30);
		contentPane.add(btnBuyItmfrmrkt);
		
		JButton btnLookDgsInfo = new JButton("Look DGS info");
		btnLookDgsInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String ekranabas = menu.lookDGS(DGS,DGS.getEmployees());
				txtEkran.setText(ekranabas);
			}
		});
		btnLookDgsInfo.setToolTipText("Look DGS info");
		btnLookDgsInfo.setBounds(20, 160, 150, 30);
		contentPane.add(btnLookDgsInfo);
		
		JButton btnLookThemarketInfo = new JButton("Look theMarket info");
		btnLookThemarketInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String ekranabas = menu.lookMarket(DGS.getMarket());
				txtEkran.setText(ekranabas);
			}
		});
		btnLookThemarketInfo.setBounds(20, 190, 152, 30);
		contentPane.add(btnLookThemarketInfo);
		
		textField = new JTextField();
		textField.setToolTipText("You can enter your choose in here");
		textField.setBounds(182, 262, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblInputscreen = new JLabel("InputScreen : ");
		lblInputscreen.setBounds(80, 265, 90, 20);
		contentPane.add(lblInputscreen);
		
		JLabel label = new JLabel("Important Hınt");
		label.setToolTipText("Add Item tSfSt'a bastıktan sonra input screen'e sayı girip enter'a basın\nBuy ItmFrMrkt'e bastıktan sonra ise sayıyı girdikten sonra space e basın\nHer işlemden sonra kutudaki sayıyı silip tekrar girerseniz\n daha verimli kullanabilirsiniz");
		label.setBounds(420, 265, 100, 20);
		contentPane.add(label);
		
		
	
	
		 
	}
}
