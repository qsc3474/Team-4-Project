package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class orderMenuScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderMenuScreen window = new orderMenuScreen();
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
	public orderMenuScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 595, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("추가");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(66, 41, 79, 87);
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("S");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setBounds(201, 359, 33, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("M");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setBounds(239, 359, 46, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("L");
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_2.setBounds(281, 359, 46, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		Button button = new Button("My Page");
		button.setBounds(342, 10, 76, 23);
		frame.getContentPane().add(button);
		
		JButton btnNewButton_1 = new JButton("추가");
		btnNewButton_1.setBounds(157, 41, 79, 87);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("추가");
		btnNewButton_1_1.setBounds(339, 41, 79, 87);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("추가");
		btnNewButton_2.setBounds(248, 41, 79, 87);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1_1 = new JButton("추가");
		btnNewButton_1_1_1.setBounds(339, 177, 79, 87);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1 = new JButton("추가");
		btnNewButton_2_1.setBounds(248, 177, 79, 87);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_1_2 = new JButton("추가");
		btnNewButton_1_2.setBounds(157, 177, 79, 87);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_3 = new JButton("추가");
		btnNewButton_3.setBounds(66, 177, 79, 87);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("아메리카노");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(76, 138, 69, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("라떼");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(167, 138, 69, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("더치커피");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(251, 138, 69, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("카페모카");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(342, 138, 69, 29);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("모히또");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(76, 275, 69, 29);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("오랜지");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(157, 274, 69, 29);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("망고");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(251, 274, 69, 29);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("딸기");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(342, 275, 69, 29);
		frame.getContentPane().add(lblNewLabel_7);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("HOT");
		rdbtnNewRadioButton_3.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_3.setBounds(33, 359, 51, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("ICED");
		rdbtnNewRadioButton_4.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_4.setBounds(88, 359, 53, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JLabel lblNewLabel_8 = new JLabel("온도");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(42, 330, 76, 23);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("사이즈");
		lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_8_1.setBounds(222, 330, 76, 23);
		frame.getContentPane().add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("샷추가");
		lblNewLabel_8_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_8_2.setBounds(369, 330, 76, 23);
		frame.getContentPane().add(lblNewLabel_8_2);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("YES");
		rdbtnNewRadioButton_5.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_5.setBounds(354, 359, 57, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_5_1 = new JRadioButton("NO");
		rdbtnNewRadioButton_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_5_1.setBounds(415, 359, 57, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5_1);
	}
}
