package JavaProject;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    Connection connection=null;
    private JTextField textFieldPN;
    private JPasswordField passwordField;
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		connection=sqliteConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 673, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Player Name");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setBounds(231, 96, 112, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_1.setBounds(231, 158, 112, 52);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFieldPN = new JTextField();
		textFieldPN.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		textFieldPN.setBounds(353, 103, 242, 43);
		frame.getContentPane().add(textFieldPN);
		textFieldPN.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		Image img=new ImageIcon(this.getClass().getResource("/tick.png")).getImage();
		btnLogin.setIcon(new ImageIcon(img));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 String query="select * from Player where name=? and password=?";
					 PreparedStatement pst=connection.prepareStatement(query);
					 pst.setString(1,textFieldPN.getText());
					 pst.setString(2,passwordField.getText());
					 ResultSet rs=pst.executeQuery();
					 int count=0;
					 while(rs.next()) {
						 count=count+1;
					 }
					 if(count==1) {
						 JOptionPane.showMessageDialog(null, "Player Name and Password is correct");
						 frame.dispose();
						 WelcomeWindow window=new WelcomeWindow();
						 window.setVisible(true);
					 }
					 else if(count>1) {
						 JOptionPane.showMessageDialog(null, "Duplicate Player Name and Password");
					 }
					 else {
						 JOptionPane.showMessageDialog(null, "Player Name and Password Incorrect!!");
					 }
					 rs.close();
					 pst.close();
				  }
				
				  catch(Exception e1){
					  JOptionPane.showMessageDialog(null, e1);
					  
				  }
				
			}
		});
		btnLogin.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnLogin.setBounds(253, 248, 149, 46);
		frame.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		passwordField.setBounds(353, 167, 242, 41);
		frame.getContentPane().add(passwordField);
		
		JLabel PlayerDetails = new JLabel("Player Details");
		PlayerDetails.setHorizontalAlignment(SwingConstants.CENTER);
		PlayerDetails.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		PlayerDetails.setBounds(173, 23, 320, 43);
		frame.getContentPane().add(PlayerDetails);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img1));
		lblNewLabel_2.setBounds(27, 55, 191, 239);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg4.jpeg"));
		lblNewLabel_3.setBounds(0, 0, 659, 375);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg4.jpeg"));
		lblNewLabel_4.setBounds(547, 0, 112, 375);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
