package day02;

public class Ex02 {
	public static void main(String[] args) {
		//암시적 형변환
		//더 작은 데이터타입을 큰 데이터타입으로 바꿀 때
		//아무런 명령어 없이 곧장 초기화가 가능하다.
		long i = 10;
		int l = (int)i;
		
		String str = "a12345"+6;
		int j = Integer.parseInt(str);
		System.out.println(j+6);
		
		
	}
}
