package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//로또번호 제작기 - 2단계
public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		while(list.size() < 6) {
			Integer randomNumber = random.nextInt(45)+1;
			if(!list.contains(randomNumber)) {
				list.add(randomNumber);
			}
		}
		for(int i : list) {
			System.out.println(i);
		}
		
		//왜 우리가 힘들게 소트 하는가?
		//자바에 있는 소트를 쓰자!
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("====정렬 후====");
		for(int i : list) {
			System.out.println(i);
		}
	}
}










