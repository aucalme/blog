package edu.java.jdbc06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class YamukjaSelect extends JFrame {

	private YamukjaDao dao;

	private JPanel contentPane;
	private JTextField textAdr;
	private DefaultTableModel model;
	private JTable table;

	/**
	 * Launch the application.
	 */

	private static final String[] COLUMN_NAMES = { "메뉴", "수량", "가격" };
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtTotalPrice;
	private int totalPrice;

	public static void showPayment(DefaultTableModel selectedModel) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YamukjaSelect frame = new YamukjaSelect(selectedModel);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @param selectedModel
	 */
	public YamukjaSelect(DefaultTableModel selectedModel) {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 603, 565);
		setTitle("Yamukja 장바구니");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAdr = new JLabel("주소");
		lblAdr.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblAdr.setBounds(14, 330, 75, 51);
		contentPane.add(lblAdr);

		textAdr = new JTextField();
		textAdr.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		textAdr.setColumns(10);
		textAdr.setBounds(64, 330, 507, 51);
		contentPane.add(textAdr);

		JLabel lblPay = new JLabel("결제수단");
		lblPay.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblPay.setBounds(14, 397, 97, 51);
		contentPane.add(lblPay);

		JButton btnPay = new JButton("결제");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "결제가 완료되었습니다.", "결제 성공", 1);
				System.exit(EXIT_ON_CLOSE);
			}
		});
		btnPay.setForeground(new Color(255, 20, 147));
		btnPay.setBackground(new Color(255, 182, 193));
		btnPay.setFont(new Font("휴먼편지체", Font.BOLD, 26));
		btnPay.setBounds(331, 451, 112, 51);
		contentPane.add(btnPay);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\minji\\Desktop\\Minji\\image\\yamukja4.jpg"));
		lblNewLabel.setBounds(0, 0, 585, 125);
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 245, 230));
		panel.setBounds(14, 126, 557, 51);
		contentPane.add(panel);

		JButton btnupdate = new JButton("수정");
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YamukjaUpdate.showUpdate();
			}
		});
		btnupdate.setForeground(new Color(255, 20, 147));
		btnupdate.setBackground(new Color(255, 228, 225));
		btnupdate.setFont(new Font("휴먼편지체", Font.PLAIN, 24));
		panel.add(btnupdate);

		JButton btndelete = new JButton("삭제");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteMenu();
			}
		});
		btndelete.setForeground(new Color(255, 20, 147));
		btndelete.setFont(new Font("휴먼편지체", Font.PLAIN, 24));
		btndelete.setBackground(new Color(255, 228, 225));
		panel.add(btndelete);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 189, 557, 87);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setBackground(new Color(255, 240, 245));
		table.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		model = new DefaultTableModel(null, COLUMN_NAMES);

		ArrayList<Yamukja> yamukja = new ArrayList<Yamukja>();
		String menu = "";
		int count = 0;
		int price = 0;
		
		int nrow = selectedModel.getRowCount();
		for (int i = 0; i < nrow; i++) {
			Object[] row = { selectedModel.getValueAt(i, 0), 1, selectedModel.getValueAt(i, 1) };
			model.addRow(row);
		}

		table.setModel(model);

		scrollPane.setViewportView(table);

		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 20));
		textField.setBounds(198, 405, 72, 39);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("-");
		lblNewLabel_1.setBounds(276, 405, 19, 39);
		contentPane.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(295, 403, 72, 39);
		contentPane.add(textField_1);

		JLabel lblNewLabel_1_1 = new JLabel("-");
		lblNewLabel_1_1.setBounds(373, 405, 19, 39);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("-");
		lblNewLabel_1_1_1.setBounds(469, 404, 19, 39);
		contentPane.add(lblNewLabel_1_1_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(391, 402, 72, 39);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(487, 403, 72, 39);
		contentPane.add(textField_3);

		JButton btnPay_1 = new JButton("취소");
		btnPay_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnPay_1.setForeground(new Color(255, 20, 147));
		btnPay_1.setFont(new Font("휴먼편지체", Font.BOLD, 26));
		btnPay_1.setBackground(new Color(255, 182, 193));
		btnPay_1.setBounds(458, 451, 112, 51);
		contentPane.add(btnPay_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(253, 245, 230));
		panel_1.setBounds(104, 405, 97, 101);
		contentPane.add(panel_1);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("카드");
		rdbtnNewRadioButton_1.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setSelected(true);
		panel_1.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("직접결제");
		rdbtnNewRadioButton.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		panel_1.add(rdbtnNewRadioButton);

		ButtonGroup groupRd = new ButtonGroup();
		groupRd.add(rdbtnNewRadioButton_1);
		groupRd.add(rdbtnNewRadioButton);
		
		JLabel lblTotalPrice = new JLabel("총액");
		lblTotalPrice.setFont(new Font("휴먼편지체", Font.PLAIN, 25));
		lblTotalPrice.setBounds(388, 276, 75, 51);
		contentPane.add(lblTotalPrice);
		lblTotalPrice.addMouseListener(new MouseAdapter() {
		 
		   public void mouseClicked(MouseEvent arg0) {
		      getTotalPrice();
		      txtTotalPrice.setText(String.valueOf(totalPrice));
		   }
		   
		});

		
		txtTotalPrice = new JTextField();
		txtTotalPrice.setBounds(435, 288, 136, 30);
		contentPane.add(txtTotalPrice);
		txtTotalPrice.setEditable(false);
		txtTotalPrice.setColumns(10);

	}

	private int getTotalPrice() {
		int rowsCount = model.getRowCount();
		for (int i = 0; i < rowsCount; i++) {
			totalPrice += Integer.parseInt(model.getValueAt(i, 2).toString());
		}
		return totalPrice;

	}

	private void deleteMenu() {
		int row = table.getSelectedRow();

		if (row == -1) {
			JOptionPane.showMessageDialog(table, "삭제할 행을 선택하세요.", "삭제 확인", JOptionPane.WARNING_MESSAGE);
			return;
		}
		try {
			int result = dao.delete(row);
			if (result == 1) {
				model.removeRow(row);
				JOptionPane.showMessageDialog(table, "메뉴가 삭제되었습니다.");
			}
		} catch (Exception e) {
			model.removeRow(row);
		}

	}
}
