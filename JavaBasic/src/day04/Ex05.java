package day04;

import java.text.ParseException;
import java.util.Scanner;

//wrapper class
//wrapper class란?
//기본형 데이터타입을 클래스처럼 만들어 놓은것을
//wrapper 클래스(포장 클래스) 라고 한다.
public class Ex05 {
	public static void main(String[] args) {
		Integer i = 5;
		i = (int)('e');
		Scanner scanner = new Scanner(System.in);
		//메소드를 통한 형변환
		//각 wrapper 클래스들은 parse 메소드들이 있다.
		//String을 해당 클래스로 바꿔준다.
		try{
			System.out.println("숫자를 입려해주세요: ");
			String userNumber = scanner.nextLine();
			Integer convertedNumber = Integer.parseInt(userNumber);
			System.out.println(convertedNumber);
		}catch(Exception e) {
			System.out.println("잘못된 형식입니다.");
		}
	}
}
