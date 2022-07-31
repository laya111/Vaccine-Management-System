package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 616);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(143, 188, 143));
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(121, 310, 472, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 212, 472, 50);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("STXihei", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(214, 431, 257, 63);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your UserName(Email_id) :");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setForeground(new Color(0, 0, 139));
		lblNewLabel_1.setBounds(41, 196, 270, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter your Password here :");
		lblNewLabel_2.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setForeground(new Color(0, 0, 139));
		lblNewLabel_2.setBounds(41, 293, 205, 13);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(85, 107, 47), new Color(0, 0, 0)));
		panel.setBackground(new Color(85, 107, 47));
		panel.setBounds(41, 73, 640, 71);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel(" -- SIGN UP --");
		panel.add(lblNewLabel);
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel.setBackground(new Color(85, 107, 47));
		lblNewLabel.setFont(new Font("Microsoft Himalaya", Font.BOLD | Font.ITALIC, 36));
	}
}
