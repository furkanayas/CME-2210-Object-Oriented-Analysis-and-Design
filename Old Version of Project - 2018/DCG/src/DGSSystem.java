import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class DGSSystem extends JFrame {
	
	public static DeuGroceryStore DGS = new DeuGroceryStore();
	public static Menu menu = new Menu();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		DeuGroceryStore DGS = new DeuGroceryStore();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DGSSystem frame = new DGSSystem();
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
	public DGSSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnManagersystem = new JButton("ManagerSystem");
		btnManagersystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				new ManagerSystem().setVisible(true);			
			}
		});
		btnManagersystem.setBounds(216, 110, 200, 29);
		contentPane.add(btnManagersystem);
		
		JButton btnCustomersystem = new JButton("CustomerSystem");
		btnCustomersystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				new CustomerSystem().setVisible(true);
			}
		});
		btnCustomersystem.setBounds(216, 179, 200, 29);
		contentPane.add(btnCustomersystem);
		
		JLabel lblDokuzeylulgrocerystoresystem = new JLabel("DokuzEylulGroceryStoreSystem");
		lblDokuzeylulgrocerystoresystem.setBounds(215, 25, 201, 36);
		contentPane.add(lblDokuzeylulgrocerystoresystem);
	}

}
