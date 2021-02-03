package GUI_App;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import team4_login_3.MemberDB;
import team4_login_3.MemberDTO;





public class SubPage extends JPanel{
	
	private MainFrame mf;
	private JPanel subPage;
	
	public SubPage(MainFrame mf) {
		this.mf = mf;
		this.subPage = this;
		
		JPanel panel2 = new JPanel();
		
		JLabel label = new JLabel("이름을 입력해주세요 ");
		label.setForeground(new Color(0, 0, 128));
		label.setFont(new Font("휴먼고딕", Font.PLAIN, 15));
		label.setBounds(45, 141, 180, 25);
		panel2.add(label);
		
		JTextField name = new JTextField();
		name.setForeground(new Color(0, 0, 128));
		name.setBounds(199, 139, 200, 25);
		panel2.add(name);
		
		
		
		JButton button = new JButton("확인");
		button.setBackground(new Color(0, 0, 128));
		button.setForeground(new Color(255, 255, 255));
		button.setBounds(179, 425, 65, 25);
		this.add(button);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<MemberDTO> al = new ArrayList<>();
				al = new MemberDB().checkMethod();	
				
				for(int j = 0; j < al.size(); j++) {
					
					
						if(al.get(j).getName().equals(name.getText())){
								JOptionPane.showMessageDialog(null,"회원중에 일치하는 이름이 있습니다.");
								changePanel.changePanel(mf, subPage, subPage); // new SubPage(mf)
								panel2.setVisible(false);
								name.setVisible(false);
								label.setVisible(false);
								button.setVisible(false);
								return;
						
					}else {
						JOptionPane.showMessageDialog(null,"회원중에 일치하는 이름이 없습니다.");
						return;
					}
				}	
				
				
				
			}
		});
		
		
		
		this.setSize(450,600);
		this.setBackground(Color.WHITE);
		
		mf.add(name);
		mf.add(label);
		mf.add(button);
		mf.add(subPage);
		mf.add(panel2);

		
		
		
		
	}
	
	

}
