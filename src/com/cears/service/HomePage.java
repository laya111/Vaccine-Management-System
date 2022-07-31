package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.JRadioButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 924);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		lblNewLabel_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel_1.setBounds(new Rectangle(2, 54, 917, 470));
		lblNewLabel_1.setBorder(new LineBorder(SystemColor.activeCaption, 26));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblNewLabel_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_1.setSize(new Dimension(3, 5));
		lblNewLabel_1.setMaximumSize(new Dimension(21, 8));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY));
		textField.setBounds(266, 189, 157, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(128, 128, 128), Color.DARK_GRAY));
		textField_1.setBounds(266, 142, 157, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY));
		textField_2.setBounds(266, 243, 157, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY));
		textField_3.setColumns(10);
		textField_3.setBounds(266, 284, 157, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY));
		textField_4.setColumns(10);
		textField_4.setBounds(266, 319, 157, 19);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_2 = new JLabel("First Name    :");
		lblNewLabel_2.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(128, 146, 113, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Last Name ");
		lblNewLabel_2_1.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(128, 235, 141, 31);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Middle Name  :");
		lblNewLabel_2_2.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(128, 185, 151, 31);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Email_id");
		lblNewLabel_2_2_1.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 16));
		lblNewLabel_2_2_1.setBounds(128, 276, 132, 31);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("DOB");
		lblNewLabel_2_2_2.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 16));
		lblNewLabel_2_2_2.setBounds(128, 311, 134, 31);
		contentPane.add(lblNewLabel_2_2_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Maiandra GD", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(233, 376, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Maiandra GD", Font.PLAIN, 14));
		rdbtnFemale.setBounds(343, 376, 103, 21);
		contentPane.add(rdbtnFemale);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Gender");
		lblNewLabel_2_2_2_1.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 16));
		lblNewLabel_2_2_2_1.setBounds(128, 370, 141, 31);
		contentPane.add(lblNewLabel_2_2_2_1);
		
		JLabel lblNewLabel_2_2_2_1_1 = new JLabel("Address");
		lblNewLabel_2_2_2_1_1.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 16));
		lblNewLabel_2_2_2_1_1.setBounds(128, 443, 142, 31);
		contentPane.add(lblNewLabel_2_2_2_1_1);
		
		textField_5 = new JTextField();
		textField_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY));
		textField_5.setColumns(10);
		textField_5.setBounds(233, 434, 179, 82);
		contentPane.add(textField_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 102, 204));
		panel.setBounds(15, 10, 899, 82);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("----LOGIN----");
		panel.add(lblNewLabel);
		lblNewLabel.setBorder(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Microsoft Himalaya", Font.BOLD | Font.ITALIC, 38));
		lblNewLabel.setBackground(new Color(204, 204, 204));
		
		JButton btnNewButton = new JButton("Cancle");
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage1 hp=new HomePage1();
				hp.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBounds(146, 570, 133, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login In");
		btnNewButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(124, 252, 0)));
		btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(338, 570, 157, 41);
		contentPane.add(btnNewButton_1);
		setUndecorated(true);
	}
}
