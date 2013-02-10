package org.teipir.softeng.junit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;


public class Seller extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitle;
	private JTextField textFieldStartPrice;
	private JTextField textFieldFinalPrice;
	private JTextField textFieldRaise;
	private JTextField textFieldSD;
	private JTextField textFieldSM;
	private JTextField textFieldSY;
	private JTextField textFieldDD;
	private JTextField textFieldDM;
	private JTextField textFieldDY;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seller frame = new Seller();
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
	public Seller() {
		setResizable(false);
		setTitle("Seller");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 611);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\DeviledGod\\E. C. S\\Semester 7\\Software Engineering\\Laboratory\\GitHub\\GitHub Repo\\BidMeNow\\Logo1.png"));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(190, 0, 422, 207);
		contentPane.add(lblLogo);
		
		JLabel lblPicture = new JLabel("Picture:");
		lblPicture.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblPicture.setBounds(10, 191, 64, 20);
		contentPane.add(lblPicture);
		
		Panel panelImage = new Panel();
		panelImage.setBackground(new Color(255, 204, 153));
		panelImage.setBounds(10, 217, 278, 193);
		contentPane.add(panelImage);
		
		JLabel lblUploadYourItems = new JLabel("Upload your item's picture!");
		lblUploadYourItems.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUploadYourItems.setBounds(10, 416, 164, 22);
		contentPane.add(lblUploadYourItems);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBrowse.setForeground(new Color(204, 204, 0));
		btnBrowse.setBounds(199, 415, 89, 23);
		contentPane.add(btnBrowse);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(383, 219, 46, 14);
		contentPane.add(lblTitle);
		
		JLabel lblStartPrice = new JLabel("Start Price:");
		lblStartPrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStartPrice.setBounds(383, 258, 61, 15);
		contentPane.add(lblStartPrice);
		
		JLabel lblFinalPrice = new JLabel("Final Price:");
		lblFinalPrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFinalPrice.setBounds(383, 287, 57, 15);
		contentPane.add(lblFinalPrice);
		
		JLabel lblPercentageRaise = new JLabel("Percentage Raise:");
		lblPercentageRaise.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPercentageRaise.setBounds(383, 316, 98, 15);
		contentPane.add(lblPercentageRaise);
		
		JLabel lblStartDate = new JLabel("Start Date:");
		lblStartDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStartDate.setBounds(383, 383, 61, 15);
		contentPane.add(lblStartDate);
		
		JLabel lblDueDate = new JLabel("Due Date:");
		lblDueDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDueDate.setBounds(383, 421, 56, 15);
		contentPane.add(lblDueDate);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setBounds(499, 218, 174, 20);
		contentPane.add(textFieldTitle);
		textFieldTitle.setColumns(1);
		
		textFieldStartPrice = new JTextField();
		textFieldStartPrice.setBounds(499, 256, 86, 20);
		contentPane.add(textFieldStartPrice);
		textFieldStartPrice.setColumns(1);
		
		textFieldFinalPrice = new JTextField();
		textFieldFinalPrice.setBounds(499, 285, 86, 20);
		contentPane.add(textFieldFinalPrice);
		textFieldFinalPrice.setColumns(1);
		
		textFieldRaise = new JTextField();
		textFieldRaise.setBounds(499, 314, 86, 20);
		contentPane.add(textFieldRaise);
		textFieldRaise.setColumns(1);
		
		textFieldSD = new JTextField();
		textFieldSD.setBounds(499, 381, 27, 20);
		contentPane.add(textFieldSD);
		textFieldSD.setColumns(1);
		
		textFieldSM = new JTextField();
		textFieldSM.setBounds(536, 381, 30, 20);
		contentPane.add(textFieldSM);
		textFieldSM.setColumns(1);
		
		textFieldSY = new JTextField();
		textFieldSY.setBounds(576, 381, 46, 20);
		contentPane.add(textFieldSY);
		textFieldSY.setColumns(1);
		
		textFieldDD = new JTextField();
		textFieldDD.setBounds(499, 419, 27, 20);
		contentPane.add(textFieldDD);
		textFieldDD.setColumns(1);
		
		textFieldDM = new JTextField();
		textFieldDM.setBounds(536, 420, 30, 20);
		contentPane.add(textFieldDM);
		textFieldDM.setColumns(1);
		
		textFieldDY = new JTextField();
		textFieldDY.setBounds(576, 420, 46, 20);
		contentPane.add(textFieldDY);
		textFieldDY.setColumns(1);
		
		JLabel labelEuro1 = new JLabel("\u20AC");
		labelEuro1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelEuro1.setBounds(595, 257, 7, 16);
		contentPane.add(labelEuro1);
		
		JLabel labelEuro2 = new JLabel("\u20AC");
		labelEuro2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelEuro2.setBounds(595, 286, 7, 16);
		contentPane.add(labelEuro2);
		
		JLabel label = new JLabel("%");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(595, 317, 12, 16);
		contentPane.add(label);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDay.setBounds(499, 359, 27, 14);
		contentPane.add(lblDay);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setBounds(573, 359, 46, 14);
		contentPane.add(lblYear);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDescription.setBounds(383, 455, 82, 17);
		contentPane.add(lblDescription);
		
		JButton btnSellIt = new JButton("Sell it!");
		btnSellIt.setForeground(new Color(102, 0, 102));
		btnSellIt.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSellIt.setBounds(650, 258, 110, 70);
		contentPane.add(btnSellIt);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(204, 102, 0));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBounds(650, 391, 110, 35);
		contentPane.add(btnCancel);
		
		JTextArea textAreaDesription = new JTextArea();
		textAreaDesription.setBackground(new Color(255, 255, 102));
		textAreaDesription.setForeground(Color.DARK_GRAY);
		textAreaDesription.setColumns(5);
		textAreaDesription.setBounds(383, 485, 375, 66);
		contentPane.add(textAreaDesription);
		
		JLabel lblShippingMethod = new JLabel("Shipping Method:");
		lblShippingMethod.setHorizontalAlignment(SwingConstants.CENTER);
		lblShippingMethod.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblShippingMethod.setBounds(10, 475, 110, 15);
		contentPane.add(lblShippingMethod);
		
		JLabel lblPaymentMethod = new JLabel("Payment Method:");
		lblPaymentMethod.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaymentMethod.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPaymentMethod.setBounds(10, 508, 110, 15);
		contentPane.add(lblPaymentMethod);
		
		JCheckBox chckbxUPS = new JCheckBox("UPS");
		chckbxUPS.setBackground(Color.WHITE);
		chckbxUPS.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxUPS.setBounds(129, 470, 55, 23);
		contentPane.add(chckbxUPS);
		
		JCheckBox chckbxDhl = new JCheckBox("DHL");
		chckbxDhl.setBackground(Color.WHITE);
		chckbxDhl.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxDhl.setBounds(199, 472, 59, 23);
		contentPane.add(chckbxDhl);
		
		JCheckBox chckbxFedex = new JCheckBox("FedEx");
		chckbxFedex.setBackground(Color.WHITE);
		chckbxFedex.setBounds(266, 472, 79, 23);
		contentPane.add(chckbxFedex);
		
		JCheckBox chckbxPaypal = new JCheckBox("PayPal");
		chckbxPaypal.setBackground(Color.WHITE);
		chckbxPaypal.setBounds(134, 506, 109, 23);
		contentPane.add(chckbxPaypal);
		
		JCheckBox chckbxWesternUnion = new JCheckBox("Western Union");
		chckbxWesternUnion.setBackground(Color.WHITE);
		chckbxWesternUnion.setBounds(133, 528, 110, 23);
		contentPane.add(chckbxWesternUnion);
		
		JCheckBox chckbxBillMeLater = new JCheckBox("Bill Me Later");
		chckbxBillMeLater.setBackground(Color.WHITE);
		chckbxBillMeLater.setBounds(265, 509, 112, 23);
		contentPane.add(chckbxBillMeLater);
		
		JCheckBox chckbxMoneygram = new JCheckBox("MoneyGram");
		chckbxMoneygram.setBackground(Color.WHITE);
		chckbxMoneygram.setBounds(265, 531, 112, 23);
		contentPane.add(chckbxMoneygram);
		
		JLabel lblSellYourItems = new JLabel("Sell your items");
		lblSellYourItems.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSellYourItems.setBounds(10, 29, 128, 40);
		contentPane.add(lblSellYourItems);
		
		JLabel lblWith = new JLabel("with");
		lblWith.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWith.setBounds(123, 83, 57, 14);
		contentPane.add(lblWith);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(536, 359, 49, 14);
		contentPane.add(lblMonth);
	}
}
