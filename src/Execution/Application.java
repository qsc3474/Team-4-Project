package Execution;

import java.util.Scanner;

import MaechulGwanli.Gwanli;
import MaechulGwanli.Menyujumun;
import MemberInformationModification.MemberDTO;
import dd.orderMenu;
import withdraw.B;
import ys_stock.Manager;

public class Application {

	public static void main(String[] args) {
		 Menyujumun Menyu = new Menyujumun();
		 Gwanli gwanli = new Gwanli();
		 Manager manager = new Manager();
		 Manager manager2 = new Manager();
		 orderMenu orderMenu = new orderMenu();
		 MemberDTO member = new MemberDTO();
			B b = new B();

		 
			
		
		Scanner sc =new Scanner(System.in);
		
		
		while(true) {
		System.out.println("*********** 커피 한 잔의 여유 ***********");
		System.out.println("고객님 환영합니다.");
		System.out.println("1번 회원가입 및 로그인");
		System.out.println("2번 메뉴주문");
		System.out.println("3번 회원수정");
		System.out.println("4번 회원탈퇴");
		System.out.println("5번 로그아웃");
	
		  
			System.out.print("번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();	
			
			switch(num){
			
			case 1 : 
				manager.Run();
				break;
				
			case 2 : 
				orderMenu.main(null);
				orderMenu.temperature();
				orderMenu.size();
				orderMenu.shot();
				break;
				
			case 3 : 
				member.getPassword();
				break;
				
			case 4 : 
				b.main(null);
				break;
				
			case 5 : 
				System.out.println("Logout OK.");
				return;
				
			default : 
			System.out.println("번호를 잘못 선택하셨습니다." + "\n" + "다시 선택해주세요");
	}	

		
		}
	}

}
