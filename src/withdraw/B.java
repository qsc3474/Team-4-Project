package withdraw;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] str = {"박","이","김","최"};
		
		int col = 0;
		int count = str.length;
		
		Scanner sc = new Scanner(System.in);
		
		while(count!=0) {	// true
		System.out.println("==========메뉴를 선택해주세요.======");
		System.out.println("1. 회원 List");
		System.out.println("2. 회원 탈퇴");
		System.out.println("3. 회원 정보 조회");
		System.out.print("--> ");
		int num = sc.nextInt();
		
		if(num==1) {
			
			for(int i=0; i<count; i++) {
				System.out.print(str[i] + "\t");
			}
			System.out.println();
		
		}else if (num == 2) {
			
			System.out.print("탈퇴하고자 하는 회원의 이름을 입력해주세요 : ");
			String name = sc.next();
			
			for(int j=0; j<count; j++) {
				
				if(name.equals(str[j])) {
					col = j;
				}
			}
			
			for(int k=col; k<count-1;k++) {
				str[k] = str[k+1];
			}
			
			count -= 1;
			System.out.println("회원이 탈퇴되었습니다. 감사합니다.");
			System.out.println();
			
		}else {
			
			System.out.print("조회하고자 하는 회원의 이름을 입력하세요 : ");
			String name2 = sc.next();
			
			for(int x=0; x< str.length; x++) {
				
				if((name2.equals(str[x]))) {
					System.out.println("입력하신 회원 정보는 존재합니다.");
					
				}else {
					System.out.println("입력하신 회원 정보는 없습니다.");
				}
				break;
			}
		}
		}
		
	}

}
