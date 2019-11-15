package day04;

import java.util.Scanner;

//로그인 시스템 만들기
//사용자로부터 id와 비밀번호를 받아서
//회원 가입 -> 로그인
//id: 4글자 이상 13글자 미만
//pw: 6글자 이상
//로그인 시에는 id와 비밀번호 둘중 하나만 틀려도
//정확히 뭐가 틀렸는지는 말하지 않고
//"id 혹은 pw"가 틀렸습니다.
//라고 출력이 되고
//둘다 맞을 시에는 "로그인 성공!" 이란 메시지가 출력되게 만드세요.
public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가입할 ID를 입력하세요: ");
		String id = scanner.nextLine();
		System.out.println("사용할 PW를 입력하세요: ");
		String pw = scanner.nextLine();
		
		if(id.length() >= 4 && id.length() < 13 && pw.length() >=6) {
			System.out.println("===비트 로그인 시스템===");
			System.out.print("id: ");
			String userName = scanner.nextLine();
			System.out.print("pw: ");
			String userPW = scanner.nextLine();
			if(id.equalsIgnoreCase(userName) && pw.equals(userPW)) {
				System.out.println("로그인 성공!!");
			}else {
				System.out.println("로그인 실패!!");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}







