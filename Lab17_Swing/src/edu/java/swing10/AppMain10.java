package edu.java.swing10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class AppMain10 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain10 window = new AppMain10();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppMain10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 25));
		textField.setBounds(14, 12, 307, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnInput = new JButton("입력");
		btnInput.setFont(new Font("굴림", Font.PLAIN, 24));
		btnInput.setBounds(333, 12, 85, 60);
		frame.getContentPane().add(btnInput);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.setFont(new Font("굴림", Font.PLAIN, 24));
		btnDelete.setBounds(333, 84, 85, 60);
		frame.getContentPane().add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 84, 307, 412);
		frame.getContentPane().add(scrollPane);
		
		JList list = new JList();
		scrollPane.setColumnHeaderView(list);
	}
}
