package day02;

public class StudentEx {
	public static void main(String[] args) {
		Student s = new Student("조재영", 17, 90, 
				80, 70, "991111-1111111");
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		Student s2 = new Student();
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
	}
}









