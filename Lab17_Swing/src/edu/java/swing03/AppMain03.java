package edu.java.swing03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Event;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain03 {

	private JFrame frame;
	private JTextField textInput1;
	private JTextField textInput2;
	private JTextField textOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override // 쓰레드가 시작될 때 Java Runtime에 의해서 자동으로 호출되는 메서드
			public void run() {
				try {
					AppMain03 window = new AppMain03();
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
	public AppMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 734, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Number 1");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel.setBounds(14, 12, 195, 80);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Number 2");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(14, 104, 195, 80);
		frame.getContentPane().add(lblNewLabel_1);

		textInput1 = new JTextField();
		textInput1.setFont(new Font("굴림", Font.PLAIN, 40));
		textInput1.setBounds(218, 12, 484, 80);
		frame.getContentPane().add(textInput1);
		textInput1.setColumns(10);

		textInput2 = new JTextField();
		textInput2.setFont(new Font("굴림", Font.PLAIN, 40));
		textInput2.setBounds(218, 104, 484, 80);
		frame.getContentPane().add(textInput2);
		textInput2.setColumns(10);

		JButton btnp = new JButton("+");
		btnp.setFont(new Font("굴림", Font.PLAIN, 35));
		btnp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("action command: " + e.getActionCommand());
				System.out.println("source: " + e.getSource());
				
				// + 버튼이 할 일을 작성
				// textInput1, textInput2에 입력된 문자열을 숫자(double)로 변환
				// 두 숫자의 덧셈 결과를 textOutput에 씀.
				
				try {
					double x = Double.parseDouble(textInput1.getText());
					double y = Double.parseDouble(textInput2.getText());
					double result = x + y;
					textOutput.setText(""+result);
				} catch (Exception ex) {
					textOutput.setText("숫자로 입력하세요...");
				}

			}
		});
		btnp.setBounds(14, 196, 151, 65);
		frame.getContentPane().add(btnp);

		JButton btnm = new JButton("-");
		btnm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// - 버튼이 할 일을 작성
				System.out.println("action command: " + e.getActionCommand());
				System.out.println("source: " + e.getSource());
				try {
					double x = Double.parseDouble(textInput1.getText());
					double y = Double.parseDouble(textInput2.getText());
					double result = x - y;
					String resultMessage = "" + result;
					textOutput.setText(resultMessage);

				} catch (Exception ex) {
					textOutput.setText("숫자로 입력하세요...");
				}
			}
		});
		btnm.setFont(new Font("굴림", Font.PLAIN, 35));
		btnm.setBounds(179, 196, 159, 65);
		frame.getContentPane().add(btnm);

		JButton btng = new JButton("x");
		btng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("action command: " + e.getActionCommand());
				System.out.println("source: " + e.getSource());
			}
		});
		btng.setFont(new Font("굴림", Font.PLAIN, 35));
		btng.setBounds(352, 196, 168, 65);
		frame.getContentPane().add(btng);

		JButton btnn = new JButton("/");
		btnn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double x = Double.parseDouble(textInput1.getText());
					double y = Double.parseDouble(textInput2.getText());
					double result = x / y;
					textOutput.setText("" + result);
				} catch (Exception ex) {
					textOutput.setText("숫자만 입력하세요...");
				}
			}
		});
		btnn.setFont(new Font("굴림", Font.PLAIN, 35));
		btnn.setBounds(534, 196, 168, 65);
		frame.getContentPane().add(btnn);

		textOutput = new JTextField();
		textOutput.setFont(new Font("굴림", Font.PLAIN, 40));
		textOutput.setBounds(14, 273, 688, 82);
		frame.getContentPane().add(textOutput);
		textOutput.setColumns(10);
	}

}
