package team4_login_3;
import java.util.ArrayList;
import java.util.Scanner;


public class Modified {
	

	public void getPwd() {		
		MemberDTO memberdto = new  MemberDTO();
		MemberDB mDB = new MemberDB();
		ArrayList<MemberDTO> al = new ArrayList<>();
		
		boolean loop = true; 
		boolean bool = true;
		

		Scanner sc =new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 : ");
		String name1 = sc.nextLine();
		while(loop) {
		al = new MemberDB().checkMethod();
		
		for(int j = 0; j < al.size(); j++) {
			if(al.get(j).getName() == null) {
				
				
			}else if(al.get(j).getName().equals(name1)){
				System.out.println("회원중에 일치하는 이름이 있습니다.");
				System.out.println("======== 비밀번호 수정 창 =========");
				System.out.print("기존 비밀번호를 입력해 주세요 : ");
				String pwd1 = sc.nextLine();
				
				if(al.get(j).getPwd().equals(pwd1)) {
					System.out.println("비밀번호 매칭 성공!");
					System.out.print("새로운 비밀번호를 입력해 주세요 : ");
					String pwd2 =sc.nextLine();
					System.out.print("새로운 비밀번호 한번 더 입력해 주세요 : ");
					String pwd11 =sc.nextLine();
					//2,3의 값이 같다.
					if(pwd2.equals(pwd11)) {
						System.out.println("비밀번호를 성공적으로 변경되었습니다.");
						System.out.println("회원정보수정으로 돌아갑니다.");
					}
					//2,3의 값이 다르다.
					if(!pwd2.equals(pwd11)) {
						System.out.println("비밀번호의 값이 다릅니다. 다시 입력해주세요.");
						while(bool) {
							System.out.print("Re) 새로운 비밀번호를 입력해 주세요 : ");
							pwd2 =sc.nextLine();
							System.out.print("Re) 새로운 비밀번호 한번 더 입력해 주세요 : ");
							pwd11 =sc.nextLine();
							if(pwd2.equals(pwd11)) {
								System.out.println("비밀번호를 성공적으로 변경되었습니다.");
								System.out.println("회원정보수정으로 돌아갑니다.");
								bool = false;
							} else {
								System.out.println("비밀번호의 값이 다릅니다. 다시 입력해주세요.");
							}
						}
					}
					loop = false;
					//기존 비밀번호가 다를때
				}

				if(!al.get(j).getPwd().equals(pwd1)) {
					System.out.println("기존 비밀번호의 값이 일치하지 않습니다.");
					System.out.println("다시 입력해주세요.");
				}	
			
			}else {
				System.out.println("회원중에 일치하는 이름이 없습니다.");
				return; //break;
				

			}
		}
		
		
		}

		
		
		
		

		
		}
}


