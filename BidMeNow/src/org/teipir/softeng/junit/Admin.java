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


public class Admin extends JFrame {

	private JPanel contentPane;
	private JLabel lblTlt;
	private JLabel lblSrtPrc;
	private JLabel lblFnlPrc;
	private JLabel lblPerRaise;
	private JTextField textFieldSD;
	private JTextField textFieldSM;
	private JTextField textFieldSY;
	private JTextField textFieldDD;
	private JTextField textFieldDM;
	private JTextField textFieldDY;
	private JTextField textFieldSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setResizable(false);
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 611);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearch = new JLabel("Search:");
		lblSearch.setForeground(new Color(0, 153, 0));
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSearch.setBounds(342, 191, 77, 40);
		contentPane.add(lblSearch);
		
		JButton btnGo = new JButton("Go");
		btnGo.setForeground(new Color(0, 0, 204));
		btnGo.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnGo.setBounds(682, 194, 61, 37);
		contentPane.add(btnGo);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(429, 195, 245, 36);
		contentPane.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
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
		
		JLabel lblRemovePicture = new JLabel("Remove picture?");
		lblRemovePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemovePicture.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRemovePicture.setBounds(10, 416, 164, 22);
		contentPane.add(lblRemovePicture);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemove.setForeground(new Color(204, 204, 0));
		btnRemove.setBounds(199, 416, 89, 23);
		contentPane.add(btnRemove);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(388, 274, 46, 14);
		contentPane.add(lblTitle);
		
		JLabel lblStartPrice = new JLabel("Start Price:");
		lblStartPrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStartPrice.setBounds(388, 313, 61, 15);
		contentPane.add(lblStartPrice);
		
		JLabel lblFinalPrice = new JLabel("Final Price:");
		lblFinalPrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFinalPrice.setBounds(388, 342, 57, 15);
		contentPane.add(lblFinalPrice);
		
		JLabel lblPercentageRaise = new JLabel("Percentage Raise:");
		lblPercentageRaise.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPercentageRaise.setBounds(388, 371, 98, 15);
		contentPane.add(lblPercentageRaise);
		
		JLabel lblStartDate = new JLabel("Start Date:");
		lblStartDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStartDate.setBounds(388, 438, 61, 15);
		contentPane.add(lblStartDate);
		
		JLabel lblDueDate = new JLabel("Due Date:");
		lblDueDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDueDate.setBounds(388, 466, 56, 15);
		contentPane.add(lblDueDate);
		
		lblTlt = new JLabel();
		lblTlt.setBounds(504, 273, 174, 20);
		contentPane.add(lblTlt);
		
		lblSrtPrc = new JLabel();
		lblSrtPrc.setBounds(504, 311, 86, 20);
		contentPane.add(lblSrtPrc);
		
		lblFnlPrc = new JLabel();
		lblFnlPrc.setBounds(504, 340, 86, 20);
		contentPane.add(lblFnlPrc);
		
		lblPerRaise = new JLabel();
		lblPerRaise.setBounds(504, 369, 86, 20);
		contentPane.add(lblPerRaise);
		
		textFieldSD = new JTextField();
		textFieldSD.setBounds(504, 436, 27, 20);
		contentPane.add(textFieldSD);
		textFieldSD.setColumns(1);
		
		textFieldSM = new JTextField();
		textFieldSM.setBounds(541, 436, 30, 20);
		contentPane.add(textFieldSM);
		textFieldSM.setColumns(1);
		
		textFieldSY = new JTextField();
		textFieldSY.setBounds(581, 436, 46, 20);
		contentPane.add(textFieldSY);
		textFieldSY.setColumns(1);
		
		textFieldDD = new JTextField();
		textFieldDD.setBounds(504, 464, 27, 20);
		contentPane.add(textFieldDD);
		textFieldDD.setColumns(1);
		
		textFieldDM = new JTextField();
		textFieldDM.setBounds(541, 464, 30, 20);
		contentPane.add(textFieldDM);
		textFieldDM.setColumns(1);
		
		textFieldDY = new JTextField();
		textFieldDY.setBounds(581, 464, 46, 20);
		contentPane.add(textFieldDY);
		textFieldDY.setColumns(1);
		
		JLabel labelEuro1 = new JLabel("\u20AC");
		labelEuro1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelEuro1.setBounds(605, 312, 7, 16);
		contentPane.add(labelEuro1);
		
		JLabel labelEuro2 = new JLabel("\u20AC");
		labelEuro2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelEuro2.setBounds(605, 341, 7, 16);
		contentPane.add(labelEuro2);
		
		JLabel label = new JLabel("%");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(600, 370, 12, 16);
		contentPane.add(label);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDay.setBounds(504, 411, 27, 14);
		contentPane.add(lblDay);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setBounds(581, 411, 46, 14);
		contentPane.add(lblYear);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDescription.setBounds(10, 466, 82, 17);
		contentPane.add(lblDescription);
		
		JButton btnSave = new JButton("Save");
		btnSave.setForeground(new Color(102, 0, 102));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSave.setBounds(388, 516, 116, 40);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(204, 102, 0));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBounds(567, 516, 116, 40);
		contentPane.add(btnCancel);
		
		JTextArea textAreaDesription = new JTextArea();
		textAreaDesription.setBackground(new Color(255, 255, 102));
		textAreaDesription.setForeground(Color.DARK_GRAY);
		textAreaDesription.setColumns(5);
		textAreaDesription.setBounds(10, 496, 270, 66);
		contentPane.add(textAreaDesription);
		
		JLabel lblAdministration = new JLabel("Administration");
		lblAdministration.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAdministration.setBounds(10, 29, 128, 40);
		contentPane.add(lblAdministration);
		
		JLabel lblInterface = new JLabel("Interface");
		lblInterface.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInterface.setBounds(99, 80, 75, 20);
		contentPane.add(lblInterface);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(541, 411, 49, 14);
		contentPane.add(lblMonth);
		
		JLabel lblSearchId = new JLabel("Search for items by ID...");
		lblSearchId.setForeground(new Color(204, 153, 255));
		lblSearchId.setBackground(Color.WHITE);
		lblSearchId.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchId.setBounds(433, 237, 245, 14);
		contentPane.add(lblSearchId);
		
		JCheckBox chckbxActive = new JCheckBox("Active");
		chckbxActive.setBackground(new Color(153, 255, 102));
		chckbxActive.setBounds(646, 310, 97, 23);
		contentPane.add(chckbxActive);
		
		JCheckBox chckbxDelete = new JCheckBox("Delete");
		chckbxDelete.setBackground(new Color(255, 153, 102));
		chckbxDelete.setBounds(646, 339, 97, 23);
		contentPane.add(chckbxDelete);
		
		JComboBox comboBoxRate = new JComboBox();
		comboBoxRate.setBackground(new Color(204, 153, 255));
		comboBoxRate.setModel(new DefaultComboBoxModel(new String[] {"Rate", "1 Star", "2 Stars", "3 Stars", "4 Stars", "5 Stars"}));
		comboBoxRate.setBounds(646, 369, 97, 20);
		contentPane.add(comboBoxRate);
	}
}
