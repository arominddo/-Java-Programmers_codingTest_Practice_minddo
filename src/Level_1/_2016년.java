package Level_1;

public class _2016년 {

	public static void main(String[] args) {

		int a = 5;
		int b = 24;

		// 목표 result = "TUE"
		
		// 정답
		System.out.println(solution(a, b));

	}

	static String solution(int a, int b) {
		String answer = "";

		String week[] = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };

		if (a != 1) {
			int[] mon_cnt = { 30, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			int tmp = 0;

			for (int i = 0; i < a - 1; i++) {
				tmp += mon_cnt[i];
			}

			tmp += b;

			tmp %= 7;

			answer = week[tmp];

		}

		else {
			answer = week[(b - 1) % 7];
		}

		return answer;
	}

}
