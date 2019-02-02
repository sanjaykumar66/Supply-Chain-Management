import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Distrub extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
String user;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Distrub obj=new Distrub("san@h.com");
				obj.setVisible(true);
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Distrub(String email) {
		user=email;
		System.out.print(user);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 21, 488, 445);
		contentPane.add(tabbedPane);
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
			Statement sta=con.createStatement();
			System.out.print("jdf");
			ResultSet rs=sta.executeQuery(" select * from mrequest where D_EMAILID='" + user + "' ");
			rs.next();
			String status=rs.getString(4);
			System.out.print(status);
			if(status.equals("0"))
			{
				
				JOptionPane.showMessageDialog(contentPane, "You have notification");
			}
			con.close();
		}

		catch(Exception e1){
			System.out.print("error");
		}
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("PRODUCT", null, panel, null);
		panel.setLayout(null);
		
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 483, 417);
		panel.add(tabbedPane_1);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_1.addTab("GENERAL PRODUCT", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("PURCHASED PRODUCT", null, panel_6, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("RETAILER", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 483, 417);
		panel_1.add(tabbedPane_2);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_2.addTab("NEW", null, panel_7, null);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_2.addTab("VIEW", null, panel_8, null);
		
		JPanel panel_9 = new JPanel();
		tabbedPane_2.addTab("DELETE", null, panel_9, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("SALES", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 483, 417);
		panel_2.add(tabbedPane_3);
		
		JPanel panel_10 = new JPanel();
		tabbedPane_3.addTab("VIEW", null, panel_10, null);
		
		JPanel panel_11 = new JPanel();
		tabbedPane_3.addTab("PENDING AMOUNT", null, panel_11, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("STOCK", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(0, 0, 483, 417);
		panel_3.add(tabbedPane_4);
		
		JPanel panel_12 = new JPanel();
		tabbedPane_4.addTab(" CURRENT STOCK", null, panel_12, null);
		
		JPanel panel_13 = new JPanel();
		tabbedPane_4.addTab(" REQUESTED STOCK", null, panel_13, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("MANUFACTURER", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_5.setBounds(0, 0, 483, 417);
		panel_4.add(tabbedPane_5);
		
		JPanel panel_14 = new JPanel();
		tabbedPane_5.addTab("PLACE ORDER", null, panel_14, null);
		
		JPanel panel_15 = new JPanel();
		tabbedPane_5.addTab("PAYMENT", null, panel_15, null);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login log=new Login();
				log.setVisible(true);
			}
		});
		btnNewButton.setBounds(399, 0, 89, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(305, 1, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText(user);
	}

}
