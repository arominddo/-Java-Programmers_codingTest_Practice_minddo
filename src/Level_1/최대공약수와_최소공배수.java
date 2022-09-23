package Level_1;

import java.util.Arrays;

public class 최대공약수와_최소공배수 {

	public static void main(String[] args) {

		int n = 3;
		int m = 12;
		// 목표 return = [3,12]

		System.out.println(Arrays.toString(solution(n, m)));

	}

	static int[] solution(int n, int m) {
		int[] answer = new int[2];

		int min_num = Math.min(n, m);
		int max_num = Math.max(n, m);

		int tmp = 1;
		while (tmp > 0) {
			tmp = max_num % min_num;
			max_num = min_num;
			min_num = tmp;
		}

		answer[0] = max_num;
		answer[1] = (int) (n * m / max_num);

		return answer;
	}

}
