package day09;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//JSON 직접 만들어보기
//JavaScript Object Notation
public class Car {
	private int id;
	private String plateNumber;
	private String type;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		//JSON에서 객체 는 { } 으로 묶인다.
		//스트링 밸류값은 "" 으로 묶는다.
		//필드의 이름을 key 라고 부르고 실제 들어오는 값을 value라고 칭한다.
		//key는 항상 String이고 "" 로 묶는다.
		//value는 int나 String이 될 수 있고 String 일때에는 ""로 묶는다.
		
		//mvnrepository.com -> gson 입력
		Gson g = new Gson();
		return g.toJson(this).toString();
	}
	
	
}




