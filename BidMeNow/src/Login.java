import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setEnabled(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 456);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLogin.setBounds(38, 179, 74, 36);
		contentPane.add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(121, 225, 74, 27);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(121, 274, 74, 27);
		contentPane.add(lblPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(205, 230, 123, 20);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(1);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(205, 279, 123, 20);
		contentPane.add(textFieldPassword);
		textFieldPassword.setColumns(1);
		
		JLabel lblRegister = new JLabel("Not a member yet? Click here to register!");
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRegister.setBounds(121, 354, 346, 36);
		contentPane.add(lblRegister);
		
		JLabel lblWelcome = new JLabel("Welcome ");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWelcome.setBounds(10, 11, 102, 42);
		contentPane.add(lblWelcome);
		
		JLabel lblTo = new JLabel("to");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTo.setBounds(83, 50, 24, 20);
		contentPane.add(lblTo);
		
		JLabel labelIcon = new JLabel("");
		labelIcon.setIcon(new ImageIcon("C:\\Users\\DeviledGod\\E. C. S\\Semester 7\\Software Engineering\\Laboratory\\GitHub\\GitHub Repo\\BidMeNow\\Logo1.png"));
		labelIcon.setBounds(93, 0, 414, 194);
		contentPane.add(labelIcon);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(102, 0, 102));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(365, 225, 102, 42);
		contentPane.add(btnLogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setForeground(new Color(204, 102, 0));
		btnClear.setBounds(365, 279, 102, 23);
		contentPane.add(btnClear);
	}
}
