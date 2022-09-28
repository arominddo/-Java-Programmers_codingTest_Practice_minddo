package Level_1;

import java.util.*;

public class 로또의_최고_순위와_최저_순위 {

	public static void main(String[] args) {

		int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };

		// 목표 result = [3, 5]

		System.out.println(Arrays.toString(solution(lottos, win_nums)));

	}

	static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];

		int cnt = 0;
		int zero = 0;

		for (int i : lottos) {
			if (i == 0) {
				zero++;
			} else {
				for (int j : win_nums) {
					if (i == j) {
						cnt++;
					}
				}
			}
		}

		HashMap<Integer, Integer> win_dic = new HashMap<>();

		for (int i = 2; i <= 7; i++) {
			win_dic.put(i, (5 - i + 2));
		}
		win_dic.put(1, 6);
		win_dic.put(0, 6);

		answer[0] = win_dic.get((cnt + zero));
		answer[1] = win_dic.get(cnt);

		return answer;
	}

}
