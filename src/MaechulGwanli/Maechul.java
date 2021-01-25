package MaechulGwanli;

import java.util.Scanner;

public class Maechul {
	
	public static void main(String[] args) {
		 Menyujumun Menyu = new Menyujumun();
		 Gwanli gwanli =new Gwanli();
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("*********** 매장관리 ***********");
		System.out.println("사장님 환영합니다.");
		System.out.println("1번 메뉴주문");
		System.out.println("2번 매출");
		System.out.println("3번 로그아웃");
	
		
		while(true) {
			System.out.print("번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();	
			
			switch(num){
			
			case 1 : 
				Menyu.jumun();
				break;
			case 2 : 
				gwanli.gwanliteibeul();
				break;
				
			default : 
			System.out.println("번호를 잘못 선택하셨습니다." + "\n" + "다시 선택해주세요");
	}	

		
		}
		

	}

}
