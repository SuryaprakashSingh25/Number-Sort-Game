package JavaProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.sql.*;
public class LeaderBoard extends JFrame {

	private JPanel contentPane;

	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaderBoard frame = new LeaderBoard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection=null;
	/**
	 * Create the frame.
	 */
	public LeaderBoard() {
		connection=sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 45, 356, 226);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomeWindow window = new WelcomeWindow();
				window.setVisible(true);
			}
		});
		
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton.setBounds(455, 22, 85, 21);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton(" Data");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="select GameId,Name,Score from player";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					table_1.setRowSelectionAllowed(false);
				}catch (Exception c) {
					c.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1.setBounds(455, 74, 85, 27);
		contentPane.add(btnNewButton_1);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 568, 316);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg1.jpeg"));
		lblNewLabel_1.setBounds(0, 0, 568, 316);
		contentPane.add(lblNewLabel_1);
				
		
		
	}
}
