package GUI_App;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame() {
		
		this.setBounds(150, 50, 1500, 700);
		
		new SubPage(this);
		new MainPage(this);
//		new Modifypassword1(true);
		
		
		
		
		
		
		
		
		
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	

}


