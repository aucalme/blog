package edu.java.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain07 {

	private JFrame frame;
	private JTextField textId;
	private JPasswordField passwordField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					AppMain07 window = new AppMain07();
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
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 580, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelId = new JLabel(" 아이디");
		labelId.setHorizontalAlignment(SwingConstants.CENTER);
		labelId.setOpaque(true);
		labelId.setBackground(SystemColor.inactiveCaption);
		labelId.setFont(new Font("D2Coding", Font.PLAIN, 24));
		labelId.setBounds(12, 10, 164, 57);
		frame.getContentPane().add(labelId);
		
		textId = new JTextField();
		textId.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textId.setBounds(188, 10, 360, 57);
		frame.getContentPane().add(textId);
		textId.setColumns(10);
		
		JLabel labelPassword = new JLabel("비밀번호");
		labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
		labelPassword.setBackground(SystemColor.inactiveCaption);
		labelPassword.setOpaque(true);
		labelPassword.setFont(new Font("D2Coding", Font.PLAIN, 24));
		labelPassword.setBounds(12, 77, 164, 57);
		frame.getContentPane().add(labelPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("D2Coding", Font.PLAIN, 24));
		passwordField.setBounds(188, 77, 360, 57);
		frame.getContentPane().add(passwordField);
		
		JButton btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showIdPassword();
			}
		});
		btnConfirm.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnConfirm.setBounds(12, 144, 164, 57);
		frame.getContentPane().add(btnConfirm);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textArea.setBounds(12, 211, 527, 194);
		frame.getContentPane().add(textArea);
	}

	private void showIdPassword() {
		String id = textId.getText();
		//		String pw = passwordField.getText();
		// -> JPasswordField 클래스의 getText 메서드는 deprecated(더이상 사용을 권장하지 않는) 메서드.
		// -> 더이상 오류 수정을 하지 않고, Java 버전이 업그레이될 때 사라질 수 있는 메서드.
		// -> getText 대신에 getPassword 메서드를 사용하기를 권장.
//		String result = "ID: " + id + "\n" + "PW: " + pw;
		char[] pw = passwordField.getPassword();
		
		StringBuffer result = new StringBuffer();
		result.append("ID: ").append(id).append("\n")
			.append("PW: ").append(pw);
		
		textArea.setText(result.toString());
	}
}