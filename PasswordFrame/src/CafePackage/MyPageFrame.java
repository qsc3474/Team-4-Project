package CafePackage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;


public class MyPageFrame extends JFrame{
	
	public MyPageFrame() {
		JFrame myPageFrame = new JFrame();
		JPanel myPagePanel = new JPanel(); 
	
		JLabel labelTitle = new JLabel("MY PAGE");
		JLabel labelId = new JLabel("아이디");
		JLabel labelPw = new JLabel("PWD");
		JLabel labelName = new JLabel("이름");
		JLabel labelBirth = new JLabel("생년월일");
		JLabel labelEmail = new JLabel("Email");
		JLabel labelPoint = new JLabel("적립금");
		
		JButton button1 = new JButton("확인");// 확인버튼
		JButton button2 = new JButton("회원탈퇴");// 탈퇴버튼
		JButton button3 = new JButton("수정");// 수정버튼
		
		JTextField userId = new JTextField(20); //아이디
		JPasswordField userPw = new JPasswordField(20); // 비밀번호
		JTextField userName = new JTextField(5); // 이름
		JTextField userBirth = new JTextField(8); // 생년월일
		JTextField userEmail = new JTextField(30); // 이메일
		JTextField userPoint = new JTextField(20); // 적립금
		
//		Font font = new Font("Aharoni 굵게", Font.BOLD, 15);
		
		myPagePanel.setLayout(null);
		myPagePanel.add(labelId);
		myPagePanel.add(labelPw);
		myPagePanel.add(labelName);
		myPagePanel.add(labelBirth);
		myPagePanel.add(labelEmail);
		myPagePanel.add(labelPoint);
		myPagePanel.add(button1);
		myPagePanel.add(button2);
		myPagePanel.add(button3);
		
		myPagePanel.add(userId);
		myPagePanel.add(userPw);
		myPagePanel.add(userName);
		myPagePanel.add(userBirth);
		myPagePanel.add(userEmail);
		myPagePanel.add(userPoint);
		

		labelId.setBounds(30, 100, 110, 25);
		labelPw.setBounds(30, 180, 110, 25);
		labelName.setBounds(30, 260, 110, 25);
		labelBirth.setBounds(30, 340, 110, 25);
		labelEmail.setBounds(30, 420, 110, 25);
		labelPoint.setBounds(30, 500, 110, 25);
		
		userId.setBounds(100, 100, 225, 35);
		userPw.setBounds(100, 180, 156, 35);
		userName.setBounds(100, 260, 225, 35);
		userBirth.setBounds(100, 340, 225, 35);
		userEmail.setBounds(100, 420, 225, 35);
		userPoint.setBounds(100, 500, 225, 35);
		button1.setBounds(88, 570, 80, 35);
		button2.setBounds(180, 570, 100, 35);
		button3.setBounds(252, 180, 70, 34);
		
		
		
	
		
	
		
		myPagePanel.add(labelTitle);
		labelTitle.setFont(new Font("맑은고딕", Font.BOLD, 16));
		labelTitle.setForeground(Color.black);
		
		myPageFrame.add(myPagePanel);
		myPageFrame.setVisible(true);
		myPageFrame.setTitle("CAFE");
		myPageFrame.setSize(375, 700); //사이즈
		myPageFrame.setResizable(false); //사이즈 고정
		myPageFrame.setLocationRelativeTo(null); //센터
		myPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기
		
		myPagePanel.add(labelTitle);
		myPagePanel.add(userId);
		myPagePanel.add(userPw);
		myPagePanel.add(userName);
		myPagePanel.add(userBirth);
		myPagePanel.add(userEmail);
		myPagePanel.add(userPoint);
	}
	
	public static void main(String[] args) {
		new MyPageFrame();				
	}
}
