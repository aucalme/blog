package edu.java.jdbc06;

import static edu.java.jdbc06.YamukjaDao.*;
import static edu.java.jdbc.ojdbc.OracleJdbc.PASSWORD;
import static edu.java.jdbc.ojdbc.OracleJdbc.URL;
import static edu.java.jdbc.ojdbc.OracleJdbc.USER;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import oracle.jdbc.driver.OracleDriver;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class YamukjaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	private static final String[] COLUMN_NAMES = { "메뉴", "가격" };

	public static void showMenuFrame() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YamukjaMenu frame = new YamukjaMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	private JTable table;
	private DefaultTableModel model;

	public YamukjaMenu() {
		
		try {
			DriverManager.registerDriver(new OracleDriver());
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 646, 644);
		setTitle("Yamukja Menu");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblicon1 = new JLabel("New label");
		lblicon1.setIcon(new ImageIcon("C:\\Users\\minji\\Desktop\\Minji\\image\\yamukja2.jpg"));
		lblicon1.setBounds(0, 0, 569, 105);
		contentPane.add(lblicon1);
		
		JLabel lblkf = new JLabel("한식");
		lblkf.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblkf.setBounds(14, 107, 102, 49);
		contentPane.add(lblkf);
		
		JComboBox cbkf = new JComboBox();
		cbkf.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				try {
					
					
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
					
					String Select = "select " + COL_PRICE +", " + COL_MENU + " from MENUPRICE where " + COL_MENU + " = ? ";
					stmt = conn.prepareStatement(Select);
					stmt.setString(1, cbkf.getSelectedItem().toString());
					
					rs = stmt.executeQuery();
					
					while (rs.next()) { 
						String menu = rs.getString(COL_MENU);
						int price = rs.getInt(COL_PRICE);
						
						Object data[] = {menu,price};
						model.addRow(data);
			
					}
					
				} catch (SQLException ex) {
					ex.printStackTrace();
				} finally {
					try {
						rs.close(); 
						stmt.close();
						conn.close();
					} catch (SQLException ex) {
						ex.printStackTrace();
					}
				}
				
			}
			
		});
		cbkf.setForeground(new Color(255, 20, 147));
		cbkf.setBackground(new Color(255, 228, 225));
		cbkf.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		cbkf.setModel(new DefaultComboBoxModel(new String[] {"선택안함", "돼지국밥", "김치찌개", "닭볶음탕", "찜닭", "쭈꾸미", "생선조림", "닭갈비", "게장", "삼겹살", "제육볶음", "김치찜", "죽", "감자탕", "육회", "아구찜"}));
		cbkf.setBounds(120, 107, 162, 49);
		contentPane.add(cbkf);
		
		JLabel lblsn = new JLabel("분식");
		lblsn.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblsn.setBounds(14, 168, 102, 49);
		contentPane.add(lblsn);
		
		JComboBox cbsn = new JComboBox();
		cbsn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
					
					String Select = "select " + COL_PRICE +", " + COL_MENU + " from MENUPRICE where " + COL_MENU + " = ? ";
					stmt = conn.prepareStatement(Select);
					stmt.setString(1, cbsn.getSelectedItem().toString());
					
					rs = stmt.executeQuery();
					
					while (rs.next()) { 
						String menu = rs.getString(COL_MENU);
						int price = rs.getInt(COL_PRICE);
						
						Object data[] = {menu,price};
						model.addRow(data);
			
					}
					
				} catch (SQLException ex) {
					ex.printStackTrace();
				} finally {
					try {
						rs.close(); 
						stmt.close();
						conn.close();
					} catch (SQLException ex) {
						ex.printStackTrace();
					}
				}
				
			}
			
		});
	
	
		cbsn.setForeground(new Color(255, 20, 147));
		cbsn.setBackground(new Color(255, 228, 225));
		cbsn.setModel(new DefaultComboBoxModel(new String[] {"선택안함", "떡볶이", "순대", "핫도그", "만두", "튀김", "밥버거", "김밥"}));
		cbsn.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		cbsn.setBounds(120, 168, 162, 49);
		contentPane.add(cbsn);
		
		JComboBox cbcf = new JComboBox();
		cbcf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
					
					String Select = "select " + COL_PRICE +", " + COL_MENU + " from MENUPRICE where " + COL_MENU + " = ? ";
					stmt = conn.prepareStatement(Select);
					stmt.setString(1, cbcf.getSelectedItem().toString());
					
					rs = stmt.executeQuery();
					
					while (rs.next()) { 
						String menu = rs.getString(COL_MENU);
						int price = rs.getInt(COL_PRICE);
						
						Object data[] = {menu,price};
						model.addRow(data);
			
					}
					
				} catch (SQLException ex) {
					ex.printStackTrace();
				} finally {
					try {
						rs.close(); 
						stmt.close();
						conn.close();
					} catch (SQLException ex) {
						ex.printStackTrace();
					}
				}
				
			}
			
		});
		cbcf.setForeground(new Color(255, 20, 147));
		cbcf.setBackground(new Color(255, 228, 225));
		cbcf.setModel(new DefaultComboBoxModel(new String[] {"선택안함", "짜장면", "짬뽕", "꿔바로우", "멘보샤", "마라탕", "마라샹궈", "양꼬치"}));
		cbcf.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		cbcf.setBounds(120, 229, 162, 49);
		contentPane.add(cbcf);
		
		JLabel lblcf = new JLabel("중식");
		lblcf.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblcf.setBounds(14, 229, 102, 49);
		contentPane.add(lblcf);
		
		JLabel lblwf = new JLabel("양식");
		lblwf.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblwf.setBounds(14, 290, 102, 49);
		contentPane.add(lblwf);
		
		JComboBox cbwf = new JComboBox();
		cbwf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
					
					String Select = "select " + COL_PRICE +", " + COL_MENU + " from MENUPRICE where " + COL_MENU + " = ? ";
					stmt = conn.prepareStatement(Select);
					stmt.setString(1, cbwf.getSelectedItem().toString());
					
					rs = stmt.executeQuery();
					
					while (rs.next()) { 
						String menu = rs.getString(COL_MENU);
						int price = rs.getInt(COL_PRICE);
						
						Object data[] = {menu,price};
						model.addRow(data);
			
					}
					
				} catch (SQLException ex) {
					ex.printStackTrace();
				} finally {
					try {
						rs.close(); 
						stmt.close();
						conn.close();
					} catch (SQLException ex) {
						ex.printStackTrace();
					}
				}
				
			}
			
		});
		cbwf.setBackground(new Color(255, 228, 225));
		cbwf.setForeground(new Color(255, 20, 147));
		cbwf.setModel(new DefaultComboBoxModel(new String[] {"선택안함", "파스타", "스테이크", "샐러드", "그릭요거트", "포케"}));
		cbwf.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		cbwf.setBounds(120, 290, 162, 49);
		contentPane.add(cbwf);
		
		JLabel lblaf = new JLabel("아시안");
		lblaf.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblaf.setBounds(14, 351, 102, 49);
		contentPane.add(lblaf);
		
		JComboBox cbaf = new JComboBox();
		cbaf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
					
					String Select = "select " + COL_PRICE +", " + COL_MENU + " from MENUPRICE where " + COL_MENU + " = ? ";
					stmt = conn.prepareStatement(Select);
					stmt.setString(1, cbaf.getSelectedItem().toString());
					
					rs = stmt.executeQuery();
					
					while (rs.next()) { 
						String menu = rs.getString(COL_MENU);
						int price = rs.getInt(COL_PRICE);
						
						Object data[] = {menu,price};
						model.addRow(data);
			
					}
					
				} catch (SQLException ex) {
					ex.printStackTrace();
				} finally {
					try {
						rs.close(); 
						stmt.close();
						conn.close();
					} catch (SQLException ex) {
						ex.printStackTrace();
					}
				}
				
			}
			
		});
		cbaf.setForeground(new Color(255, 20, 147));
		cbaf.setBackground(new Color(255, 228, 225));
		cbaf.setModel(new DefaultComboBoxModel(new String[] {"선택안함", "쌀국수", "푸팟퐁커리", "팟타이", "초밥", "카레", "회"}));
		cbaf.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		cbaf.setBounds(120, 351, 162, 49);
		contentPane.add(cbaf);
		
		JComboBox cbff = new JComboBox();
		cbff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
					
					String Select = "select " + COL_PRICE +", " + COL_MENU + " from MENUPRICE where " + COL_MENU + " = ? ";
					stmt = conn.prepareStatement(Select);
					stmt.setString(1, cbff.getSelectedItem().toString());
					
					rs = stmt.executeQuery();
					
					while (rs.next()) { 
						String menu = rs.getString(COL_MENU);
						int price = rs.getInt(COL_PRICE);
						
						Object data[] = {menu,price};
						model.addRow(data);
			
					}
					
				} catch (SQLException ex) {
					ex.printStackTrace();
				} finally {
					try {
						rs.close(); 
						stmt.close();
						conn.close();
					} catch (SQLException ex) {
						ex.printStackTrace();
					}
				}
				
			}
			
		});
		cbff.setForeground(new Color(255, 20, 147));
		cbff.setBackground(new Color(255, 228, 225));
		cbff.setModel(new DefaultComboBoxModel(new String[] {"선택안함", "햄버거", "피자", "치킨", "토스트", "타코야끼"}));
		cbff.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		cbff.setBounds(120, 413, 162, 49);
		contentPane.add(cbff);
		
		JLabel lblff = new JLabel("패스트푸드");
		lblff.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblff.setBounds(14, 413, 102, 49);
		contentPane.add(lblff);
		
		JLabel lbllf = new JLabel("야식");
		lbllf.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lbllf.setBounds(14, 474, 102, 49);
		contentPane.add(lbllf);
		
		JComboBox cmlf = new JComboBox();
		cmlf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
					
					String Select = "select " + COL_PRICE +", " + COL_MENU + " from MENUPRICE where " + COL_MENU + " = ? ";
					stmt = conn.prepareStatement(Select);
					stmt.setString(1, cmlf.getSelectedItem().toString());
					
					rs = stmt.executeQuery();
					
					while (rs.next()) { 
						String menu = rs.getString(COL_MENU);
						int price = rs.getInt(COL_PRICE);
						
						Object data[] = {menu,price};
						model.addRow(data);
			
					}
					
				} catch (SQLException ex) {
					ex.printStackTrace();
				} finally {
					try {
						rs.close(); 
						stmt.close();
						conn.close();
					} catch (SQLException ex) {
						ex.printStackTrace();
					}
				}
				
			}
			
		});
		cmlf.setForeground(new Color(255, 20, 147));
		cmlf.setBackground(new Color(255, 228, 225));
		cmlf.setModel(new DefaultComboBoxModel(new String[] {"선택안함", "닭발", "족발", "보쌈", "오돌뼈", "곱창", "먹태", "낙곱새", "김피탕"}));
		cmlf.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		cmlf.setBounds(120, 474, 162, 49);
		contentPane.add(cmlf);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(296, 107, 318, 324);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 228, 225));
		model = new DefaultTableModel(null, COLUMN_NAMES);
		table.setModel(model);
		table.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("장바구니 담기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.getRowCount();
				if(table.getRowCount() == 0) {
					JOptionPane.showMessageDialog(table, "장바구니에 메뉴를 담아주세요.", "장바구니 담기 실패", JOptionPane.WARNING_MESSAGE);
				}else {
				JOptionPane.showMessageDialog(scrollPane, "장바구니에 담겼습니다.", "장바구니 담기 성공", 1);
				YamukjaSelect.showPayment(model);
				}
				
			}
		});
		btnNewButton.setForeground(new Color(255, 20, 147));
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setFont(new Font("휴먼편지체", Font.BOLD, 25));
		btnNewButton.setBounds(296, 444, 189, 59);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(255, 20, 147));
		btnNewButton_1.setBackground(new Color(255, 182, 193));
		btnNewButton_1.setFont(new Font("휴먼편지체", Font.BOLD, 25));
		btnNewButton_1.setBounds(499, 443, 105, 57);
		contentPane.add(btnNewButton_1);
	
	
	}


}
