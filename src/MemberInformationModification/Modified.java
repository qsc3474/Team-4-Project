package MemberInformationModification;
import java.util.Scanner;
import javax.swing.JPanel;

public class Modified {
	int pwd = 1234;

	public void passwordChange() {		
		JPanel panel = new JPanel();
		
		boolean loop = true; 
		boolean bool = true;

		Scanner sc =new Scanner(System.in);
		
		while(loop) {
			
			System.out.println("======== 비밀번호 수정 창 =========");
			System.out.print("기존 비밀번호를 입력해 주세요 : ");
			int pwd1 =sc.nextInt();
			
			// 기존 비밀번호가 맞을때
			if(pwd1 == pwd) {
				System.out.println("비밀번호 매칭 성공!");
				System.out.print("새로운 비밀번호를 입력해 주세요 : ");
				int pwd2 =sc.nextInt();
				System.out.print("새로운 비밀번호 한번 더 입력해 주세요 : ");
				int pwd3 =sc.nextInt();
				//2,3의 값이 같다.
				if(pwd2 == pwd3) {
					System.out.println("비밀번호를 성공적으로 변경되었습니다.");
					System.out.println("회원정보수정으로 돌아갑니다.");
				}
				//2,3의 값이 다르다.
				if(pwd2 != pwd3) {
					System.out.println("비밀번호의 값이 다릅니다. 다시 입력해주세요.");
					while(bool) {
						System.out.print("Re) 새로운 비밀번호를 입력해 주세요 : ");
						pwd2 =sc.nextInt();
						System.out.print("Re) 새로운 비밀번호 한번 더 입력해 주세요 : ");
						pwd3 =sc.nextInt();
						if(pwd2 == pwd3) {
							System.out.println("비밀번호를 성공적으로 변경되었습니다.");
							System.out.println("회원정보수정으로 돌아갑니다.");
							bool = false;
						} else {
							System.out.println("비밀번호의 값이 다릅니다. 다시 입력해주세요.");
						}
					}
				}
				loop = false;
			}

			//기존 비밀번호가 다를때
			if(pwd1 != pwd) {
				System.out.println("기존 비밀번호의 값이 일치하지 않습니다.");
				System.out.println("다시 입력해주세요.");
			}	
		}
	}
}


