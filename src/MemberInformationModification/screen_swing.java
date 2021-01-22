package MemberInformationModification;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ActionMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class screen_swing extends JFrame{
	

	public screen_swing() {
		Modified mm = new Modified();

		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel labe4 = new JLabel("비밀번호 수정 ");
		labe4.setBounds(145, 15, 110, 25);
		panel.add(labe4);
		
		JLabel label = new JLabel("기존비밀번호       : ");
		label.setBounds(50, 60, 110, 25);
		panel.add(label);
		
		JPasswordField pwdText = new JPasswordField(20);
		pwdText.setBounds(180, 60, 165, 25);
		panel.add(pwdText);
		
		JLabel label2 = new JLabel("새로운 비밀번호  : ");
		label2.setBounds(50, 100, 110, 25);
		panel.add(label2);
		
		JPasswordField pwdText2 = new JPasswordField(20);
		pwdText2.setBounds(180, 100, 165, 25);
		panel.add(pwdText2);
		
		
		JLabel label3 = new JLabel("새로운 비밀번호  : ");
		label3.setBounds(50, 140, 120, 25);
		panel.add(label3);
		
		JPasswordField pwdText3 = new JPasswordField(20);
		pwdText3.setBounds(180, 140, 165, 25);
		panel.add(pwdText3);
		
		
		JButton button = new JButton("확인");// 확인버튼
		button.setBounds(150, 190, 80, 25);
		panel.add(button);
		


		
		
	

		
		
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String label = "1234";
				String label2 = "12345";
				String label3 = "12345";

				
				if(label.equals(pwdText.getText())) {
					
				}else {
					JOptionPane.showMessageDialog(null, "기존비밀번호가 아닙니다.");
				}
				if(label2.equals(pwdText2.getText())) {
					
				}
				if(label3.equals(pwdText3.getText())) {
					JOptionPane.showMessageDialog(null, "비밀번호가 수정되었습니다.");
				}
				
				
			}
		});
		add(panel);
		
		
		setVisible(true);//창보이게
		setSize(400,280);//사이즈
		setLocationRelativeTo(null);//가운데서 뜬다
		setResizable(false);//사이즈 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new screen_swing();
	}

}
