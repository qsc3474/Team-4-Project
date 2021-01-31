package GUI_App;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import MemberInformationModification.Mypage;

public class Modifypassword1 extends JPanel{

	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private MainFrame mf;
	private JPanel modifypassword1;
	
	
	private void initialize(MainFrame mf) {
	
//		this.setTitle("커피한잔의 여유");
//		this.setBounds(100, 100, 450, 600);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.getContentPane().setLayout(null);
		
		this.mf = mf;
		this.modifypassword1 = this;
		
		mf.add(modifypassword1);
		this.setBackground(new Color(255, 255, 255));
		this.setForeground(new Color(255, 255, 255));
		this.setBounds(0, 0, 434, 562);
//		this.getContentPane().add(panel);
		this.setVisible(true);
		this.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 434, 40);
		this.add(panel1);
		panel1.setBackground(new Color(0, 0, 128));
		panel1.setForeground(new Color(0, 0, 128));
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("pwd 수정");
		lblNewLabel.setBounds(163, 5, 89, 24);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel1.add(lblNewLabel);
		
		JButton goback = new JButton("");
//		goback.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Mypage mypage = new Mypage();
//				
//				
//				
//			}
//
//			
//		});
		goback.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\2.PNG"));
		goback.setBounds(12, 0, 38, 38);
		panel1.add(goback);
		
		JLabel pwd1 = new JLabel("기존비밀번호");
		pwd1.setForeground(new Color(0, 0, 128));
		pwd1.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		pwd1.setBounds(45, 141, 127, 25);
		this.add(pwd1);
		
		JLabel pwd1_1 = new JLabel("새로운비밀번호");
		pwd1_1.setForeground(new Color(0, 0, 128));
		pwd1_1.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		pwd1_1.setBounds(45, 224, 127, 25);
		this.add(pwd1_1);
		
		JLabel pwd1_2 = new JLabel("새로운비밀번호학인");
		pwd1_2.setForeground(new Color(0, 0, 128));
		pwd1_2.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		pwd1_2.setBounds(38, 310, 149, 25);
		this.add(pwd1_2);
		
		JPasswordField pwdfild1 = new JPasswordField();
		pwdfild1.setForeground(new Color(0, 0, 128));
		pwdfild1.setBounds(199, 139, 200, 25);
		this.add(pwdfild1);
		
		JPasswordField  pwdfild2 = new JPasswordField();
		pwdfild2.setForeground(new Color(0, 0, 128));
		pwdfild2.setBounds(199, 223, 200, 25);
		this.add(pwdfild2);
		
		JPasswordField pwdfild3 = new JPasswordField();
		pwdfild3.setForeground(new Color(0, 0, 128));
		pwdfild3.setBounds(199, 309, 200, 25);
		this.add(pwdfild3);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Mypage mypage = new Mypage();
//				mypage.setVisible(true);
//				mypage.main(null);
//				frame.dispose();
				
				String pwd = "1234";
				String pwd2 = "12345";
				String pwd3 = "12345";
				if(pwd.equals(pwdfild1.getText())) {
					
				}else {
					JOptionPane.showMessageDialog(null, "기존비밀번호가 아닙니다. 다시 입력해주세요.");
					return;
				}
					
					if(pwd3.equals(pwdfild3.getText())) {
						JOptionPane.showMessageDialog(null,"비밀번호를 성공적으로 변경되었습니다.");
						JOptionPane.showMessageDialog(null,"회원정보수정으로 돌아갑니다.");
					}
					if(!pwd2.equals(pwdfild3.getText())){
						JOptionPane.showMessageDialog(null,"비밀번호의 값이 다릅니다. 다시 입력해주세요.");
						
					}

			}
		}); 
		
		
		try {
			this.setIconImage(ImageIO.read(new File("images/cff.PNG")));
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(179, 425, 65, 25);
		this.add(btnNewButton);
}

	private void setIconImage(BufferedImage read) {
		// TODO Auto-generated method stub
		
	}

	public void Modifypassword1() {
		
		
	}

	
}
