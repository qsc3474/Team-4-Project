package withdraw;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Scanner;

import team4_login_3.MemberDB;
import team4_login_3.MemberDTO;

public class Application1 {

	public static void main(String[] args) {

		MemberDB mDB = new MemberDB();

		MemberDTO memberDTO = new MemberDTO();

		ArrayList<MemberDTO> str = new ArrayList<>();
		str.add(new MemberDTO("1", "1", "1", null, null, null, null, null));
		str.add(new MemberDTO("2", "2", "2", null, null, null, null, null));
		str.add(new MemberDTO("3", "3", "3", null, null, null, null, null));

//		str = new MemberDB().checkMethod();

		Scanner sc = new Scanner(System.in);

		while (true) { // true
			System.out.println("==========메뉴를 선택해주세요.======");
			System.out.println("1. 회원 List");
			System.out.println("2. 회원 탈퇴");
			System.out.println("3. 회원 정보 조회");
			System.out.print("--> ");
			int num = sc.nextInt();

			if (num == 1) {

				System.out.println(str);

				System.out.println();

			} else if (num == 2) {

				System.out.print("탈퇴하고자 하는 회원의 ID를 입력하세요 : ");
				String id = sc.next();

				for (int a = 0; a < str.size(); a++) {

					if (str.get(a).getId().equals(id)) {
						str.remove(a);
						System.out.println("탈퇴가 완료되었습니다. 감사합니다.");
						break;

//					mDB.insertMember(str);
					}
//				str.get(a).setPwd(name);
//				mDB.insertMember(str);

				}

//			System.out.print("탈퇴하고자 하는 회원의 이름을 입력해주세요 : ");
//			String name = sc.next();

//			for(int j=0; j<10; j++) {
//				
//				for(int x=0; x<10; x++) {
//					
//					if(str.get(j)[x].)
//				}
//				
//				if(str {
//////					col = j;
//					str.remove(j);
//					
//				}
//			}

			} // 나중에 지우세요
//			for(int k=col; k<count-1;k++) {
//				str.get[k] = str.get[k+1];
//			}
//		
//			count -= 1;
//			System.out.println("회원이 탈퇴되었습니다. 감사합니다.");
//			System.out.println();
//			
//			System.out.println(str);
////			
			else {

				System.out.print("조회하고자 하는 회원의 ID를 입력하세요 : ");
				String id2 = sc.next();

				for (int a = 0; a < str.size(); a++) {
					if (str.get(a).getId().equals(id2)) {

						System.out.println("입력하신 아이디 " + id2 + "의 정보가 존재합니다.");
						break;

					} else {
						System.out.println("입력하신 아이디 " + id2 + "의 정보는 존재하지않습니다.");
						break;

					}

				}

			}
		}

	}
}
