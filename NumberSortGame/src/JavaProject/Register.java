package JavaProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Register {

	private JFrame frame;
	private JTextField gamerId;
	private JTextField name;
	private JPasswordField password;
	private JTextField textScoreNull;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Register() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 820, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblRegister = new JLabel("New Player Register");
		lblRegister.setFont(new Font("Trebuchet MS", Font.BOLD, 32));
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setBounds(173, 25, 440, 48);
		frame.getContentPane().add(lblRegister);
		
		JLabel lblGamerId = new JLabel("Gamer Id");
		lblGamerId.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lblGamerId.setBounds(201, 140, 131, 39);
		frame.getContentPane().add(lblGamerId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lblName.setBounds(201, 212, 131, 39);
		frame.getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lblPassword.setBounds(201, 287, 131, 39);
		frame.getContentPane().add(lblPassword);
		
		gamerId = new JTextField();
		gamerId.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
		gamerId.setBounds(358, 140, 240, 39);
		frame.getContentPane().add(gamerId);
		gamerId.setColumns(10);
		
		name = new JTextField();
		name.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
		name.setBounds(358, 214, 240, 37);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
		password.setBounds(358, 287, 240, 39);
		frame.getContentPane().add(password);
		
		JButton btnRegister = new JButton("Register");
		Image img=new ImageIcon(this.getClass().getResource("/tick.png")).getImage();
		btnRegister.setIcon(new ImageIcon(img));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String game=gamerId.getText();
				String playerName=name.getText();
				String pass=password.getText();
				String score=textScoreNull.getText();
				try {
                    Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Suraj\\eclipse-workspace\\PlayerLoginGame.db");

                    String query = "INSERT INTO player values('" + game + "','" + playerName + "','" + pass + "','" + score +  "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnRegister, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnRegister, "Your account is sucessfully created");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
				
			}
		});
		
		
		btnRegister.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		btnRegister.setBounds(293, 392, 200, 48);
		frame.getContentPane().add(btnRegister);
		
		JLabel lblNewLabel = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/Register.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(27, 127, 147, 185);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg2.jpeg"));
		lblNewLabel_1.setBounds(0, 0, 806, 507);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg2.jpeg"));
		lblNewLabel_2.setBounds(0, 0, 806, 185);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg2.jpeg"));
		lblNewLabel_3.setBounds(0, 350, 806, 157);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg2.jpeg"));
		lblNewLabel_4.setBounds(325, 0, 481, 363);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg2.jpeg"));
		lblNewLabel_5.setBounds(338, 261, 468, 246);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg2.jpeg"));
		lblNewLabel_6.setBounds(333, 0, 473, 86);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg2.jpeg"));
		lblNewLabel_7.setBounds(637, 0, 169, 507);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg2.jpeg"));
		lblNewLabel_8.setBounds(338, 336, 468, 171);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg2.jpeg"));
		lblNewLabel_9.setBounds(650, 0, 156, 157);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg2.jpeg"));
		lblNewLabel_10.setBounds(644, 350, 162, 157);
		frame.getContentPane().add(lblNewLabel_10);
		
		textScoreNull = new JTextField("0");
		textScoreNull.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		textScoreNull.setBounds(358, 351, 240, 31);
		frame.getContentPane().add(textScoreNull);
		textScoreNull.setColumns(10);
		
		
	    }
}
