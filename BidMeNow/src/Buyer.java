import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;


public class Buyer extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buyer frame = new Buyer();
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
	public Buyer() {
		setTitle("Main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 744);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setLabelFor(labelLogo);
		labelLogo.setIcon(new ImageIcon("C:\\Users\\DeviledGod\\E. C. S\\Semester 7\\Software Engineering\\Laboratory\\Workspace\\BidMeNow\\Logo1.png"));
		labelLogo.setBounds(288, 0, 428, 207);
		contentPane.add(labelLogo);
		
		JLabel labelSearch = new JLabel("");
		labelSearch.setLabelFor(labelSearch);
		labelSearch.setHorizontalAlignment(SwingConstants.CENTER);
		labelSearch.setIcon(new ImageIcon("C:\\Users\\DeviledGod\\E. C. S\\Semester 7\\Software Engineering\\Laboratory\\Workspace\\BidMeNow\\Search.jpg"));
		labelSearch.setBounds(145, 198, 119, 81);
		contentPane.add(labelSearch);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(276, 210, 458, 39);
		contentPane.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JButton buttonSearch = new JButton(" Go!");
		buttonSearch.setForeground(new Color(153, 51, 102));
		buttonSearch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonSearch.setBounds(778, 200, 119, 52);
		contentPane.add(buttonSearch);
		
		JLabel lblMyAccount = new JLabel("My Account");
		lblMyAccount.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMyAccount.setBounds(35, 266, 90, 28);
		contentPane.add(lblMyAccount);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setForeground(new Color(102, 0, 102));
		lblInfo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInfo.setBounds(60, 305, 60, 15);
		contentPane.add(lblInfo);
		
		JLabel lblMyItems = new JLabel("My Items");
		lblMyItems.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMyItems.setBounds(35, 331, 90, 28);
		contentPane.add(lblMyItems);
		
		JLabel lblNewItem = new JLabel("New Item");
		lblNewItem.setForeground(new Color(153, 51, 0));
		lblNewItem.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewItem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewItem.setBounds(50, 370, 70, 14);
		contentPane.add(lblNewItem);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setForeground(new Color(153, 51, 0));
		lblHistory.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHistory.setBounds(60, 395, 70, 14);
		contentPane.add(lblHistory);
		
		JLabel lblWatchList = new JLabel("Watch List");
		lblWatchList.setForeground(new Color(153, 51, 0));
		lblWatchList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblWatchList.setBounds(60, 419, 58, 15);
		contentPane.add(lblWatchList);
		
		JLabel lblWishList = new JLabel("Wish List");
		lblWishList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblWishList.setForeground(new Color(153, 51, 0));
		lblWishList.setBounds(60, 445, 60, 15);
		contentPane.add(lblWishList);
		
		JLabel lblMyMessages = new JLabel("My Messages");
		lblMyMessages.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMyMessages.setBounds(35, 471, 90, 22);
		contentPane.add(lblMyMessages);
		
		JLabel lblInbox = new JLabel("Inbox");
		lblInbox.setForeground(new Color(255, 204, 0));
		lblInbox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInbox.setBounds(55, 504, 60, 15);
		contentPane.add(lblInbox);
		
		JLabel lblSent = new JLabel("Sent");
		lblSent.setForeground(new Color(255, 204, 0));
		lblSent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSent.setBounds(55, 530, 64, 15);
		contentPane.add(lblSent);
		
		JLabel labelDrafts = new JLabel("Drafts");
		labelDrafts.setForeground(new Color(255, 204, 0));
		labelDrafts.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelDrafts.setBounds(55, 552, 60, 15);
		contentPane.add(labelDrafts);
		
		JLabel lblDeleted = new JLabel("Deleted");
		lblDeleted.setForeground(new Color(255, 204, 0));
		lblDeleted.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDeleted.setBounds(55, 578, 61, 15);
		contentPane.add(lblDeleted);
		
		JLabel labelPayPal = new JLabel("");
		labelPayPal.setIcon(new ImageIcon("C:\\Users\\DeviledGod\\E. C. S\\Semester 7\\Software Engineering\\Laboratory\\Workspace\\BidMeNow\\paypal.jpg"));
		labelPayPal.setBounds(762, 255, 194, 207);
		contentPane.add(labelPayPal);
		
		JLabel lblBillMeLater = new JLabel("UPS");
		lblBillMeLater.setIcon(new ImageIcon("C:\\Users\\DeviledGod\\E. C. S\\Semester 7\\Software Engineering\\Laboratory\\Workspace\\BidMeNow\\billmelater.jpeg"));
		lblBillMeLater.setBounds(762, 471, 194, 114);
		contentPane.add(lblBillMeLater);
		
		JLabel lblDhl = new JLabel("");
		lblDhl.setHorizontalAlignment(SwingConstants.CENTER);
		lblDhl.setIcon(new ImageIcon("C:\\Users\\DeviledGod\\E. C. S\\Semester 7\\Software Engineering\\Laboratory\\Workspace\\BidMeNow\\b1_dhl.jpg"));
		lblDhl.setBounds(170, 578, 114, 89);
		contentPane.add(lblDhl);
		
		JLabel lblUps = new JLabel("");
		lblUps.setHorizontalAlignment(SwingConstants.CENTER);
		lblUps.setIcon(new ImageIcon("C:\\Users\\DeviledGod\\E. C. S\\Semester 7\\Software Engineering\\Laboratory\\Workspace\\BidMeNow\\ups.jpg"));
		lblUps.setBounds(299, 578, 128, 101);
		contentPane.add(lblUps);
		
		JLabel lblFedex = new JLabel("");
		lblFedex.setHorizontalAlignment(SwingConstants.CENTER);
		lblFedex.setIcon(new ImageIcon("C:\\Users\\DeviledGod\\E. C. S\\Semester 7\\Software Engineering\\Laboratory\\Workspace\\BidMeNow\\FedEx-Express.png"));
		lblFedex.setBounds(437, 579, 160, 89);
		contentPane.add(lblFedex);
		
		JLabel lblWesternunion = new JLabel("");
		lblWesternunion.setIcon(new ImageIcon("C:\\Users\\DeviledGod\\E. C. S\\Semester 7\\Software Engineering\\Laboratory\\Workspace\\BidMeNow\\Western_Union_Moving_Money-paymentobserver.jpg"));
		lblWesternunion.setHorizontalAlignment(SwingConstants.CENTER);
		lblWesternunion.setBounds(762, 596, 194, 90);
		contentPane.add(lblWesternunion);
		
		JLabel lblMoneygram = new JLabel("");
		lblMoneygram.setIcon(new ImageIcon("C:\\Users\\DeviledGod\\E. C. S\\Semester 7\\Software Engineering\\Laboratory\\Workspace\\BidMeNow\\moneygram.png"));
		lblMoneygram.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoneygram.setBounds(592, 596, 160, 71);
		contentPane.add(lblMoneygram);
	}
}
