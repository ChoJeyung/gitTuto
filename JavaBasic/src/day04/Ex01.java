package day04;

public class Ex01 {
	public static void main(String[] args) {
		//상속받은 클래스는 부모클래스의
		//필드를 사용할 수 있다.(private인 경우엔 getter/setter를
		//통해서 사용가능)
		Student s = new Student();
		//먼저 부모클래스의 생성자를 호출해서 heap메모리에
		//부모클래스가 가지고 있는 필드와 메소드를 넣고
		//그리고 자식 클래스의 필드와 메소드를 넣는다.
		
		s.setJumin("911111-1111111");
		s.setName("조재영");
		s.speak();
		Student.eat();
		Korean.eat();
		System.out.println(s);
		
		Korean k = new Korean();
		Japanese j = new Japanese();
		Human me = new Korean();
		torture(me);
	}
	public static void torture(Human h) {
		h.speak();
	}
}






