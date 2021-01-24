package MaechulGwanli;

import java.util.Scanner;

public class Menyujumun {

	public static int sum;





	public void jumun() {
		Scanner sc =new Scanner(System.in);

		
		System.out.println("*********** 메뉴주문 ***********");
		System.out.println("1번 아메리카노, 2번 카페라뗴, 3번 카페모카, 4번 더치커피, "+ "5번 모히또, 6번 오렌지, 7번 망고, 8번 딸기, 9번 결정");
		
	
		
		if(true) {
			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			System.out.print("수량 : ");
			int Quantity = sc.nextInt();
	
			System.out.println();
			sc.nextLine();	
			
			int Americano = 3000; 
			int latte = 4000; 
			int moka = 4000; 
			int deochikeopi = 4500; 
			int mohitto = 4000; 
			int olenji = 4000; 
			int mango = 3500; 
			int Strawberry = 3500;
			this.sum = 0;
			boolean flag = true;
			
			
			switch(num){
				
				case 1 : 
					System.out.println("아메리카노 " + Quantity + " 잔 선택하셧습니다.\n");
					this.sum += Quantity * Americano;
					break;
				
				case 2 : 
					System.out.println("라떼 " + Quantity + " 잔 선택하셧습니다.\n");
					this.sum += Quantity * latte;
					break;      
				
				case 3 : 
					System.out.println("카페모카 " + Quantity + " 잔 선택하셧습니다.\n");
					this.sum += Quantity * moka;
					break;     
					
				case 4 : 
					System.out.println("더치커피 " + Quantity + " 잔 선택하셧습니다.\n");
					this.sum += Quantity * deochikeopi;
					break;     
					
				case 5 : 
					System.out.println("모히또 " + Quantity + " 잔 선택하셧습니다.\n");
					this.sum += Quantity * mohitto;
					break;      
					
				case 6 : 
					System.out.println("오렌지 " + Quantity + " 잔 선택하셧습니다.\n");
					this.sum += Quantity * olenji;
					break;      
					
				case 7 : 
					System.out.println("망고 " + Quantity + " 잔 선택하셧습니다.\n");
					this.sum += Quantity * mango;
					break;      
					
				case 8 : 
					System.out.println("딸기 " + Quantity + " 잔 선택하셧습니다.\n");
					this.sum += Quantity * Strawberry;
					break;      //return;
					
				case 9 : System.out.println("결정");
			
				return;
					
					
					
					
				
				default : flag = false;
					System.out.println("번호를 잘못 선택하셨습니다." + "\n" + "다시 선택해주세요");
			}	
			if(flag) {					
				System.out.println(this.sum + "원을 입니다\n");
			}
				
			
	}
		
	}

	





	

	
		
		
	}

