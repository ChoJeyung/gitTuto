package day01;

//Switch
public class Ex04 {
	public static void main(String[] args) {
		// switch는 한 변수의 나올수 있는 값들을 모두 테스트하여
		// 해당 값이 있는 케이스문부터
		// break가 나오는 케이스까지 실행하게 된다.
		int myNumber = 1;
		switch (myNumber) {
		case 1:
			System.out.println("1입니다.");
			break;
			//break란? 만나는 즉시 해당 code block을 탈출한다.
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("그 외입니다.");
			break;
		}
		
		//switch문의 가장흔한 예제
		int httpStatusCode = 200;
		String response = "";
		switch(httpStatusCode) {
		case 200:
			response = "/index/index.jsp";
			break;
		case 404:
			response = "redirect://error/404";
			break;
		case 400:
			response = "redirect://error/400";
			break;
		case 403:
			response = "redirect://error/403";
			break;
		}
	}
}










