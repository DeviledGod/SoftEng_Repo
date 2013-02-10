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


public class Bid extends JFrame {

	private JPanel contentPane;
	private JLabel lblSetPrc;
	private JLabel lblRaiseNum;
	private JLabel lblDD;
	private JLabel lblDM;
	private JLabel lblDY;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bid frame = new Bid();
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
	public Bid() {
		setResizable(false);
		setTitle("Bid");
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
		
		JLabel lblUploadYourItems = new JLabel("This is a picture of the item!");
		lblUploadYourItems.setHorizontalAlignment(SwingConstants.CENTER);
		lblUploadYourItems.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUploadYourItems.setBounds(10, 416, 278, 17);
		contentPane.add(lblUploadYourItems);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(383, 219, 46, 14);
		contentPane.add(lblTitle);
		
		JLabel lblCurrentPrice = new JLabel("Current Price:");
		lblCurrentPrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCurrentPrice.setBounds(383, 258, 75, 15);
		contentPane.add(lblCurrentPrice);
		
		JLabel lblSetPrice = new JLabel("My Bid:");
		lblSetPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSetPrice.setBounds(383, 316, 57, 15);
		contentPane.add(lblSetPrice);
		
		JLabel lblRaise = new JLabel("Place at least:");
		lblRaise.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRaise.setBounds(383, 288, 98, 15);
		contentPane.add(lblRaise);
		
		JLabel lblDueDate = new JLabel("Due Date:");
		lblDueDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDueDate.setBounds(383, 415, 56, 15);
		contentPane.add(lblDueDate);
		
		lblSetPrc = new JLabel();
		lblSetPrc.setBounds(499, 285, 86, 20);
		contentPane.add(lblSetPrc);
		
		lblRaiseNum = new JLabel();
		lblRaiseNum.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRaiseNum.setForeground(new Color(102, 0, 102));
		lblRaiseNum.setBounds(499, 314, 86, 20);
		contentPane.add(lblRaiseNum);
		
		lblDD = new JLabel();
		lblDD.setBounds(499, 413, 27, 20);
		contentPane.add(lblDD);
		
		lblDM = new JLabel();
		lblDM.setBounds(536, 413, 30, 20);
		contentPane.add(lblDM);
		
		lblDY = new JLabel();
		lblDY.setBounds(576, 413, 46, 20);
		contentPane.add(lblDY);
		
		JLabel labelEuro1 = new JLabel("\u20AC");
		labelEuro1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelEuro1.setBounds(595, 257, 7, 16);
		contentPane.add(labelEuro1);
		
		JLabel labelEuro2 = new JLabel("\u20AC");
		labelEuro2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelEuro2.setBounds(595, 284, 7, 16);
		contentPane.add(labelEuro2);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDay.setBounds(499, 388, 27, 14);
		contentPane.add(lblDay);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setBounds(573, 388, 46, 14);
		contentPane.add(lblYear);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDescription.setBounds(383, 455, 82, 17);
		contentPane.add(lblDescription);
		
		JButton btnBid = new JButton("Bid!");
		btnBid.setForeground(new Color(102, 0, 102));
		btnBid.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBid.setBounds(650, 258, 110, 70);
		contentPane.add(btnBid);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(204, 102, 0));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBounds(650, 398, 110, 35);
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
		lblShippingMethod.setBounds(10, 484, 110, 15);
		contentPane.add(lblShippingMethod);
		
		JLabel lblPaymentMethod = new JLabel("Payment Method:");
		lblPaymentMethod.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaymentMethod.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPaymentMethod.setBounds(10, 523, 110, 15);
		contentPane.add(lblPaymentMethod);
		
		JLabel lblSellYourItems = new JLabel("Your shopping");
		lblSellYourItems.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSellYourItems.setBounds(10, 29, 128, 40);
		contentPane.add(lblSellYourItems);
		
		JLabel lblWith = new JLabel("with");
		lblWith.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWith.setBounds(123, 83, 57, 14);
		contentPane.add(lblWith);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(536, 388, 49, 14);
		contentPane.add(lblMonth);
		
		JLabel labelTitle = new JLabel("");
		labelTitle.setBounds(499, 213, 178, 20);
		contentPane.add(labelTitle);
		
		JLabel labelCurrentPrc = new JLabel("");
		labelCurrentPrc.setBounds(499, 258, 87, 20);
		contentPane.add(labelCurrentPrc);
		
		JLabel label = new JLabel("\u20AC");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(595, 315, 7, 16);
		contentPane.add(label);
		
		JComboBox comboBoxShipping = new JComboBox();
		comboBoxShipping.setModel(new DefaultComboBoxModel(new String[] {"Free Shipping", "UPS", "DHL", "FedEx"}));
		comboBoxShipping.setBounds(130, 478, 110, 28);
		contentPane.add(comboBoxShipping);
		
		JComboBox comboBoxPayment = new JComboBox();
		comboBoxPayment.setModel(new DefaultComboBoxModel(new String[] {"PayPal", "Bill Me Later", "Western Union", "MoneyGram"}));
		comboBoxPayment.setBounds(130, 517, 110, 28);
		contentPane.add(comboBoxPayment);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStatus.setBounds(383, 350, 45, 15);
		contentPane.add(lblStatus);
		
		JLabel labelSts = new JLabel("");
		labelSts.setBackground(Color.WHITE);
		labelSts.setForeground(Color.BLUE);
		labelSts.setBounds(499, 345, 86, 20);
		contentPane.add(labelSts);
	}
}
