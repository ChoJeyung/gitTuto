package day01;
// control 문

// 조건문, 반복문
// 조건문 1

public class Ex03 {
	public static void main(String[] args) {
		// if문
		// 해당 조건식이 true가 나오면 code block 이 실행된다.
		// code block이란?
		// 해당 code가 속한 { }

		// if -> if else -> if else if else

		int myInt = 100;
		if (myInt <= 10) {
			System.out.println("10보다 작거나 같다");
		} else {
			// else는 if문의 조건식이 true가 아닌 모든 경우
			System.out.println("10보다 크다.");
		}

		if (myInt > 100) {
			System.out.println("100보다 큽니다.");
		} else if (myInt >= 10) {
			System.out.println("10보다 크지만 100보다 작거나 같습니다.");
		} else {
			System.out.println("10이하입니다.");
		}

		myInt = 120;
		// 아래 코드는 위의 코드와 결과가 틀리게 된다.
		if (myInt > 100) {
			System.out.println("100 초과");
		}
		if (myInt > 10) {
			System.out.println("10초과");
		}

		String string1 = null;
		if (string1 != null && string1.equals("abc")) {
			System.out.println("abc와 같습니다.");
		} else {
			System.out.println("abc와 다릅니다.");
		}
	}
}







