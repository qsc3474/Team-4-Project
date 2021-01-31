package Execution;

import java.util.Scanner;

import MaechulGwanli.Gwanli;
import MaechulGwanli.Menyujumun;
import MemberInformationModification.MemberDTO;
import dd.orderMenu;
import withdraw.B;
import ys_stock.Manager;

public class Application2 { 

	public static void main(String[] args) {
		 Menyujumun Menyu = new Menyujumun();
		 Gwanli gwanli = new Gwanli();
		 Manager manager = new Manager();
		 Manager manager2 = new Manager();
		 orderMenu orderMenu = new orderMenu();
		 MemberDTO member = new MemberDTO();
			B b = new B();

		 
			
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("*********** 매장관리 ***********");
		System.out.println("관리자님 환영합니다.");
		System.out.println("1번 회원가입 및 로그인");
		System.out.println("3번 재고");
		System.out.println("4번 매출");
		System.out.println("5번 회원관리");
		System.out.println("8번 로그아웃");
	
		
		while(true) {
			System.out.print("번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();	
			
			switch(num){
			
			case 1 : 
				manager.Run(); 
				break;
				
			case 3 : 
				manager2.Run();
				break;
				
			case 4 : 
				gwanli.gwanliteibeul();
				break;
				
			case 5 : 
				// 회원관리
				break;
	
	
		
				
			case 8 : 
				System.out.println("Logout OK.");
				return;
				
			default : 
			System.out.println("번호를 잘못 선택하셨습니다." + "\n" + "다시 선택해주세요");
	}	

		
		}

	}

}
