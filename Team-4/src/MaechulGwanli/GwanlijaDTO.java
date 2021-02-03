package MaechulGwanli;

public class GwanlijaDTO {

	Menyujumun main = new Menyujumun();
	Gwanli gwanli =new Gwanli();
	DB db = new DB();
	
	public void jumun() {
		main.jumun(); //메뉴주문 
	}
	
	public void Gwanli() {
		gwanli.gwanliteibeul(); // 매출
	}
	
	public void DB() {
		db.DataIO(); 		
	}

}
