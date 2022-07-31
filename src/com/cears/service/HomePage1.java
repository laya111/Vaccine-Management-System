package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.EtchedBorder;

public class HomePage1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage1 frame = new HomePage1();
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
	public HomePage1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 547);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 21));
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage hm= new HomePage();
				hm.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.setBackground(new Color(189, 183, 107));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Microsoft Himalaya", Font.ITALIC, 28));
		btnNewButton.setBounds(185, 211, 268, 55);
		contentPane.add(btnNewButton);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn sn=new SignIn();
				sn.setVisible(true);
				setVisible(false);
			}
		});
		btnSignIn.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnSignIn.setBackground(new Color(189, 183, 107));
		btnSignIn.setForeground(new Color(0, 0, 0));
		btnSignIn.setFont(new Font("Microsoft Himalaya", Font.ITALIC, 28));
		btnSignIn.setBounds(185, 333, 268, 55);
		contentPane.add(btnSignIn);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("List.focusCellHighlightBorder"));
		panel.setToolTipText("");
		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(34, 52, 611, 55);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Welcome to Covid Vaccination Centre");
		panel.add(lblNewLabel);
		lblNewLabel.setBorder(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Microsoft Himalaya", Font.BOLD | Font.ITALIC, 43));
	}
}
