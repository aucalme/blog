package edu.java.jdbc06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class YamukjaUpdate extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private int index;
	private YamukjaDao dao;
	private Component parentComponent;
	private YamukjaMain mainApp;
	/**
	 * Launch the application.
	 */
	public static void showUpdate() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YamukjaUpdate frame = new YamukjaUpdate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void UpdateFrame(Component parentComponent, int index, YamukjaMain mainApp) {
		this.parentComponent = parentComponent;
		this.index = index;
		this.dao = YamukjaDaoImpl.getInstance();
		this.mainApp = mainApp;
	}
	

	public YamukjaUpdate() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 428, 258);
		contentPane = new JPanel();
		setTitle("Yamukja 수정");
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("수량");
		lblNewLabel.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblNewLabel.setBounds(55, 97, 57, 53);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("휴먼편지체", Font.PLAIN, 27));
		textField.setBounds(126, 96, 211, 53);
		contentPane.add(textField);
		textField.setText("1");
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("수정");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				updateMenu();
			}
		});
		btnNewButton.setForeground(new Color(255, 20, 147));
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		btnNewButton.setBounds(126, 160, 78, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(255, 20, 147));
		btnNewButton_1.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(255, 182, 193));
		btnNewButton_1.setBounds(221, 160, 78, 39);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\minji\\Desktop\\Minji\\image\\KakaoTalk_20211222_121553134.jpg"));
		lblNewLabel_1.setBounds(101, 12, 219, 53);
		contentPane.add(lblNewLabel_1);
	}

	protected void updateMenu() {
		String price = textField.getText();
		Yamukja y = new Yamukja();
		
		
		int result = dao.update(index, y);
		try {
		if(result == -1) {
			JOptionPane.showMessageDialog(contentPane, "수량 변경할 행을 선택하세요.", "수량 확인",0);
		}}catch(Exception e) {
		if(result == 1) {
			dispose();
			
		JOptionPane.showMessageDialog(contentPane, "수량이 변경되었습니다.", "수량 변경",1);
		}
		}
		
	
		
	}

}
