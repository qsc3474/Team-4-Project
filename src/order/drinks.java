package order;

import java.util.Scanner;

public class drinks {

	public static void main(String [] args		) {
		
		
		// 사용자에게 출력할 문장
		System.out.println("주문하실 음료의 번호를 입력 해주세요.");
		System.out.println("-- 1. 아메리카노 --");
		System.out.println("-- 2. 라떼 --");
		System.out.println("-- 3. 더치커피 --");
		System.out.println("-- 4. 카페모카 --");
		System.out.println("-- 5. 모히또 --");
		System.out.println("-- 6. 오랜지 --");
		System.out.println("-- 7. 망고 --");
		System.out.println("-- 8. 스트로베리 --");
		
		
		// 주문된 음료의 수량
		int cupOfAmericano = 0;
		int cupOfLatte = 0;
		int cupOfDutchCoffee = 0;
		int cupOfCaffeMocha = 0;
		int cupOfmojito = 0;
		int cupOfOrange = 0;
		int cupOfMango = 0;
		int cupOfStrawberry = 0;
		
		
		// 음료의 가격
		int priceAmericano = 1000;
		int priceLatte = 1500;
		int priceDutchCoffee = 2000;
		int priceCaffeMocha = 2000;
		int priceMojito = 2500;
		int priceOrange = 2500;
		int priceMango = 2500;
		int priceStrawberry = 2500;
		
		Scanner scan = new Scanner (System.in);
	
		int entered = scan.nextInt();

		
		switch (entered) {
		// 1번을 입력 할 경우
		case 1:
			System.out.println("아메리카노 한 잔이 추가되었습니다.");
			cupOfAmericano =+ 1;
			break;
		
		// 2번을 입력 할 경우
		case 2:
			System.out.println("라떼 한 잔이 추가되었습니다.");
			cupOfLatte =+ 1;
			break;
			
		// 3번을 입력 할 경우	
		case 3:
			System.out.println("더치커피 한 잔이 추가되었습니다.");
			cupOfDutchCoffee =+ 1;
			break;
		
		// 4번을 입력 할 경우
		case 4:
			System.out.println("카페모카 한 잔이 추가되었습니다.");
			cupOfCaffeMocha =+ 1;

			break;
		
		// 5번을 입력 할 경우
		case 5:
			System.out.println("모히또 한 잔이 추가되었습니다.");
			cupOfmojito =+ 1;
			break;
		
		// 6번을 입력 할 경우
		case 6:
			System.out.println("오랜지 한 잔이 추가되었습니다.");

			cupOfOrange =+ 1;
			break;
		
		// 7번을 입력 할 경우
		case 7:
			System.out.println("망고 한 잔이 추가되었습니다.");
			cupOfMango =+1;
			break;
		
		// 8번을 입력 할 경우
		case 8:
			System.out.println("스트로베리 한 잔이 추가되었습니다.");

			cupOfStrawberry =+1;
			break;
			
		// 잘못된 값을 입력 할 경우
		default:
			System.out.println("잘못된 값을 입력하셨습니다.");
			break;
		}
		
		// 총 주문한 수량
		int totalNumberOfCups = 
				cupOfAmericano 
				+ cupOfLatte 
				+ cupOfDutchCoffee 
				+ cupOfCaffeMocha
				+ cupOfmojito
				+ cupOfOrange
				+ cupOfMango
				+ cupOfStrawberry;
		
		// 총 주문 수량을 알려줌.
		System.out.println("총 "+ totalNumberOfCups +" 잔을 주문 하셨습니다.");
		
		
//		int totalPrice =		 priceAmericano 
//		priceLatte 
//		 priceDutchCoffee 
//		priceCaffeMocha
//	 priceMojito
//		priceOrange
//		 priceMango 
//		priceStrawberry
		
		System.out.println("지불하실 금액은 ");
		
	}
	
}
