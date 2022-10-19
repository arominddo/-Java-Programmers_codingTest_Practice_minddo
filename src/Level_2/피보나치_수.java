package Level_2;

public class 피보나치_수 {

	public static void main(String[] args) {
		int n = 5;

		// 목표 result
		int result = 5;

		// 확인
		System.out.println(solution(n));

	}

	static int solution(int n) {

		int answer = 0;

		int num1 = 0;
		int num2 = 0;
		int num = 0;

		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				num1 = 0;
				continue;
			} else if (i == 1) {
				num2 = 1;
				continue;
			} else {
				num = (num1 % 1234567 + num2 % 1234567) % 1234567;
			}
			num1 = num2;
			num2 = num;
		}

		answer = num % 1234567;

		return answer;
	}

}
