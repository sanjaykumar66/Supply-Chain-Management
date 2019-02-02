import java.awt.BorderLayout;
import java.awt.EventQueue;

import javafx.scene.paint.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Manu extends JFrame {

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
	private JTextField textField_9;
	private JTextField textField_10;
String user;
String mid;
private JTextField textField_11;
private JTextField textField_12;
private JTextField textField_16;
private JTable table;
private JTextField textField_13;
private JTable table_1;
private JTextField textField_14;
private JTextField textField_15;
private JTextField textField_17;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Manu obj=new Manu("san@gmail.com");
			obj.setVisible(true);
			}
			
		});
	}

	/**
	 * Create the frame.
	 */
	public Manu(String email) {
		user=email;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 23, 481, 439);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("PRODUCT", null, panel, null);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 476, 411);
		panel.add(tabbedPane_1);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_1.addTab("ADD", null, panel_4, null);
	panel_4.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Product_ID");
	lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
	lblNewLabel.setBounds(10, 24, 126, 21);
	panel_4.add(lblNewLabel);
	
	JLabel lblProductname = new JLabel("Product_Name");
	lblProductname.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
	lblProductname.setBounds(10, 56, 126, 21);
	panel_4.add(lblProductname);
	
	JLabel lblNewLabel_1 = new JLabel("Manufacture Date");
	lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
	lblNewLabel_1.setBounds(10, 88, 159, 21);
	panel_4.add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("Expiry duration");
	lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
	lblNewLabel_2.setBounds(10, 120, 159, 21);
	panel_4.add(lblNewLabel_2);
	
	JLabel lblNewLabel_3 = new JLabel("Product_Type");
	lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
	lblNewLabel_3.setBounds(10, 154, 159, 21);
	panel_4.add(lblNewLabel_3);
	
	JLabel lblNewLabel_4 = new JLabel("Distributor Rate");
	lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
	lblNewLabel_4.setBounds(10, 190, 159, 21);
	panel_4.add(lblNewLabel_4);
	
	JLabel lblProductMrp = new JLabel("Product MRP");
	lblProductMrp.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
	lblProductMrp.setBounds(10, 233, 141, 14);
	panel_4.add(lblProductMrp);
	
	JLabel lblRetailerRate = new JLabel("Retailer Rate");
	lblRetailerRate.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
	lblRetailerRate.setBounds(10, 258, 141, 21);
	panel_4.add(lblRetailerRate);
	
	JLabel lblInitialStock = new JLabel("Initial Stock");
	lblInitialStock.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
	lblInitialStock.setBounds(10, 290, 141, 26);
	panel_4.add(lblInitialStock);
	
	final JLabel label_8 = new JLabel("");
	label_8.setBounds(294, 31, 46, 14);
	panel_4.add(label_8);
	
	final JLabel label_9 = new JLabel("");
	label_9.setBounds(304, 61, 46, 14);
	panel_4.add(label_9);
	
	textField_1 = new JTextField();
	textField_1.addKeyListener(new KeyAdapter() {
		public void keyTyped(KeyEvent e) {
			char inp=e.getKeyChar();
			if(inp>='0' && inp <='9')
			{
				
				label_8.setText("");
				
			}
			else
			{
				e.consume();
				label_8.setText("Invalid");
			}
		}
	});
	textField_1.setBounds(198, 26, 86, 20);
	panel_4.add(textField_1);
	textField_1.setColumns(10);
	
	textField_2 = new JTextField();
	textField_2.addKeyListener(new KeyAdapter() {
		public void keyTyped(KeyEvent e) {
			char inp=e.getKeyChar();
			if((inp>='A' && inp<='Z')|| (inp>='a' && inp<='z'))
			{
				
				label_9.setText("");
				
			}
			else
			{
				e.consume();
				label_9.setText("Invalid");
			}
		}
	});
	textField_2.setBounds(198, 58, 86, 20);
	panel_4.add(textField_2);
	textField_2.setColumns(10);
	
	textField_3 = new JTextField();
	textField_3.setBounds(198, 90, 86, 20);
	panel_4.add(textField_3);
	textField_3.setColumns(10);
	
	textField_4 = new JTextField();
	textField_4.setBounds(198, 122, 86, 20);
	panel_4.add(textField_4);
	textField_4.setColumns(10);
	
	textField_5 = new JTextField();
	textField_5.setBounds(198, 156, 86, 20);
	panel_4.add(textField_5);
	textField_5.setColumns(10);
	
	final JLabel label_10 = new JLabel("");
	label_10.setBounds(304, 190, 86, 21);
	panel_4.add(label_10);
	
	textField_6 = new JTextField();
	textField_6.addKeyListener(new KeyAdapter() {
		public void keyTyped(KeyEvent e) {
			char inp=e.getKeyChar();
			if(inp>='0' && inp <='9')
			{
				
				label_10.setText("");
				
			}
			else
			{
				e.consume();
				label_10.setText("Invalid");
			}
			
		}
	});
	textField_6.setBounds(198, 192, 86, 20);
	panel_4.add(textField_6);
	textField_6.setColumns(10);
	
	final JLabel label_11 = new JLabel("");
	label_11.setBounds(304, 231, 86, 21);
	panel_4.add(label_11);
	
	textField_7 = new JTextField();
	textField_7.addKeyListener(new KeyAdapter() {
		public void keyTyped(KeyEvent e) {
			char inp=e.getKeyChar();
			if(inp>='0' && inp <='9')
			{
				
				label_11.setText("");
				
			}
			else
			{
				e.consume();
				label_11.setText("Invalid");
			}
		}
	});
	textField_7.setBounds(198, 232, 86, 20);
	panel_4.add(textField_7);
	textField_7.setColumns(10);
	
	final JLabel label_12 = new JLabel("");
	label_12.setBounds(304, 258, 86, 21);
	panel_4.add(label_12);
	
	textField_8 = new JTextField();
	textField_8.addKeyListener(new KeyAdapter() {
		public void keyTyped(KeyEvent e) {
			char inp=e.getKeyChar();
			if(inp>='0' && inp <='9')
			{
				
				label_10.setText("");
				
			}
			else
			{
				e.consume();
				label_10.setText("Invalid");
			}
		}
	});
	textField_8.setBounds(198, 260, 86, 20);
	panel_4.add(textField_8);
	textField_8.setColumns(10);
	
	
	final JLabel label_13 = new JLabel("");
	label_13.setBounds(314, 222, 86, 21);
	panel_4.add(label_13);
	
	textField_9 = new JTextField();
	textField_9.addKeyListener(new KeyAdapter() {
		public void keyTyped(KeyEvent e) {
			char inp=e.getKeyChar();
			if(inp>='0' && inp <='9')
			{
				
				label_13.setText("");
				
			}
			else
			{
				e.consume();
				label_13.setText("Invalid");
			}
			
		}
	});
	textField_9.setBounds(198, 295, 86, 20);
	panel_4.add(textField_9);
	textField_9.setColumns(10);
	
	JButton btnAddProduct = new JButton("ADD Product");
	btnAddProduct.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//ADD NEW PRODUCT TO PRODUCT TABLE//
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
				Statement sta1=con.createStatement();
				ResultSet rs=sta1.executeQuery(" select * from manufacture where M_EMAILID ='" + user + "' ");
				rs.next();
				int id=Integer.parseInt(rs.getString(1));
				System.out.print(id);
			PreparedStatement sta=con.prepareStatement("insert into product values(?,?,?,?,?,?,?,?,?,?,?)");
			int i=Integer.parseInt(textField_1.getText());	
			sta.setInt(1,i);
			sta.setString(2, textField_2.getText());
			sta.setInt(3,id);
			sta.setString(4,textField_3.getText());
			int j=Integer.parseInt(textField_7.getText());
			sta.setInt(5,j);
			int k=Integer.parseInt(textField_6.getText());
			sta.setInt(6,k);
			int q=Integer.parseInt(textField_9.getText());
			sta.setInt(7,q);
			sta.setString(8,textField_5.getText() );
			sta.setString(9,textField_4.getText());
			sta.setInt(10,0);
			int t=Integer.parseInt(textField_8.getText());
			sta.setInt(11,t);
	sta.execute();
				con.close();
			}

			catch(Exception e1){
				System.out.print("error");
			}
		}
	});
	btnAddProduct.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
	btnAddProduct.setBounds(141, 338, 143, 23);
	panel_4.add(btnAddProduct);
	
	
	
		
		JPanel panel_5 = new JPanel();
		tabbedPane_1.addTab("VIEW", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		panel_5.add(lblNewLabel_5);
		
		textField_11 = new JTextField();
		panel_5.add(textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("DELETE", null, panel_6, null);
		panel_6.setLayout(null);
		JLabel l1=new JLabel("Enter the Product_ID");
		l1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		l1.setBounds(39,82, 156,25);
		panel_6.add(l1);
		
		textField = new JTextField();
		textField.setBounds(211, 86, 162, 20);
		panel_6.add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblStatus.setBounds(108, 210, 87, 34);
		panel_6.add(lblStatus);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(122, 255, 200, 50);
		panel_6.add(textArea);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField.getText();
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
					Statement sta=con.createStatement();
					ResultSet rs=sta.executeQuery(" select * from product where P_ID='" +id+ "' ");
					rs.next();
					int stock=Integer.parseInt(rs.getString(7));
					if(stock==0)
					{
						textArea.setText("Product Supply has been Stoped");
						sta.executeQuery(" update product SET P_STOCK = '0' where P_ID='" + id + "' ");
						System.out.print("sanjay");
					}
					else
					{
						textArea.setText("You have Product in Stock");
					}
					con.close();
				}

				catch(Exception e1){
					System.out.print("error");
				}
				
			}
		});
		btnCheck.setBounds(175, 147, 89, 23);
		panel_6.add(btnCheck);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("DISTRIBUTOR", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 476, 411);
		panel_1.add(tabbedPane_2);
		
		
		
		JPanel panel_8 = new JPanel();
		tabbedPane_2.addTab("VIEW", null, panel_8, null);
		panel_8.setLayout(null);
		final JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String id=null;
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
					Statement sta=con.createStatement();
					//System.out.print(mid);
					ResultSet ra=sta.executeQuery("select * from manufacture where M_EMAILID ='" + user + "' ");
					ra.next();
					 id=ra.getString(1);
					 mid=id;
					 System.out.print(mid);
					ResultSet rs=sta.executeQuery(" select * from distribute  where M_ID= '" +mid+ "' ");
					//System.out.print(rs.getString(4));
					if(rs!=null)
					{
					while(rs.next())
					{
						Object columns[]={"D_ID","QUANTITY","ODATE","MCOST"};
						System.out.print(rs.getString(4));
						Object[][] rows={{"D_ID","P_ID","QUANTITY","TOTALCOST"},{rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(7)}};	
						table_1 = new JTable(rows,columns);
						scrollPane_2.setRowHeaderView(table_1);	
					}
					}
					con.close();
				}
				catch(Exception e1){
					System.out.print("error");
				}
				
				
			}
		});
		scrollPane_2.setBounds(10, 10, 451, 336);
		panel_8.add(scrollPane_2);
		
		
		final JPanel panel_7 = new JPanel();
		tabbedPane_2.addTab("Search", null, panel_7, null);
		
		JLabel lblProduct = new JLabel("ProductID");
		panel_7.add(lblProduct);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		panel_7.add(lblNewLabel_6);
		panel_7.setLayout(null);
		
		textField_12 = new JTextField();
		panel_7.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblProductId = new JLabel("Product_Type");
		lblProductId.setBounds(56, 25, 86, 17);
		panel_7.add(lblProductId);
		
		JLabel lblNewLabel_7 = new JLabel("District");
		lblNewLabel_7.setBounds(68, 67, 56, 20);
		panel_7.add(lblNewLabel_7);
		
		textField_16 = new JTextField();
		textField_16.setBounds(195, 67, 86, 20);
		panel_7.add(textField_16);
		textField_16.setColumns(10);
		
		
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 187, 449, 177);
		panel_7.add(scrollPane);
		
		String[] type2={"FOOD","ELECTRICAL"};
		final JComboBox comboBox = new JComboBox(type2);
		comboBox.setBounds(195, 23, 96, 20);
		panel_7.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String type1=(String) comboBox.getSelectedItem();
				//System.out.print(type1);
				String dis=textField_16.getText();
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
					Statement sta=con.createStatement();
	
					ResultSet rs=sta.executeQuery(" select * from distributor where ( D_TYPE='" + type1 + "' and  D_DISTRICT='" + dis + "')");
			
					while(rs.next())
					{
						Object columns[]={"D_ID","D_NAME","D_TYPE","D_EMAIL_ID"};
						Object rows[][]={ {rs.getString(1),rs.getString(2),rs.getString(13),rs.getString(11)}};
						table = new JTable(rows,columns);
						scrollPane.setRowHeaderView(table);	
					}
					
					con.close();
					
				}

				catch(Exception e1){
					System.out.print("error");
				}
				
				
			}
		});
		btnNewButton_1.setBounds(113, 98, 89, 23);
		panel_7.add(btnNewButton_1);
		
		JPanel panel_17 = new JPanel();
		tabbedPane_2.addTab("Request", null, panel_17, null);
		panel_17.setLayout(null);
		
		Label label_3 = new Label("Distributor mail_ID");
		label_3.setBounds(27, 33, 99, 22);
		panel_17.add(label_3);
		
		textField_13 = new JTextField();
		textField_13.setBounds(146, 35, 86, 20);
		panel_17.add(textField_13);
		textField_13.setColumns(10);
		
		Label label_4 = new Label("Product_Type");
		label_4.setBounds(27, 64, 86, 22);
		panel_17.add(label_4);
		
		final JComboBox comboBox_1 = new JComboBox(type2);
		comboBox_1.setBounds(146, 66, 28, 20);
		panel_17.add(comboBox_1);
		
		JButton btnRequest = new JButton("Request");
		btnRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email=textField_13.getText();
				String t=(String)comboBox_1.getSelectedItem();
				String id=null;
				String did=null;
				String ddis=null;
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
					Statement sta=con.createStatement();
					ResultSet ra=sta.executeQuery("select * from manufacture where M_EMAILID ='" + user + "' ");
					ra.next();
					 id=ra.getString(1);
					 mid=id;
					 System.out.print(id);
					ResultSet rz=sta.executeQuery("select * from distributor where D_EMAILID ='" + email + "' ");
					
					rz.next();
					
					//
					 did=rz.getString(1);
					System.out.print(did);
					 ddis=rz.getString(5);
					ResultSet rs=sta.executeQuery(" insert into MREQUEST values('"+id+"','"+did+"','"+t+"','0','"+ddis+"','"+email+"')");
					con.close();
					
				}

				catch(Exception e1){
					System.out.print("error");
				}
			}
		});
		btnRequest.setBounds(62, 111, 89, 23);
		panel_17.add(btnRequest);
		
		
		
		//panel_9.setVisible(true);
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("STOCK", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 476, 411);
		panel_2.add(tabbedPane_3);
		
		JPanel panel_10 = new JPanel();
		tabbedPane_3.addTab("ADD", null, panel_10, null);
		panel_10.setLayout(null);
		
		Label label = new Label("New label");
		panel_10.add(label);
		
		Label label_1 = new Label("Product_ID");
		label_1.setBounds(37, 60, 62, 22);
		panel_10.add(label_1);
		
		final TextField textField_20 = new TextField();
		textField_20.setBounds(137, 60, 121, 22);
		panel_10.add(textField_20);
		
		Label label_2 = new Label("Stock");
		label_2.setBounds(37, 120, 62, 22);
		panel_10.add(label_2);
		
		final TextField textField_21 = new TextField();
		textField_21.setBounds(137, 120, 121, 22);
		panel_10.add(textField_21);
		
		Button button = new Button("Add");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField_20.getText();
				int stock=Integer.parseInt(textField_21.getText());
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
					Statement sta=con.createStatement();
					ResultSet rs=sta.executeQuery(" select * from product where P_ID='" + id + "'");
					rs.next();
					int cstock=Integer.parseInt(rs.getString(7));
					stock=stock+cstock;
					sta.executeQuery("update product set P_STOCK=" + stock + " where P_ID='" + id + "' " );
					con.close();
				}

				catch(Exception e1){
					System.out.print("error");
				}
			}
		});
		button.setBounds(117, 192, 70, 22);
		panel_10.add(button);
		
		JPanel panel_11 = new JPanel();
		tabbedPane_3.addTab("CURRENT STOCK", null, panel_11, null);
		panel_11.setLayout(null);
		final JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String id=null;
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
					Statement sta=con.createStatement();
					//System.out.print(mid);
					ResultSet ra=sta.executeQuery("select * from manufacture where M_EMAILID ='" + user + "' ");
					ra.next();
					id=ra.getString(1);
					mid=id;
					ResultSet rs=sta.executeQuery(" select * from product where M_ID='" + mid + "' ");
					System.out.print(mid);
					//System.out.print(rs.getString(4));
					while(rs.next())
					{
						Object columns[]={"P_ID","QUANTITY","ODATE","MCOST"};
						System.out.print(rs.getString(4));
						Object[][] rows={{"P_ID","P_NAME","P_STOCK","P_MCOST"},{rs.getString(1),rs.getString(2),rs.getString(10),rs.getString(5)}};	
						table_1 = new JTable(rows,columns);
						scrollPane_4.setRowHeaderView(table_1);	
					}
					
					con.close();
				}
				catch(Exception e1){
					System.out.print("error");
				}
				
				
			}
		});
		scrollPane_4.setBounds(10, 10, 451, 336);
		panel_11.add(scrollPane_4);
		
		final JPanel panel_12 = new JPanel();
		tabbedPane_3.addTab("REQUEST OF STOCK", null, panel_12, null);
		panel_12.setLayout(null);
		
		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
					Statement sta=con.createStatement();
					ResultSet rs=sta.executeQuery(" select * from DORDER where STATUS=0");
					while(rs.next())
					{
						Object columns[]={"D_ID","QUANTITY","ODATE","MCOST"};
						System.out.print(rs.getString(4));
						Object[][] rows={{"D_ID","QUANTITY","ODATE","MCOST"},{rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)}};	
						table_1 = new JTable(rows,columns);
						scrollPane_1.setRowHeaderView(table_1);	
					}
					
					con.close();
				}
				catch(Exception e1){
					System.out.print("error");
				}
				
				
			}
		});
		scrollPane_1.setBounds(10, 10, 451, 336);
		panel_12.add(scrollPane_1);
		
		
		
		JPanel panel_13 = new JPanel();
		tabbedPane_3.addTab("SEND STOCK", null, panel_13, null);
		panel_13.setLayout(null);
		
		Label label_5 = new Label("Distributor_ID");
		label_5.setBounds(45, 35, 86, 22);
		panel_13.add(label_5);
		
		textField_14 = new JTextField();
		textField_14.setBounds(173, 37, 86, 20);
		panel_13.add(textField_14);
		textField_14.setColumns(10);
		
		Label label_6 = new Label("Product_ID");
		label_6.setBounds(45, 76, 62, 22);
		panel_13.add(label_6);
		
		textField_15 = new JTextField();
		textField_15.setBounds(173, 78, 86, 20);
		panel_13.add(textField_15);
		textField_15.setColumns(10);
		
		Label label_7 = new Label("Stock");
		label_7.setBounds(45, 116, 62, 22);
		panel_13.add(label_7);
		
		textField_17 = new JTextField();
		textField_17.setBounds(173, 118, 86, 20);
		panel_13.add(textField_17);
		textField_17.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String did=textField_14.getText();
				String pid=textField_15.getText();
				int stock=Integer.parseInt(textField_17.getText());
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
					Statement sta=con.createStatement();
					ResultSet rs=sta.executeQuery(" select * from dorder where D_ID='" +did+ "'");
					rs.next();

					int quantity=rs.getInt(4); 
					int count=stock-quantity;
					System.out.print(count);
					if(count<0)
					{
						int c=quantity-stock;
						System.out.print("sanjay1");
					 	sta.executeQuery("update dorder set QUANTITY='" + c + "' where D_ID='" +did+ "'");
					 
					} 
					 if(count==0)
					{
						sta.executeQuery(" update dorder set STATUS=1 where D_ID='" +did+ "'");
						System.out.print("sanjay2");
					}
					ResultSet rz=sta.executeQuery(" select * from distribute where D_ID='" +did+ "' and P_ID='" + pid + "'");
					rz.next();
					int dstock=rz.getInt(4);
					dstock=dstock+stock;
					sta.executeQuery("update DISTRIBUTE set STOCK='" + dstock + "'   where D_ID='" +did+ "' and P_ID='" +pid+ "'");
					System.out.print("sanjay3");
					con.close();
				}

				catch(Exception e1){
					System.out.print(e1);
				}
			}
		});
		btnSend.setBounds(102, 172, 89, 23);
		panel_13.add(btnSend);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("SALES", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(0, 0, 476, 411);
		panel_3.add(tabbedPane_4);
		
		JPanel panel_14 = new JPanel();
		tabbedPane_4.addTab("VIEW", null, panel_14, null);
		
		JPanel panel_15 = new JPanel();
		tabbedPane_4.addTab("PENDING AMOUNT", null, panel_15, null);
		
		JPanel panel_16 = new JPanel();
		tabbedPane.addTab("NOTIFICATION", null, panel_16, null);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setEnabled(false);
		textField_10.setBounds(291, 0, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		textField_10.setText(user);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login log=new Login();
				log.setVisible(true);
			}
		});
		btnNewButton.setBounds(382, -1, 89, 23);
		contentPane.add(btnNewButton);
	}
}
