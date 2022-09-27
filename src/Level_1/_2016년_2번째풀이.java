package Level_1;

import java.util.*;
import java.time.*;

public class _2016년_2번째풀이 {

	public static void main(String[] args) {

		int a = 5;
		int b = 24;

		// 목표 result = "TUE"

		// 정답
		System.out.println(solution(a, b));

	}

	static String solution(int a, int b) {
		String answer = "";

		LocalDate date = LocalDate.of(2016, a, b);

		DayOfWeek week = date.getDayOfWeek();

		char[] tmp = new char[3];

		for (int i = 0; i < 3; i++) {
			tmp[i] = ("" + week).charAt(i);
		}

		answer = "" + String.valueOf(tmp);

		return answer;

	}

}
