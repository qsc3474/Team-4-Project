package MemberInformationModification;

import java.util.Scanner;


public class MemberModification  {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		
		MemberDTO member = new MemberDTO();
		while(true) {
			System.out.println("======== 회원 관리 프로그램 =========");
			System.out.println("1. 비밀번호 수정");		// 비밀번호 수정 버튼
			System.out.println("9. 로그아웃");			// 종료 버튼
			System.out.print("메뉴선택 : ");
			int no = sc.nextInt();
			sc.nextLine();		
			
			switch(no){
			case 1 : member.getPwd();break;			// 비밀번호 수정 메소드
			
			case 9 : System.out.println("로그아웃.");return;	
			default : System.out.println("잘못된 번호를 선택하셧습니다.");
			
			}
			
		}
			
			
			

		

	}

}
