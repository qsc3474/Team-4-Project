package order;

public class Application_taewoo {

	public static void main(String[] args) {
		
		orderMenu orderMenu = new orderMenu();
		drinks drinks = new drinks();
		
		drinks.main(null);
		orderMenu.main(null);
		
		
		
		orderMenu.temperature();
		orderMenu.size();
		orderMenu.shot();
		
		
		
	}
}
