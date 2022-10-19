package Level_2;

import java.util.*;

public class 최댓값과_최솟값 {

	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";

		// 목표 result
		String result = "-4 -1";

		// 확인
		System.out.println(solution(result));
		System.out.println(solution(result).equals(result));

	}

	static String solution(String s) {
		String answer = "";

		String[] tmp = s.split(" ");

		ArrayList<Integer> li = new ArrayList<>();

		for (int i = 0; i < tmp.length; i++) {
			li.add(Integer.parseInt(tmp[i]));
		}

		answer = answer + Collections.min(li) + " " + Collections.max(li);

		return answer;
	}

}
