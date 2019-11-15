package day01;
//별찍기
// chojeyungbit@gmail.com
// 별찍기 5~10번
public class Ex08 {
	public static void main(String[] args) {
		System.out.println("--1번--");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--2번--");
		for(int i = 1; i <= 5;i++) {
			String starPrint = "";
			for(int j = i; j <= 5; j++) {
				//String을 연결하는 방법 1.
				//+ 연산자를 이용한다.
				//starPrint = starPrint + "*";
				//위의 code를 간략화 시키면?
				starPrint += "*";
			}
			System.out.println(starPrint);
		}
		System.out.println("--3번--");
		//String 연결 2번
		for(int i = 1; i <= 5; i++) {
			String starPrint = "";
			for(int j = 1; j <= 5-i; j ++) {
				starPrint = starPrint.concat(" ");
			}
			for(int j = 1; j <= i; j++) {
				starPrint = starPrint.concat("*");
			}
			System.out.println(starPrint);
		}
		//String 연결 3번
		System.out.println("--4번--");
		for(int i = 1; i <= 5; i++) {
			StringBuilder stringBuilder = new StringBuilder();
			for(int j = 1; j <= i-1; j++) {
				stringBuilder.append(' ');
			}
			for(int j = i; j <= 5; j++) {
				stringBuilder.append("*");
			}
			System.out.println(stringBuilder.toString());
		}
	}
}








