package MemberInformationModification;

import java.util.Scanner;

public class Modified {
	
	
	private int pwd = 1234;
	


	public void pwd() {				
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("======== 비밀번호 수정 창 =========");
		System.out.print("기존 비밀번호를 입력해 주세요 : ");
		int pwd1 =sc.nextInt();
		
		if(pwd1 == pwd ) {									// 비밀번호 한 번도 안 틀렸을 때
			System.out.print("새로운 비밀번호를 입력해 주세요 : ");
			int pwd2 =sc.nextInt();
			System.out.print("새로운 비밀번호 한번더 입력해 주세요 : ");
			int pwd3 =sc.nextInt();
			this.pwd = pwd3;
			System.out.println("비밀번호를 성공적으로 바꾸셨습니다.");
			System.out.println("회원정보 수정 창으로 돌아갑니다");
			return;
		}
		
		while(pwd1 != pwd ){								// 기존 비밀번호 틀렸을 때 반복문
	    	System.out.println("기존 비밀번호가 아닙니다.");
	    	System.out.print("기존 비밀번호를 입력해 주세요 : ");
	    	int pwd4 =sc.nextInt();
	    		if(pwd4 == pwd) {
	    			System.out.print("새로운 비밀번호를 입력해 주세요 : ");
	    			int pwd2 =sc.nextInt();
	    			System.out.print("새로운 비밀번호 한번더 입력해 주세요 : ");
	    			int pwd3 =sc.nextInt();
	    			this.pwd = pwd3;
	    			System.out.println("비밀번호를 성공적으로 바꾸셨습니다.");
	    			System.out.println("회원정보 수정 창으로 돌아갑니다");
	    			return;
	    		}
		}	
	    	
	

	    			
		

	}

}


