import java.awt.BorderLayout;
import java.awt.EventQueue;

import javafx.scene.control.ComboBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.Label;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Msignup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_9;
	private JTextField textField_10;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Msignup frame = new Msignup();
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
	public Msignup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(0, 0, 724, 443);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel l1=new JLabel("ID ");
		l1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				JOptionPane.showMessageDialog(panel, "logged in");
				
			}
			public void mouseExited(MouseEvent e) {
				//JOptionPane.showMessageDialog(panel, "");
			}
		});
		l1.setBounds(10,44, 104,25);
		panel.add(l1);
		
		JLabel l2=new JLabel(" NAME");
		l2.setBounds(10,80, 117,25);
		panel.add(l2);
        
		JLabel l3=new JLabel("ADDRESS");
		l3.setBounds(10,116, 117,14);
		panel.add(l3);
	 
		JLabel l9=new JLabel("STATE");
		l9.setBounds(228,192, 53,25);
		panel.add(l9);
	 
		JLabel l10=new JLabel("PIN CODE");
		l10.setBounds(521,156, 53,25);
		panel.add(l10);
	 
		JLabel l11=new JLabel("DISTRICT");
		l11.setBounds(228,156, 53,25);
		panel.add(l11);
	 
		JLabel l12=new JLabel("DOOR NO");
		l12.setBounds(10,156, 61,25);
		panel.add(l12);
	     
		JLabel l13=new JLabel("STREET");
		l13.setBounds(10,192, 53,25);
		panel.add(l13);
	 
		
		JLabel l4=new JLabel("GST NO.");
		l4.setBounds(10,247, 104,25);
		panel.add(l4);
	
		JLabel l5=new JLabel("TIN NO.");
		l5.setBounds(10,288, 98,25);
		panel.add(l5);
	
		JLabel l6=new JLabel("COMPOSITE NO.");
		l6.setBounds(10,324, 104,25);
		panel.add(l6);
	
		JLabel l7=new JLabel("EMAIL ID");
		l7.setBounds(10,371, 98,25);
		panel.add(l7);
	
		JLabel l8=new JLabel("MOBILE NO");
		l8.setBounds(395,288, 104,25);
		panel.add(l8);
		
		JLabel l14=new JLabel("MOBILE NO");
		l14.setBounds(10,407, 104,25);
		panel.add(l14);
		
		textField = new JTextField();
		textField.setBounds(130, 46, 154, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		final Label label_2 = new Label("");
		label_2.setBounds(294, 83, 62, 22);
		panel.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();				
				if((inp>='A' && inp<='Z')|| (inp>='a' && inp<='z'))
				{
					
					label_2.setText("");
					
				}
				else
				{
					e.consume();
					label_2.setText("Invalid");
				}
			}
		});
		textField_1.setBounds(130, 81, 154, 23);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(65, 158, 117, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(65, 194, 117, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		final Label label_3 = new Label("");
		label_3.setBounds(437, 159, 62, 22);
		panel.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();
				if((inp>='A' && inp<='Z')|| (inp>='a' && inp<='z'))
				{
					
					label_3.setText("");
					
				}
				else
				{
					e.consume();
					label_3.setText("Invalid");
				}
			}
		});
		textField_4.setBounds(291, 158, 142, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		final Label label_4 = new Label("");
		label_4.setBounds(370, 229, 62, 22);
		panel.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();
				if((inp>='A' && inp<='Z')|| (inp>='a' && inp<='z'))
				{
					
					label_4.setText("");
					
				}
				else
				{
					e.consume();
					label_4.setText("Invalid");
				}
			}
		});
		textField_5.setBounds(291, 194, 142, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		final JLabel l15=new JLabel("");
		l15.setBounds(554,178, 104,25);
		panel.add(l15);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();
				String str=textField_6.getText();
				if(((inp>='A' && inp<='Z')||(inp>='a' && inp<='z'))||(str.length()>=6) )
				{
					e.consume();
					l15.setText("INVALID");
					
				}
				else
					l15.setText("");
					
			}
		});
		textField_6.setBounds(604, 158, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		final Label label_5 = new Label("");
		label_5.setBounds(228, 247, 62, 22);
		panel.add(label_5);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();
				if(inp>='0' && inp <='9')
				{
					
					label_5.setText("");
					
				}
				else
				{
					e.consume();
					label_5.setText("Invalid");
				}
			}
		});
		textField_7.setBounds(118, 249, 97, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		final Label label_6 = new Label("");
		label_6.setBounds(228, 277, 62, 22);
		panel.add(label_6);	
		
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();
				if(inp>='0' && inp <='9')
				{
					
					label_6.setText("");
					
				}
				else
				{
					e.consume();
					label_6.setText("Invalid");
				}
			}
		});
		textField_8.setBounds(118, 279, 97, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("YES");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(119, 325, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("NO");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(272, 325, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(118, 373, 97, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		

		final Label label_7 = new Label("");
		label_7.setBounds(219, 407, 62, 22);
		panel.add(label_7);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();
				String str=textField_10.getText();
				if((inp>='0' && inp <='9'))
				{
					if(str.length()<10)
					{
						label_7.setText("");
					}
					else
					{
						e.consume();
						label_7.setText("Invalid");
					}
				}
				else
				{
					e.consume();
					label_7.setText("Invalid");
				}
			}
		});
		textField_10.setBounds(118, 409, 97, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(418, 373, 98, 20);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(418, 409, 98, 20);
		panel.add(passwordField_1);
		
		String[] type={"FOOD","ELECTRICAL"};
		final JComboBox comboBox = new JComboBox(type);
		comboBox.setBounds(537, 290, 103, 20);
		panel.add(comboBox);
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String smid,name,doorno,street,district,state,emailid,stype = null,spincode,sgstno,stinno,smobileno;
				String cpassword;
				String password;
				char comp=0;
				int flag=1;
				smid=textField.getText();
				
				
				if(smid.equals(""))
				{
					JOptionPane.showMessageDialog(panel, "Enter the ID");		
					flag=0;
				}
				name=textField_1.getText();
				if(name.equals(""))
				{
					JOptionPane.showMessageDialog(panel, "Enter the Name");	
					flag=0;
				}
				doorno=textField_2.getText();
				if(doorno.equals(""))
				{
					JOptionPane.showMessageDialog(panel, "Enter the Door NO");	
					flag=0;
				}
				street=textField_3.getText();
				if(street.equals(""))
				{
					JOptionPane.showMessageDialog(panel, "Enter the Street Name");
					flag=0;
				}
				district=textField_4.getText();
				if(district.equals(""))
				{
					JOptionPane.showMessageDialog(panel, "Enter the District Name");
					flag=0;
				}
				state=textField_5.getText();
				if(state.equals(""))
				{
					JOptionPane.showMessageDialog(panel, "Enter the State Name");
					flag=0;
				}
				spincode=textField_6.getText();
				if(spincode.equals(""))
				{
					JOptionPane.showMessageDialog(panel, "Enter the Pincode");	
					flag=0;
				}
				sgstno=textField_7.getText();
				if(sgstno.equals(""))
				{
					JOptionPane.showMessageDialog(panel, "Enter the GST NO.");	
					flag=0;
				}
				stinno=textField_8.getText();
				if(stinno.equals(""))
				{
					JOptionPane.showMessageDialog(panel, "Enter the Tin No.");	
					flag=0;
				}
				emailid=textField_9.getText();
				if(emailid.equals(""))
				{
					JOptionPane.showMessageDialog(panel, "Enter the emailid");	
					flag=0;
				}
				else
				{
					if(!(emailid.matches("^[a-zA-Z0-9_+&*-]+(?:\\."+
	                        "[a-zA-Z0-9_+&*-]+)*@" +
	                        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                        "A-Z]{2,7}$")))
					{
						JOptionPane.showMessageDialog(panel, "Invalid EmailID");	
						flag=0;
					}
					
				}
				smobileno=textField_10.getText();
				if(smobileno.equals(""))
				{
					JOptionPane.showMessageDialog(panel, "Enter the Mobile NUmber");
					flag=0;
				}
				else
				{
					if(smobileno.length()!=10)
					{
						JOptionPane.showMessageDialog(panel, "Invalid MobileNumber");	
						flag=0;
					}
					
				}
				password=passwordField.getText();
				if(password.equals(""))
				{
					JOptionPane.showMessageDialog(panel, "Enter the Password");	
					flag=0;
				}
				cpassword=passwordField_1.getText();
				if(cpassword.equals(""))
				{
					JOptionPane.showMessageDialog(panel, "Enter the confirm Password");	
					flag=0;
				}
				
				if(rdbtnNewRadioButton.isSelected())
				{
					comp='Y';
					stype=(String) comboBox.getSelectedItem();
				}
				else if(rdbtnNewRadioButton_1.isSelected())
				{
					comp='N';
					stype=(String) comboBox.getSelectedItem();
				}
				else
				{
					JOptionPane.showMessageDialog(panel, "Select Compositon or not");	
					flag=0;
				}
				if(!(password.equals(cpassword)))
				{
					JOptionPane.showMessageDialog(panel, "Password Did not Match");	
					flag=0;
				}
				
				
				
				if(flag==1)
				{
					try{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
						Statement sta=con.createStatement();
						sta.executeQuery("insert into manufacture values('" + smid + "' , '" + name + "' , '" + doorno + "' , '" + street + "' , '" +district+ "' , '" +state + "','" + spincode + "' , '" + sgstno + "' , '" + stinno + "' , '" + comp + "' , '" + emailid + "' , '" + smobileno + "' , '" + stype + "' )");
						sta.executeQuery("insert into mlogin values('" + emailid +"','" + password + "')");
						con.close();
						dispose();
						Manu log=new Manu(emailid);
						log.setVisible(true);
					}

					catch(Exception e1){
						System.out.print(e1);
					}
				}
				
				
				
			}
		});
		btnNewButton.setBounds(625, 408, 89, 23);
		panel.add(btnNewButton);
		Label label = new Label("PASSWORD");
		label.setBounds(308, 371, 73, 22);
		panel.add(label);
		
		Label label_1 = new Label("CONFIRM PASSWORD");
		label_1.setBounds(300, 410, 112, 22);
		panel.add(label_1);
		
	
	
		
	
	}
}
