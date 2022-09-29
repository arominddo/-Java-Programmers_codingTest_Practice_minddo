package Level_1;

import java.util.Arrays;

public class 체육복 {

	public static void main(String[] args) {

		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 1, 3, 5 };

		// 목표 result = 5

		System.out.println(solution(n, lost, reserve));

	}

	static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		int[] cl = new int[n];

		for (int i = 0; i < n; i++) {
			cl[i] = 1;
		}

		for (int i : lost) {
			cl[i - 1]--;
		}

		for (int i : reserve) {
			cl[i - 1]++;
		}

		for (int i = 0; i < cl.length; i++) {

			if (cl[i] == 2) {

				if ((i != 0) && (i != (cl.length - 1))) {
					if (cl[i - 1] == 0) {
						cl[i - 1]++;
						cl[i]--;
						continue;
					} else if (cl[i + 1] == 0) {
						cl[i + 1]++;
						cl[i]--;
						continue;
					}
				} else if (i == 0) {
					if (cl[i + 1] == 0) {
						cl[i + 1]++;
						cl[i]--;
						continue;
					}
				} else {
					if (cl[i - 1] == 0) {
						cl[i - 1]++;
						cl[i]--;
						continue;
					}
				}
				cl[i] = 1;

			}

		}

		answer = Arrays.stream(cl).sum();

		return answer;
	}

}
