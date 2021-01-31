package dd;

import java.util.Scanner;

public class orderMenu {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

	// 주문메뉴
	// 홈화면에서 로그인을 하면 처음으로 접하는 화면

	/* 메뉴는 총 8가지로
	 * 1. 아메리카노
	 * 2. 라떼
	 * 3. 더치커피
	 * 4. 카페모카
	 * 5. 모히또
	 * 6. 오렌지
	 * 7. 망고
	 * 8. 딸기
	 * 
	 * 가 있다.
	 * 
	 * 
	 * 
	 * 여기에서 옵션의 경우의 수는 다시 3가지로
	 * 1. HOT / ICED
	 * 2. SIZE (SMALL, MEDIUM, LARGE)
	 * 3. 샷추가 Y/N
	 * 
	 * 이 존재한다.
	 */
	
	
	
	// 주문 화면
	System.out.println("주문 화면 입니다.");
	
	// MyPage로 이동을 원할 경우 이동
	boolean movePage = false;
	if (movePage == true) {
	}
	
	// 음료 총 8가지 종류를 int 값으로 선언
	
	System.out.println("음료 선택 화면입니다.");
	
//	int americano = 0;
//	int latte = 0;
//	int dutchCoffee = 0;
//	int caffeMocha = 0;
//	int mojito = 0;
//	int orange = 0;
//	int mango = 0;
//	int strawberry = 0;
	
	
	// 온도, 사이즈, 샷을 불러오는 동작 실행!!

	
	// 주문이 완료된 상황
	System.out.println("주문이 완료 되었습니다.");
		
	}
	
	public void temperature () {
	
		// HOT / ICED 종류 int 값으로 받음. 1이상 뜨거움, -1이하 차가움, 기본값 0
		System.out.println("온도 선택 입니다.");
		int temperature = sc.nextInt();
			if (temperature == 0) {
				System.out.println("(에러메세지) 음료의 온도를 선택하세요");
				temperature();
			}
			if (temperature >= 1) {
				System.out.println("HOT 음료입니다.");
			}
			if (temperature <= -1) {
				System.out.println("ICED 음료입니다.");
			}
		
	}
	public void size () {
	
		// 3가지의 SIZE를 int 값으로 받음. (1 = Small, 2 = Medium, 3 = Large)
		System.out.println("사이즈 선택입니다.");
		int size = sc.nextInt();
			if (size == 1) {
				System.out.println("S 사이즈 입니다.");
			}
			if (size == 2) {
				System.out.println("M 사이즈 입니다.");
			}
			if (size == 3) {
				System.out.println("L 사이즈 입니다,");
			}
			if (size == 0)
			{
				System.out.println("사이즈를 선택하세요");
				size();
			}
	}
	
	public void shot () {
	
		// 샷추가 Y / N 을 int 값으로 받음. 1이상 YES, -1이하 NO, 기본값 0.
		System.out.println("샷 추가 선택입니다.");
		int shot = sc.nextInt();
		
			if (shot >= 1) {
				System.out.println("샷 추가 YES 하셨습니다");
			}
			if (shot <= -1) {
				System.out.println("샷 추가 NO 하셨습니다.");
			} 
			if (shot == 0 ) {
				System.out.println("(에러메세지) 샷을 추가 하시겠습니까?");
				shot();
			}
	}
}
	
	
