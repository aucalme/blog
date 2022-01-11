package edu.java.swing12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain12 {

	// 테이블의 컬럼 이름을 상수
	private static final String[] COLUMN_NAMES = { "국어", "영어", "수학", "총점", "평균" };

	private JFrame frame;
	private JTextField textKorean;
	private JTextField textEnglish;
	private JTextField textMath;
	private JTable table;
	private JButton btnInput;
	private JButton btnDelete;
	private JScrollPane scrollPane;
	private JLabel labelKorean;
	private JLabel labelEnglish;
	private JLabel labelMath;
	private DefaultTableModel tableModel; // 테이블의 데이터(행row, 열column, 셀cell)를 관리(추가, 삭제)

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain12 window = new AppMain12();
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
	public AppMain12() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 412, 554);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		labelKorean = new JLabel("국어");
		labelKorean.setFont(new Font("굴림", Font.PLAIN, 25));
		labelKorean.setBounds(14, 12, 102, 58);
		frame.getContentPane().add(labelKorean);

		textKorean = new JTextField();
		textKorean.setFont(new Font("굴림", Font.PLAIN, 25));
		textKorean.setBounds(130, 12, 250, 58);
		frame.getContentPane().add(textKorean);
		textKorean.setColumns(10);

		labelEnglish = new JLabel("영어");
		labelEnglish.setFont(new Font("굴림", Font.PLAIN, 25));
		labelEnglish.setBounds(14, 82, 102, 58);
		frame.getContentPane().add(labelEnglish);

		textEnglish = new JTextField();
		textEnglish.setFont(new Font("굴림", Font.PLAIN, 25));
		textEnglish.setColumns(10);
		textEnglish.setBounds(130, 82, 250, 58);
		frame.getContentPane().add(textEnglish);

		labelMath = new JLabel("수학");
		labelMath.setFont(new Font("굴림", Font.PLAIN, 25));
		labelMath.setBounds(14, 152, 102, 58);
		frame.getContentPane().add(labelMath);

		textMath = new JTextField();
		textMath.setFont(new Font("굴림", Font.PLAIN, 25));
		textMath.setColumns(10);
		textMath.setBounds(130, 152, 250, 58);
		frame.getContentPane().add(textMath);

		btnInput = new JButton("점수 입력");
		btnInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				inputScore();
			}
		});
		btnInput.setFont(new Font("굴림", Font.PLAIN, 24));
		btnInput.setBounds(11, 222, 155, 42);
		frame.getContentPane().add(btnInput);

		btnDelete = new JButton("행 삭제");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteRowFromTable();
			}
		});
		btnDelete.setFont(new Font("굴림", Font.PLAIN, 24));
		btnDelete.setBounds(180, 222, 155, 42);
		frame.getContentPane().add(btnDelete);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 276, 366, 219);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		// 테이블에 테이블 모델을 설정
		tableModel = new DefaultTableModel(null, COLUMN_NAMES);
		table.setModel(tableModel);
		scrollPane.setViewportView(table);
	}

	private void deleteRowFromTable() {
		// 테이블에서 선택된 행(row)의 인덱스를 찾음
		int index = table.getSelectedRow();
		if(index == -1) { // 테이블에서 선택된 행이 없으면
			JOptionPane.showMessageDialog(frame, "테이블에서 삭제할 행을 먼저 선택하세요.");
			return;
		}
		
		// 삭제할 것인 지 확인
		int confirm = JOptionPane.showConfirmDialog(frame, "정말 삭제할까요?", "삭제 확인", JOptionPane.YES_NO_OPTION);
		// 사용자가 Yes를 선택했을 때만 행을 삭제
		if(confirm == JOptionPane.YES_OPTION) {
			tableModel.removeRow(index);
		}
	}

	private void inputScore() {
		// 국어, 영어, 수학 점수를 읽음(문자열 -> 정수 변환).
		int korean = 0;
		int english = 0;
		int math = 0;

		try {
			korean = Integer.parseInt(textKorean.getText());
			english = Integer.parseInt(textEnglish.getText());
			math = Integer.parseInt(textMath.getText());
		} catch (NumberFormatException e) {
			String message = e.getMessage() + "\n입력한 내용은 정수가 아닙니다.";
			JOptionPane.showMessageDialog(frame, message, "입력오류", JOptionPane.ERROR_MESSAGE);
			return; // 메서드 종료
		} finally {
			// 모든 텍스트 필드의 값들을 지움
			clearAllTextFields();
		}
		// Score 객체 생성 -> 총점, 평균 기능 사용 가능
		Score score = new Score(korean, english, math);

		// 테이블의 행에 추가할 데이터를 1차원 배열로 생성
		Object[] rowData = { score.getKorean(), score.getEnglish(), score.getMath(), score.total(), score.average() };
		// 테이블 모델에 행(row)를 추가
		tableModel.addRow(rowData);
		

	}

	private void clearAllTextFields() {
		textKorean.setText("");
		textEnglish.setText("");
		textMath.setText("");

	}
}
