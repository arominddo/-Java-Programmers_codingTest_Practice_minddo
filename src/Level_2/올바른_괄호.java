package Level_2;

import java.util.*;

public class 올바른_괄호 {

	public static void main(String[] args) {
		String s = "()()";

		// 목표 result
		boolean result = true;

		// 확인
		System.out.println(solution(s));
		System.out.println("정답입니까? : " + solution(s));

	}

	static boolean solution(String s) {

		Stack<String> li = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				li.add("(");
			} else {
				if (li.isEmpty()) {
					return false;
				} else {
					li.pop();
				}

			}

		}

		if (li.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
