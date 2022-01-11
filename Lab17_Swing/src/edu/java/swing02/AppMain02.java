package edu.java.swing02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain02 {

	private JFrame frame;
	private JTextField textInput;
	private JLabel lblOutput;
	private JButton btnConfirm;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain02 window = new AppMain02();
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
	public AppMain02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null); // Absolute layout - UI 콤포넌트들을 원하는 위치에 배치할 수 있는 레이아웃.
		
		lblOutput = new JLabel("Hello, Swing!");
		lblOutput.setFont(new Font("D2Coding", Font.BOLD, 38));
		lblOutput.setBounds(14, 12, 554, 79);
		frame.getContentPane().add(lblOutput);
		
		textInput = new JTextField();
		textInput.setFont(new Font("D2Coding", Font.PLAIN, 34));
		textInput.setBounds(14, 103, 554, 79);
		frame.getContentPane().add(textInput);
		textInput.setColumns(10);
		
		btnConfirm = new JButton("입력 완료");
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// 버튼을 클릭했을 때 할 일을 작성
				// JTextField textInput에서 입력된 문자열을 읽고, JLabel lblOutput에 그 문자열을 씀.
				lblOutput.setText(textInput.getText());
			}
		});
		btnConfirm.setFont(new Font("D2Coding", Font.PLAIN, 31));
		btnConfirm.setBounds(14, 194, 285, 44);
		frame.getContentPane().add(btnConfirm);
	}
}
