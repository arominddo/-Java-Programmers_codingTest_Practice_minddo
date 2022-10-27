package Level_2;

public class 다음_큰_숫자 {

	public static void main(String[] args) {
		int n = 78;

		// 목표 result
		int result = 83;

		// 확인

		System.out.println(solution(n));
		System.out.println(solution(n)==result);

	}

	public static int solution(int n) {
		int answer = 0;

		String one = Integer.toBinaryString(n);
		int sum_one = countChar(one, '1');

		while (true) {
			n++;
			String tmp = Integer.toBinaryString(n);
			int sum_tmp = countChar(tmp, '1');

			if (sum_one == sum_tmp) {
				answer = n;
				break;
			}
		}

		return answer;
	}

	public static int countChar(String str, char ch) {
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				cnt++;
			}
		}
		return cnt;
	}

}
