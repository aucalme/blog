package edu.java.swing11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class AppMain11 {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain11 window = new AppMain11();
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
	public AppMain11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "\uD578\uB4DC\uD3F0", "100000", "\uC804\uC790\uC81C\uD488", "10"},
				{"2", "\uBCFC\uD39C", "1000", "\uC7A1\uD654", "100"},
				{"3", "\uCD08\uCF5C\uB9BF", "2000", "\uC2DD\uB8CC\uD488", "50"},
			},
			new String[] {
				"\uC0C1\uD488 \uBC88\uD638", "\uC0C1\uD488 \uC774\uB984", "\uC0C1\uD488 \uAC00\uACA9", "\uCE74\uD14C\uACE0\uB9AC", "\uC7AC\uACE0 \uC218\uB7C9"
			}
		));
		scrollPane.setViewportView(table);
	}
}
