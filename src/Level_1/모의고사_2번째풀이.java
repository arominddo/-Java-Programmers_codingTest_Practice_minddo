package Level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사_2번째풀이 {

	public static void main(String[] args) {

		int[] answers = { 1, 3, 2, 4, 2 };
		// 목표 return = [1,2,3]

		System.out.println(Arrays.toString(solution(answers)));

	}

	static int[] solution(int[] answers) {

		int[][] student = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };

		int[] sc_li = new int[3];

		for (int i = 0; i < 3; i++) {
			sc_li[i] = check_ans(student[i], answers);
		}

		ArrayList<Integer> tmp = new ArrayList<>();

		tmp.add(1);
		int sc_max = 0;
		for (int i = 0; i < 3; i++) {
			if (sc_max == sc_li[i]) {
				tmp.add(i + 1);
			} else if (sc_max < sc_li[i]) {
				sc_max = sc_li[i];
				tmp.clear();
				tmp.add(i + 1);
			}
		}

		int[] answer = tmp.stream().mapToInt(i -> i).toArray();

		return answer;
	}

	static int check_ans(int[] li, int[] answers) {
		int cnt = 0;
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == li[i % li.length]) {
				cnt++;
			}
		}
		return cnt;
	}

}
