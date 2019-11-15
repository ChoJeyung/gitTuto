package day03;

import java.util.Scanner;

//스캐너 버그
public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("회원 번호: ");
		int userId = scanner.nextInt();
		System.out.println("회원 이름: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("번호: " + userId);
		System.out.println("회원 이름: " + name);
		scanner.close();
	}
}




