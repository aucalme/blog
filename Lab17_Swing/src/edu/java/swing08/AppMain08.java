package edu.java.swing08;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain08 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain08 window = new AppMain08();
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
	public AppMain08() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 293, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnMsgDlg = new JButton("Message Dialog");
		btnMsgDlg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(
						frame, // 다이얼로그가 실행될 부모 컴포넌트
						"안녕하세요...^^", // 다이얼로그에 표시될 메시지
						"Hello", // 다이얼로그의 타이틀(제목)
						JOptionPane.PLAIN_MESSAGE, // 메시지 타입
						null); // 아이콘
			}
		});
		btnMsgDlg.setFont(new Font("굴림", Font.PLAIN, 23));
		btnMsgDlg.setBounds(14, 12, 247, 52);
		frame.getContentPane().add(btnMsgDlg);
		
		JButton btnConfirmDlg = new JButton("Confirm Dialog");
		btnConfirmDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(
						frame, // 다이얼로그가 실행될 부모 컴포넌트
						"정말 삭제할까요?", // 확인 다이얼로그의 메시지 
						"확인", // 제목표시줄의 타이틀
						JOptionPane.YES_NO_CANCEL_OPTION, // 확인 옵션(YES, NO, CANCEL, ...)
						JOptionPane.QUESTION_MESSAGE, // 메시지 종류
						null); // 아이콘
				System.out.println("confirm = " + confirm);
			}
		});
		btnConfirmDlg.setFont(new Font("굴림", Font.PLAIN, 23));
		btnConfirmDlg.setBounds(14, 76, 247, 52);
		frame.getContentPane().add(btnConfirmDlg);
		
		JButton btnOptionDlg = new JButton("Option Dialog");
		btnOptionDlg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] options = {"응", "아니","쉬워요"};
				int option = JOptionPane.showOptionDialog(
						frame, // 다이얼로그가 실행될 부모 컴포넌트 
						"Swing 재미있나요...?", //다이얼로그의 메시지
						"확인", // 다이얼로그의 제목표시줄의 타이틀  
						JOptionPane.YES_NO_CANCEL_OPTION, // 선택할 옵션의 종류
						JOptionPane.QUESTION_MESSAGE, // 메시지 타입
						null, //아이콘
						options, // 옵션버튼에서 사용할 문자열
						options[1]); // 다이얼로그가 실행됐을 때 포커스를 받고 있는 버튼
				System.out.println("option=" + option);
				
			}
		});
		btnOptionDlg.setFont(new Font("굴림", Font.PLAIN, 23));
		btnOptionDlg.setBounds(14, 140, 247, 52);
		frame.getContentPane().add(btnOptionDlg);
		
		JButton btnInputDlg = new JButton("Input Dialog");
		btnInputDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// showinputDialog(parentComponent, message)
//				String input = JOptionPane.showInputDialog(frame, "이름은?");
				
				// showinputDialog(parentComponent, message, initialSelectionValue)
				String input = JOptionPane.showInputDialog(frame, "나이는?", 0);
				System.out.println("input=" + input);
				
				String[] values = {"10대", "20대", "30대"};
				Object intput = JOptionPane.showInputDialog(
						frame,
						"나이는?",
						"입력", // title
						JOptionPane.QUESTION_MESSAGE, // messageType
						null, // icon
						values, // selectionValues
						values[1]); //initialSelectionValue
						
			}
		});
		btnInputDlg.setFont(new Font("굴림", Font.PLAIN, 23));
		btnInputDlg.setBounds(14, 202, 247, 52);
		frame.getContentPane().add(btnInputDlg);
		
		JButton btnCustomDlg = new JButton("Custom Dialog");
		btnCustomDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyDialog.showMyDialog();
			}
		});
		btnCustomDlg.setFont(new Font("굴림", Font.PLAIN, 23));
		btnCustomDlg.setBounds(14, 266, 247, 52);
		frame.getContentPane().add(btnCustomDlg);
		
		JButton btnCustomFrame = new JButton("Custom Frame");
		btnCustomFrame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyFrame.showMyFrame();
			}
		});
		btnCustomFrame.setFont(new Font("굴림", Font.PLAIN, 23));
		btnCustomFrame.setBounds(14, 330, 247, 52);
		frame.getContentPane().add(btnCustomFrame);
	}
}
