package edu.java.swing05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain05 {
	
	// 이미지 파일들이 저장된 폴더와 파일 이름을 문자열 상수 (배열)로 정의
	private static final String[] IMAGES = {
		"images/image1.jpg",
		"images/image2.jpg",
		"images/image3.jpg",
		"images/image4.jpg",
		"images/image5.jpg",
	};
	
	//현재 application window에서 보여지는 이미지의 인덱스를 저장하는 변수.
	private int index;

	private JFrame frame;
	private JLabel labelImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain05 window = new AppMain05();
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
	public AppMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 583, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// JLabel(Icon image) 생성자
		// 다형성을 이용해서, Icon 타입 객체를 전달하는 곳에 ImageIcon 객체를 전달할 수 있음.
		// AppMain05 객체가 생성될 때, 멤버 변수 index는 기본값인 0으로 초기화됨.
		labelImage = new JLabel(new ImageIcon(IMAGES[index]));
		labelImage.setBounds(14, 12, 537, 233);
		frame.getContentPane().add(labelImage);
		
		JButton btnPrev = new JButton("<<이전");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showPrevImage();
			}

			private void showPrevImage() {
				// 현재 인덱스(index)가 0보다 크면
				if(index > 0) {
					index--; // 인덱스 감소
					labelImage.setIcon(new ImageIcon(IMAGES[index]));
				} else {
					JOptionPane.showMessageDialog(frame, "첫번째 이미지입니다.");
				}
				
			}
		});
		btnPrev.setFont(new Font("굴림", Font.PLAIN, 30));
		btnPrev.setBounds(14, 257, 250, 40);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("다음>>");
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showNextImage();
				
			}

			private void showNextImage() {
				// 현재 인덱스(index)가 배열의 마지막의 인덱스보다 작으면
				if(index < IMAGES.length - 1) {
					index++; // 인덱스 증가
					// 배열에서 증가된 인덱스로 파일 이름을 찾아서 이미지 아이콘을 설정
					labelImage.setIcon(new ImageIcon(IMAGES[index]));
				} else {
					JOptionPane.showMessageDialog(frame, "마지막 이미지입니다.");
				}
				
			}
		});
		btnNext.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNext.setBounds(301, 257, 250, 40);
		frame.getContentPane().add(btnNext);
	}

}
