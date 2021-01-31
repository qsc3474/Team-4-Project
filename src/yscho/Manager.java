package yscho;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {

	public Manager() {}

	Scanner sc = new Scanner(System.in);
	LoginDTO loginDTO = new LoginDTO();		// 로그인DTO생성
	ArrayList<LoginDTO> members = new ArrayList<>();	//회원 로그인 정보를 받음 (1차원 배열)

	public void Run() throws Exception {


		while(true) {
			System.out.println("======= 회원가입 페이지 =======");	// 회원페이지
			System.out.println("1. 회원가입");			// 선택 시 회원가입
			System.out.println("2. 로그인");			// 선택 시 로그인
			System.out.println("3. 회원조회");			// 선택 시 회원조회
			System.out.println("9. 프로그램 종료");		// 선택 시 프로그램 종료
			System.out.print("번호를 입력하세요 :");
			int no = sc.nextInt();

			switch(no) {
			case 1 :		// 회원가입
				register();	// 회원가입 메소드 실행
				break;
			case 2 : 		// 로그인
				login();	// 로그인 메소드 실행
				break;
			case 3 : 		// 회원정보 조회
				search();
				break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못된 번호를 입력하셨습니다.");
			break;
			}
		} //while문 종료
	} //run 종료

	public void search() {
		// TODO Auto-generated method stub
		
	}

	public void register() throws IOException {		// 회원가입 메소드
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;						// fileWriter생성

		try {
			fw = new FileWriter("C:\\\\workspace\\\\memberDB.txt", true);			// FileWriter저장소
			if(members.size() == 0) {
				String title = "아이디" + "\t\t" + "비밀번호" + "\t\t" + "이름" + "\t\t" + "년" + "\t"
						+ "월" + "\t" + "일" + "\t\t" + "이메일";
				fw.write(title);													// FileWriter 생성시 맨 위에 아이디, 비번 등 표시
			}
			String pwd = "";				// 비밀번호
			String pwdDoubleCheck = "";		// 비밀번호 확인

			System.out.println("아이디를 입력해주세요 : ");		// 아이디 입력
			String id = sc.nextLine();
			fw.append("\t");

			while(true) {										// 비밀번호 확인 loop 비밀번호 일치시까지 loop

				System.out.println("비밀번호를 입력하세요 : ");		// 비밀 번호 입력
				pwd = sc.nextLine();
				fw.append("\t");
				System.out.println("비밀번호를 다시 입력하세요 : ");
				pwdDoubleCheck = sc.nextLine();
				fw.append("\t");

				if (!pwd.equals(pwdDoubleCheck)){					
					System.out.println("비밀번호가 일치하지 않습니다");
					System.out.println("비밀번호를 다시 입력하세요.");

				}else {
					System.out.println("입력하신 비밀번호가 일치합니다.");
					break;
				}

			}

			System.out.println("이름을 입력하세요");
			String name = sc.nextLine();
			fw.append("\t");
			System.out.print("태어난 년도를 입력하세요 : ");	// 태어난 년도 입력
			int year = sc.nextInt();
			fw.append("\t");
			System.out.print("태어난 월을 입력하세요 : ");		// 태어난 월 입력
			int month = sc.nextInt();
			fw.append("\t");
			System.out.print("태어난 일을 입력하세요 : ");		// 태어난 일 입력
			int day = sc.nextInt();
			fw.append("\t");
			sc.nextLine();
			System.out.println("이메일을 입력하세요 : ");		// 이메일 입력
			String email = sc.nextLine();
			fw.append("\r");

			if(pwd.equals(pwdDoubleCheck)) {		// 비밀번호와 비밀번호 확인 입력
				loginDTO = new LoginDTO(id, pwd, pwdDoubleCheck, name, year, month, day, email);	// 비밀번호 일치시 회원가입 정보를 배열로 저장
				members.add(loginDTO);
				System.out.println(id + "님 회원가입을 축하드립니다.");		// 비밀번호 일치시 회원가입 축하 문구
			}else {		// 비밀번호 불일치시
				System.out.println("비밀번호가 일치 하지 않습니다. 비밀번호를 확인해주세요.");		// 비밀번호 불일치시 문구
				return;
			}

			for(int i = 0 ; i < members.size(); i++) {		// 배열에 저장된 회원정보를 출력
				System.out.println("입력하신 정보는 아래와 같습니다.");
				System.out.println(members.get(i).getInfo());
			}

			String total = id + "\t\t" + pwd + "\t\t" + name + "\t\t" + year +"\t" + month
					+ "\t" + day + "\t\t" + email;

			fw.write(total);		// FileWriter에 입력한 정보 대입

		}catch (IOException e) {

			e.printStackTrace();
		}finally {
			if(fw != null) {
				try {

					fw.close();
				} catch (IOException e) {

					e.printStackTrace();

				}
			}
		}
	}

	public void login() {		//로그인 메소드
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");	// 아이디 입력
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");	// 비밀번호 입력
		String pwd = sc.nextLine();

		File file = new File("C:\\workspace\\memberDB.txt");
		try {

			FileReader filereader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		if(loginDTO.getId() == null) {		// 회원정보에 아이디가 없을시 회원가입을 권유
			System.out.println("회원등록이 되어 있지 않습니다. 회원가입을 먼저해주세요.");
			return;
		}else if(!loginDTO.getId().equals(id)) {	// 회원정보에 가입된 아이디가 없을 시
			System.out.println("등록되지 않은 아이디입니다.");
		}

		if(!loginDTO.getPwd().equals(pwd)) {		// 비밀번호가 불일치시 문구
			System.out.println("비밀번호가 틀렸습니다.");

		}else if(loginDTO.getId().equals(id) && loginDTO.getPwd().equals(pwd)){		//회원가입한 아이디와 비밀먼호 일치시 문구
			System.out.println("축하합니다!");
			System.out.println(loginDTO.getName() + "님이 로그인 하였습니다.");


		}	

	}

}


















