package day04;

public class Korean implements Human{
	private String name;
	private String jumin;
	public Korean() {
		System.out.println("Korean 생성자 호출");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String toString() {
		return "Korean : name = "+name+", jumin = "+jumin;
	}
	public static void eat() {
		System.out.println("김치를 먹는다.");
	}
	
	//interface 상속을 받으면
	//해당 interface에서 선언된 메소드를 '반드시'
	//정의해줘야한다.
	public void speak() {
		System.out.println("한국말을 합니다.");
	}
	
	public void play() {
		System.out.println("놉니다.");
	}
}








