package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Loginform extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginform frame = new Loginform();
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
	public Loginform() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Login ");
		btnNewButton.setFont(new Font("Algerian", Font.ITALIC, 18));
		btnNewButton.setBounds(352, 242, 160, 47);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign in");
		btnNewButton_1.setFont(new Font("Algerian", Font.ITALIC, 19));
		btnNewButton_1.setBounds(363, 335, 149, 47);
		getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(128, 35, 584, 104);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 482);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		btnNewButton.setBounds(328, 165, 85, 42);
		contentPane.add(btnNewButton);
		
		JPanel panel;
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(10, 10, 768, 90);
		contentPane.add(panel_1);
		
		lblNewLabel_1 = new JLabel("Welcome to Vaccination centre ");
		lblNewLabel_1.setBackground(Color.PINK);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		
		JButton btnSubmit = new JButton("Sign up");
		btnSubmit.setBounds(328, 264, 85, 42);
		contentPane.add(btnSubmit);
	}
}
