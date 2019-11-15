package day04;

public class Ex03 {
	public static void main(String[] args) {
		//String이란?
		//문자열(문자가 여러개 모여있는것)을 뜻한다.
		//String과 char의 차이
		//String은 char들이 모여서 String이 됩니다.
		//char는 문자 1개 를 뜻합니다.
		char a = 'a';
		//이코드는 에러가 납니다.
		//char b = "abc"; //abc는 여러 글자가 모인 문자'열' 이기 때문에 char에 들어갈 수 없다.
		
		//char는 ascii 테이블 기반의 코드값으로 진행되기 때문에
		//아래 코드가 가능해진다.
		System.out.println((char)('A'+32));
		//왜? ascii 테이블에서 대문자 알파벳과 소문자 알파벳은 32 만큼 차이가 있기 때문에
		//대문자 코드값 + 32를 하면 소문자 코드값이 나오고
		//그 코드값을 char로 타입 캐스팅하면 소문자가 출력된다.
		
		//String 객체를 초기화하는 3가지 방법
		//1. 기본 생성자 호출하고 초기화하기 -> 제일 안씀
		String str = new String();
		str= "abc";
		
		//2. String 객체에 직접 값을 넣는 방법 -> 가장 많이 씀
		String str2 = "abcd";
		
		//3. 생성자의 파라미터를 넘겨서 초기화하기
		String str3 = new String("abc");
		
		//String 클래스의 메소드들
		//1. 비교할때
		//String은 클래스이므로 비교연산자를 사용하며는
		//주소값을 비교하게 됩니다.
		//따라서 우리가 원하는 값비교를 할려면
		//equals메소드를 통해서 비교해야합니다.
		System.out.println(str.equals(str3));
		
		//2. 포함되었는지 확인할때
		//String의 값이 다른 string을 포함하는지 체크할때에는
		//contains 메소드를 사용한다.
		//아래 코드는 abcd 안에 abc가 있는지 확인하므로
		//true가 나온다.
		System.out.println(str2.contains(str3));
		
		//3. 대소문자 상관없이 비교할때
		//예를 들어 id를 캡스락 키고 입력해도 정상적으로 인식되는 
		//코드를 작성할때 사용가능하다.
		//아래 코드는 abcd와 ABCD가 대소문자와 무관하게
		//내용이 같은지 체크하므로 true가 나온다.
		System.out.println(str2.equalsIgnoreCase("ABCD"));
		
		//4. 스트링의 길이를 체크할때
		//abcd 의 길이(4)를 보고 싶을때에는
		//length() 메소드를 사용한다.
		System.out.println(str2.length());
		
		//5. 특정 문자열 패턴을 만족하는지 체크할때
		//matches() 메소드를 사용한다.
		//패턴은 '정규표현식'(Regular Expression or RegEx)를 사용한다.
		//숙제: 정규표현식 조사
		
		//아래 코드는 str2가 숫자로만 이루어졌는지 확인한다.
		System.out.println(str2.matches("[0-9]"));
		//정규표현식을 사용하면 이메일이 유효한 형태인지 확인 가능하다.
		
		//6.문자열에서 특정 문자열을 다른 문자열로 바꿀때
		//replace 메소드를 사용한다.
		
		//아래코드는 abc 를 xyc로 변화해준다.
		System.out.println(str.replace("ab", "xy")); 
		
		//7. 문자열을 잘라내서 다른 문자열에 저장할때
		//subString을 사용한다.
		//subString은 2가지 파라미터로 오버로딩되어있는데
		//하나는 시작지점~끝까지
		String subString = str.substring(1);
		System.out.println(subString);
		//하나는 시작지점~끝지점을 지정해주는 방식
		//str2: abcd
		//1번자리 이후 ~ 3번까지
		//= a다음 부터 c까지 -> bc
		subString = str2.substring(1, 3);
		System.out.println(subString);
		
		//8. 모든 글자를 소문자로 바꿀때
		//toLowerCase 메소드를 실행해준다.
		//아래코드는 abcdefg가 출력된다.
		System.out.println("AbCdEfG".toLowerCase());
		
		//9. 모든 글자를 대문자로 바꿀때
		//toUpperCase 메소드를 실행해준다.
		//아래코드는 ABCDEFG가 출력된다.
		System.out.println("AbCdEfG".toUpperCase());
		
		//10. String도 toString()이 있다.
		//물론 자기 자신을 리턴한다.
		System.out.println(str.toString());
		
		//11. 앞뒤의 공백들을 짤라줄때에는
		//trim 메소드를 사용한다.
		str = "    abcd   ";
		System.out.println(str);
		System.out.println(str.trim());
		
		//12. 기본형 데이터타입들의 값을 string으로 바꿔줄때에는
		//valueOf 메소드를 사용한다.
		//단 valueOf 메소드는 static 메소드이기때문에
		//아래의 코드처럼 쓴다.
		str = String.valueOf(true);
		System.out.println(str);
		
		//마지막으로 문자열은 + 연산이 가능하다.
		//+ 연산의 결과값은 2개를 연결시킨다.
		//문자열 + 기본형 데이터타입도 기본형 데이터타입을
		//문자열로 변경하고 연결시켜준다.
		System.out.println("a"+123);
	}
}







