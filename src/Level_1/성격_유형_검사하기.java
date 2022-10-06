package Level_1;

import java.util.*;

public class 성격_유형_검사하기 {

	public static void main(String[] args) {

		String[] survey = { "AN", "CF", "MJ", "RT", "NA" };
		int[] choices = { 5, 3, 2, 7, 5 };

		// 목표 result
		String result = "TCMA";

		// 확인

		System.out.println(solution(survey, choices));
		System.out.println(solution(survey, choices).equals(result));

	}

	static String solution(String[] survey, int[] choices) {
		String answer = "";

		String[][] li = { { "R", "T" }, { "C", "F" }, { "J", "M" }, { "A", "N" } };

		HashMap<String, Integer> score = new HashMap<>();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				score.put(li[i][j], 0);
			}
		}

		for (int i = 0; i < choices.length; i++) {
			if (choices[i] > 4) {
				score.put("" + survey[i].charAt(1), score.get("" + survey[i].charAt(1)) + (choices[i] - 4));
			} else if (choices[i] < 4) {
				score.put("" + survey[i].charAt(0), score.get("" + survey[i].charAt(0)) + (4 - choices[i]));
			} else {
				continue;
			}
		}

		for (String[] tmp : li) {
			int tmp0 = score.get(tmp[0]);
			int tmp1 = score.get(tmp[1]);

			if (tmp0 == tmp1) {
				String[] tmp_so = tmp.clone();
				Arrays.sort(tmp_so);
				answer += tmp_so[0];
			} else if (tmp0 > tmp1) {
				answer += tmp[0];
			} else {
				answer += tmp[1];
			}

		}

		return answer;
	}

}
