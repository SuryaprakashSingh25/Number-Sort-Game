package JavaProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class WelcomeWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeWindow frame = new WelcomeWindow();
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
	public WelcomeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("SORT IT OUT !!");
		lblNewLabel.setForeground(UIManager.getColor("TextArea.selectionBackground"));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(147, 27, 488, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sort sort=new Sort();
				sort.setVisible(true);
			}
		});
		btnStart.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btnStart.setBounds(256, 130, 234, 55);
		contentPane.add(btnStart);
		
	
		JButton btnLeaderBoard = new JButton("Leaderboard");
		btnLeaderBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            
				LeaderBoard leader=new LeaderBoard();
				leader.setVisible(true);
			}
		});
		btnLeaderBoard.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btnLeaderBoard.setBounds(256, 279, 234, 55);
		contentPane.add(btnLeaderBoard);
		
		JButton btnInstruction = new JButton("Instructions");
		btnInstruction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HowToPlay play=new HowToPlay();
				play.setVisible(true);
			}
		});
		btnInstruction.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		btnInstruction.setBounds(256, 207, 234, 55);
		contentPane.add(btnInstruction);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\BG3.jpg"));
		lblNewLabel_1.setBounds(0, 0, 756, 372);
		contentPane.add(lblNewLabel_1);
		
	}
}
