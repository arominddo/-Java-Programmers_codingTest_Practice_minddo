package Level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {

	public static void main(String[] args) {

		int[] answers = { 1, 3, 2, 4, 2 };
		// 목표 return = [1,2,3]

		System.out.println(Arrays.toString(solution(answers)));

	}

	static int[] solution(int[] answers) {

		int[] num_1 = { 1, 2, 3, 4, 5 };
		int[] num_2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] num_3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int sc_1 = check_ans(num_1, answers);
		int sc_2 = check_ans(num_2, answers);
		int sc_3 = check_ans(num_3, answers);

		ArrayList<Integer> tmp = new ArrayList<>();
		tmp.add(1);
		int sc_max = sc_1;

		if (sc_max == sc_2) {
			tmp.add(2);
		} else if (sc_max < sc_2) {
			sc_max = sc_2;
			tmp.clear();
			tmp.add(2);
		}

		if (sc_max == sc_3) {
			tmp.add(3);
		} else if (sc_max < sc_3) {
			tmp.clear();
			tmp.add(3);
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
