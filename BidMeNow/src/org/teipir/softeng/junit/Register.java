package org.teipir.softeng.junit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldEmail;
	private JTextField textFieldUsername;
	private JPasswordField passwordField_Pass;
	private JPasswordField passwordField_ConfPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setResizable(false);
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 519);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGetStarted = new JLabel("Get started");
		lblGetStarted.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGetStarted.setBounds(10, 11, 96, 26);
		contentPane.add(lblGetStarted);
		
		JLabel lblWith = new JLabel("with");
		lblWith.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWith.setBounds(85, 48, 38, 26);
		contentPane.add(lblWith);
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setIcon(new ImageIcon("C:\\Users\\DeviledGod\\E. C. S\\Semester 7\\Software Engineering\\Laboratory\\GitHub\\GitHub Repo\\BidMeNow\\Logo1.png"));
		labelLogo.setBounds(116, 0, 418, 214);
		contentPane.add(labelLogo);
		
		JLabel lblCreateAccount = new JLabel("Create your personal account.");
		lblCreateAccount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCreateAccount.setBounds(10, 203, 202, 26);
		contentPane.add(lblCreateAccount);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName.setBounds(38, 256, 74, 20);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastName.setBounds(38, 287, 74, 26);
		contentPane.add(lblLastName);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(38, 324, 68, 26);
		contentPane.add(lblEmail);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setBounds(126, 256, 157, 20);
		contentPane.add(textFieldFirstName);
		textFieldFirstName.setColumns(1);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setBounds(126, 292, 157, 21);
		contentPane.add(textFieldLastName);
		textFieldLastName.setColumns(1);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(126, 329, 157, 21);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(1);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(318, 256, 115, 26);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(318, 293, 110, 20);
		contentPane.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfirmPassword.setBounds(318, 330, 115, 20);
		contentPane.add(lblConfirmPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(452, 256, 157, 21);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(1);
		
		JButton btnRegister = new JButton("Register!");
		btnRegister.setForeground(new Color(102, 0, 102));
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRegister.setBounds(452, 374, 157, 44);
		contentPane.add(btnRegister);
		
		JButton btnClear = new JButton("C\r\nl\r\ne\r\na\r\nr");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				textFieldFirstName.setText("");
				textFieldLastName.setText("");
				textFieldEmail.setText("");
				textFieldUsername.setText("");
				textFieldLastName.setText("");
				passwordField_Pass.setText("");
				passwordField_ConfPass.setText("");

			}
		});
		btnClear.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				
			}
		});
		btnClear.setForeground(new Color(204, 102, 0));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(452, 429, 157, 26);
		contentPane.add(btnClear);
		
		JLabel lblLoginback = new JLabel("Already a member? Click here to login...");
		lblLoginback.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginback.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLoginback.setBounds(38, 400, 303, 37);
		contentPane.add(lblLoginback);
		
		passwordField_Pass = new JPasswordField();
		passwordField_Pass.setBounds(452, 295, 157, 20);
		contentPane.add(passwordField_Pass);
		
		passwordField_ConfPass = new JPasswordField();
		passwordField_ConfPass.setBounds(452, 329, 157, 20);
		contentPane.add(passwordField_ConfPass);
	}

}
