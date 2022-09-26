package Level_1;

import java.util.Arrays;

public class 시저_암호 {

	public static void main(String[] args) {
		String s = "AB";
		int n = 1;
		// 목표 result = "BC"

		System.out.println(solution(s, n));

	}

	static String solution(String s, int n) {
		String answer = "";

		String[] s_li = s.split("");

		int lower_min = (int) 'a';
		int lower_max = (int) 'z';

		int upper_min = (int) 'A';
		int upper_max = (int) 'Z';

		for (int i = 0; i < s_li.length; i++) {
			int tmp = (int) s_li[i].charAt(0);
			if (lower_min <= tmp && tmp <= lower_max) {
				if (tmp + n > lower_max) {
					int num = tmp + n - 26;
					s_li[i] = "" + (char) num;
				} else {
					s_li[i] = "" + (char) (tmp + n);
				}
			} else if (upper_min <= tmp && tmp <= upper_max) {
				if (tmp + n > upper_max) {
					int num = tmp + n - 26;
					s_li[i] = "" + (char) num;
				} else {
					s_li[i] = "" + (char) (tmp + n);
				}
			}
			answer = String.join("", s_li);

		}

		return answer;
	}

}
