package day05;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//collection 마지막 친구
//Map
public class Ex04 {
	public static void main(String[] args) {
		// 맵핑이란?
		// 그 단어가 몇번 나왔는지 카운트
		// I ate hamburgers. I love hamburgers.
		// <I, 2>
		// <ate, 1>
		// <hamburgers, 2>
		// <love, 1>

		// 우리가 했던 collection 객체들은 polymorphism 을 적용시킬 수 있다.
		Map<String, String> map = new LinkedHashMap<String, String>();

		// map에 데이터를 저장할때에는 키와 밸류를 put 메소드에 담아서 저장한다.
		map.put("키1번", "밸류1번");
		map.put("키2번", "밸류2번");
		map.put("키1번", "밸류01번");
		// map의 저장된 데이터를 불러올때에는 키값으로 불러오게 된다.
		System.out.println(map.get("키1번"));
		System.out.println(map.get("키55번"));
		// map에 저장을 할때 key는 key set에 저장이된다.
		// 즉 중복된 key 값은 허용되지 않는다.(덮어씌어진다)
		for (String s : map.keySet()) {
			System.out.println(s);
		}

		// 만약 우리가 map 키값과 value값을 전부 출력하고 싶다면?
		for (String s : map.keySet()) {
			System.out.println("key: " + s + " value" + map.get(s));
		}
	}
}






