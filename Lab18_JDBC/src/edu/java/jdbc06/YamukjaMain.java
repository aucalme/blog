package edu.java.jdbc06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

import edu.java.jdbc06.YamukjaDao;

public class YamukjaMain {

	private YamukjaDao dao;

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YamukjaMain window = new YamukjaMain();
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
	public YamukjaMain() {

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(253, 245, 230));
		frame.setTitle("Ya Muk Ja");
		frame.setBounds(100, 100, 908, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("휴먼편지체", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(235, 219, 81, 58);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("휴먼편지체", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(230, 289, 86, 58);
		frame.getContentPane().add(lblNewLabel_1_1);

		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 25));
		textField.setBounds(330, 219, 223, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.PLAIN, 25));
		passwordField.setBounds(330, 287, 223, 58);
		frame.getContentPane().add(passwordField);

		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				char[] pw = passwordField.getPassword();
				
				if (!id.equals("") && pw.length != 0) {
					JOptionPane.showMessageDialog(frame, "로그인에 성공하였습니다.", "로그인 성공", 1);
					YamukjaMenu.showMenuFrame();
				} else {
					JOptionPane.showMessageDialog(frame, "다시 입력해주세요.", "로그인 재시도", 0);
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 20, 147));
		btnNewButton.setBackground(new Color(255, 228, 225));
		btnNewButton.setFont(new Font("휴먼편지체", Font.PLAIN, 24));
		btnNewButton.setBounds(362, 367, 136, 50);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\minji\\Desktop\\Minji\\image\\yamukja (2) (2).jpg"));
		lblNewLabel_2.setBounds(-154, 0, 1044, 210);
		frame.getContentPane().add(lblNewLabel_2);

	}

}
