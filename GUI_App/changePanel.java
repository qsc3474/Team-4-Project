package GUI_App;

import javax.swing.JPanel;

public class changePanel {

	public static void changePanel(MainFrame mf, JPanel op, JPanel np) {
		mf.remove(np);		//remove(리무브)  패널 넘겨받는 
		mf.add(op);
		
	
		mf.repaint(); 		//repaint리페이지
	}
}
