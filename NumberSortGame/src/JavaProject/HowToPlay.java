package JavaProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HowToPlay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HowToPlay frame = new HowToPlay();
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
	public HowToPlay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JLabel lblNewLabel = new JLabel("How To Play:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(200, 10, 245, 29);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("1. Press Start. You will enter Level 1");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(26, 96, 576, 29);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("3. On Completing Level 1 You Enter the Next Level With Less Time To Sort More Numbers");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(26, 214, 618, 23);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("4. Once You Have Sorted The Numbers Press Submit In Order To Determine The Result");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(26, 279, 594, 23);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("2. Try to Complete the Level in the Time Allocated in Order to Score Points");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(26, 156, 576, 19);
		contentPane.add(lblNewLabel_4);
		contentPane.setLayout(null);
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomeWindow window = new WelcomeWindow();
				window.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton.setBackground(UIManager.getColor("Button.foreground"));
		btnNewButton.setForeground(UIManager.getColor("CheckBox.highlight"));
		btnNewButton.setBounds(563, 19, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Suraj\\Downloads\\bg6.jpg"));
		lblNewLabel_5.setBounds(0, 0, 700, 384);
		contentPane.add(lblNewLabel_5);
		
		
		
	}
}
