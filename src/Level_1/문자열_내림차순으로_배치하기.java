package Level_1;

import java.util.Collections;
import java.util.*;

public class 문자열_내림차순으로_배치하기 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		// 목표 return = "gfedcbZ"
		
		System.out.println(solution(s));

		

	}

	static String solution(String s) {

		String[] tmp = s.split("");

		Arrays.sort(tmp);

		ArrayList<String> li = new ArrayList<>(Arrays.asList(tmp));

		Collections.reverse(li);

		String answer = String.join("", li);

		return answer;
	}

}
