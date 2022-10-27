package Level_2;

public class 숫자의_표현 {

	public static void main(String[] args) {

		// 입력 값
		int n = 15;

		// 목표 result
		int result = 4;

		// 확인
		System.out.println(solution(n));
		System.out.println(solution(n) == result);

	}

	static int solution(int n) {
		int answer = 0;

		int t = 0;
		while (t != n) {
			int cnt = 0;
			int num = n;
			for (int i = 1 + t; i < n + 1; i++) {
				cnt += i;
				if (cnt == n) {
					answer += 1;
					break;
				} else if (cnt > n) {
					break;
				}
			}
			t++;
		}
		return answer;
	}

}
