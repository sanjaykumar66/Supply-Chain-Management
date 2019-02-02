import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Retail extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
String user;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Retail(String email) {
		user=email;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 21, 480, 447);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("PRODUCT", null, panel, null);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 475, 419);
		panel.add(tabbedPane_1);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_1.addTab(" GENERAL PRODUCT", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_1.addTab(" PURCHASED PRODUCT", null, panel_5, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("STOCK", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 485, 419);
		panel_1.add(tabbedPane_2);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_2.addTab("New tab", null, panel_6, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_2.addTab("New tab", null, panel_7, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("DISTRIBUTOR", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 475, 419);
		panel_2.add(tabbedPane_3);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_3.addTab("PLACE ORDER", null, panel_8, null);
		
		JPanel panel_9 = new JPanel();
		tabbedPane_3.addTab("PAYMENTS", null, panel_9, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("SALES", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(0, 0, 475, 436);
		panel_3.add(tabbedPane_4);
		
		JPanel panel_10 = new JPanel();
		tabbedPane_4.addTab("VIEW", null, panel_10, null);
		
		textField = new JTextField();
		textField.setBounds(298, 0, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText(user);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login log=new Login();
				log.setVisible(true);
			}
		});
		btnLogOut.setBounds(391, -1, 89, 23);
		contentPane.add(btnLogOut);
	}

}
