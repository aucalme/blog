package edu.java.swing09;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain09 {
	
	// JComboBox의 아이템으로 사용하기 위한 문자열 배열을 정의
	private static final String[] ITEMS = {"Facebook", "Instagram", "Youtube"};

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rbPrivate;
	private JRadioButton rbPackage;
	private JRadioButton rbProtected;
	private JRadioButton rbPublic;
	private JCheckBox cbStatic;
	private JCheckBox cbFinal;
	private JCheckBox cbAbstract;
	private JComboBox<String> comboBox;
	private JButton btnConfirm;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain09 window = new AppMain09();
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
	public AppMain09() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 704, 437);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rbPrivate = new JRadioButton("private");
		rbPrivate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		rbPrivate.setFont(new Font("굴림", Font.PLAIN, 22));
		buttonGroup.add(rbPrivate);
		rbPrivate.setBounds(10, 8, 114, 57);
		frame.getContentPane().add(rbPrivate);
		
		rbPackage = new JRadioButton("package");
		rbPackage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		rbPackage.setFont(new Font("굴림", Font.PLAIN, 22));
		buttonGroup.add(rbPackage);
		rbPackage.setBounds(143, 8, 114, 57);
		frame.getContentPane().add(rbPackage);
		
		rbProtected = new JRadioButton("protected");
		rbProtected.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		rbProtected.setFont(new Font("굴림", Font.PLAIN, 22));
		buttonGroup.add(rbProtected);
		rbProtected.setBounds(273, 8, 127, 57);
		frame.getContentPane().add(rbProtected);
		
		rbPublic = new JRadioButton("public");
		rbPublic.setSelected(true);
		rbPublic.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		rbPublic.setFont(new Font("굴림", Font.PLAIN, 22));
		buttonGroup.add(rbPublic);
		rbPublic.setBounds(421, 8, 127, 57);
		frame.getContentPane().add(rbPublic);
		
		cbAbstract = new JCheckBox("abstract");
		cbAbstract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showCheckBoxStatus(e);
			}
		});
		cbAbstract.setFont(new Font("굴림", Font.PLAIN, 22));
		cbAbstract.setBounds(10, 85, 114, 47);
		frame.getContentPane().add(cbAbstract);
		
		cbStatic = new JCheckBox("static");
		cbStatic.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showCheckBoxStatus(e);
			}
		});
		cbStatic.setFont(new Font("굴림", Font.PLAIN, 22));
		cbStatic.setBounds(143, 85, 114, 47);
		frame.getContentPane().add(cbStatic);
		
		cbFinal = new JCheckBox("final");
		cbFinal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showCheckBoxStatus(e);
			}
		});
		cbFinal.setFont(new Font("굴림", Font.PLAIN, 22));
		cbFinal.setBounds(273, 85, 114, 47);
		frame.getContentPane().add(cbFinal);
		
		comboBox = new JComboBox<>();
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 익명 지역 내부 클래스 안에서는 바깥(외부) 클래스의 멤버들을 사용할 수 있음.
				Object selected = (String) comboBox.getSelectedItem();
				textArea.setText(selected + " 선택됨.");
				
			}
		});
		
		// ComboBoxModel: 콤보 박스에서 보여질 아이템들을 가지고 있는 객체
		DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>(ITEMS);
		// 콤보박스에 ComboBoxModel 객체를 설정 -> 선택할 수 있는 리스트(아이템)가 설정됨.
		comboBox.setModel(comboModel);
		
		comboBox.setFont(new Font("굴림", Font.PLAIN, 22));
		comboBox.setBounds(10, 159, 133, 37);
		frame.getContentPane().add(comboBox);
		
		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showInfo();
			}
		});
		btnConfirm.setFont(new Font("굴림", Font.PLAIN, 24));
		btnConfirm.setBounds(10, 208, 133, 47);
		frame.getContentPane().add(btnConfirm);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 27));
		textArea.setBounds(10, 267, 662, 110);
		frame.getContentPane().add(textArea);
	}

	private void showInfo() {
		StringBuffer buffer = new StringBuffer();
		
		// 라디오버튼들 중에서 선택된 상태
		if(rbPrivate.isSelected()) {
			buffer.append(rbPrivate.getText());
		} else if(rbPackage.isSelected()) {
			buffer.append(rbPackage.getText());
		} else if(rbProtected.isSelected()) {
			buffer.append(rbProtected.getText());
		} else if(rbPublic.isSelected()) {
			buffer.append(rbPublic.getText());
		}
		buffer.append(" 라디오 버튼 선택\n");
		
		// 체크박스 선택 상태
		if(cbAbstract.isSelected()) {
			buffer.append(cbAbstract.getText()).append(" 체크박스 선택.\n");
		}
		if(cbStatic.isSelected()) {
			buffer.append(cbStatic.getText()).append(" 체크박스 선택.\n");
		}
		if(cbFinal.isSelected()) {
			buffer.append(cbFinal.getText()).append(" 체크박스 선택.\n");
		}
		
		// 콤보박스 선택 상태
		String item = (String) comboBox.getSelectedItem();
		buffer.append(item).append(" 콤보박스 아이템 선택.");
		
		textArea.setText(buffer.toString());
				
	}

	private void showCheckBoxStatus(ActionEvent e) {
		String cmd = e.getActionCommand();
		// instanceof 연산자를 사용하면 더 안전하게 casting 할 수 있음.
		JCheckBox chkBox = (JCheckBox) e.getSource();
		boolean selected = chkBox.isSelected();
		
		textArea.setText(cmd + " 체크박스 선택여부: " + selected);
		
	}

	private void showRadioButtonStatus(ActionEvent e) {
		String cmd = e.getActionCommand();
//		Object source = e.getSource(); // 이벤트가 발생한 컴포넌트 객체
		textArea.setText(cmd + " 라디오버튼 선택됨"); 
		
	}
}
