
package assignment;

import java.util.ArrayList;

public class StudentController {
	//selectAll(), select(id), insert(StudentDTO)
	//update(StudentDTO), delete(StudentDTO)
	ArrayList<StudentDTO> list;
	public StudentController() {
		list = new ArrayList<>();
		StudentDTO s = new StudentDTO();
		s.setId(0);
		s.setName("조재영");
		s.setMajor("컴퓨터 과학");
		s.setKor(80);
		s.setEng(90);
		s.setMath(70);
		list.add(s);
		
		StudentDTO s1 = new StudentDTO();
		s1.setId(1);
		s1.setName("조재영2");
		s1.setMajor("생물학");
		s1.setKor(70);
		s1.setEng(90);
		s1.setMath(80);
		list.add(s1);
		
		StudentDTO s2 = new StudentDTO();
		s2.setId(5);
		s2.setName("김철수");
		s2.setMajor("철학");
		s2.setKor(90);
		s2.setEng(90);
		s2.setMath(50);
		list.add(s2);
	}
	public ArrayList<StudentDTO> selectAll(){
		return list;
	}
	public StudentDTO select(int index) {
		return list.get(index);
	}
	public void insert(StudentDTO studentDTO) {
		int id = list.get(list.size() - 1).getId() + 1;
		studentDTO.setId(id);
		list.add(studentDTO);
	}
	public void update(StudentDTO s) {
		list.set(list.indexOf(s), s);
	}
	public void delete(StudentDTO s) {
		list.remove(s);
	}
}





