package day04;

import java.sql.Connection;

public class StudentController {
	private Connection conn;

	public StudentController(ConnectionMaker m) {
		conn = m.makeConnection();
	}
	// 이후 코드에서는 conn 객체를 사용하여 DB에 query를 보내고
	// 결과를 ResultSet 객체에 담거나
	// 입력, 수정, 삭제를 실행한다.

}
