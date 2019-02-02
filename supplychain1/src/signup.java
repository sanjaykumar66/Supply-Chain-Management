import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	String tbname;
	ResultSet rs;
	int user;
	
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
	public signup(int a) {
		user=a;
		if (a==1)
		{
			tbname="MLOGIN";
		}
		else
			{if(a==2)
			{tbname="DLOGIN";
				}
			else{
				if(a==3)
				{tbname="RLOGIN";
			}
		
				
			}
			}
		
		try{
			
		}
		catch(Exception e){
			System.out.print("error");
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 389);
		contentPane.add(panel);
		panel.setLayout(null);
		JLabel l1=new JLabel("USER NAME");
		l1.setBounds(20,68, 104,25);
		panel.add(l1);
		
		
		
		JLabel l2=new JLabel("PASSWORD");
		l2.setBounds(20,128, 104,25);
		panel.add(l2);
		
		textField = new JTextField();
		textField.setBounds(134, 70, 215, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 130, 215, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
				Statement sta=con.createStatement();
				String username,password;
				username=textField.getText();
				password=textField_1.getText();
				tbname.toLowerCase();
				rs=sta.executeQuery("select * from " + tbname + " where username ='" + username + "' ");
				rs.next();
				JOptionPane.showMessageDialog(panel, rs.getString(1));
				if(password.equals(rs.getString(2)))
						{
					JOptionPane.showMessageDialog(panel, "logged innnnnn");
					if(user==1)
					{
						dispose();
						Manu log=new Manu(username);
						log.setVisible(true);
					}
					if(user==2)
					{
						dispose();
						Distrub log=new Distrub(username);
						log.setVisible(true);
					}
					if(user==3)
					{
						dispose();
						Retail log=new Retail(username);
						log.setVisible(true);
					}
						
				   }
				else
				{
					JOptionPane.showMessageDialog(panel, "invalid");
					signup log=new signup(user);
					log.setVisible(true);
					
				}
					con.close();	
			}
				catch(Exception q){
					System.out.print("error");
				}
				}
		});
		btnNewButton.setBounds(86, 205, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				if(user==1)
				{
					Msignup log=new Msignup();
					log.setVisible(true);
				}
				if(user==2)
				{
					Dsignup log=new Dsignup();
					log.setVisible(true);
				}
				if(user==3)
				{
					Rsignup log=new Rsignup();
					log.setVisible(true);	
				}
		
				
			}
		});
		btnRegister.setBounds(272, 205, 89, 23);
		panel.add(btnRegister);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(345, 0, 89, 23);
		panel.add(btnClose);
	
	}
}
