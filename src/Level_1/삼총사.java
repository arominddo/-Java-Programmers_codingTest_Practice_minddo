package Level_1;

public class 삼총사 {

	public static void main(String[] args) {
		int[] number = { -2, 3, 0, 2, -5 };

		// 목표 result
		int result = 2;

		// 확인
		System.out.println(solution(number));
		System.out.println(solution(number) == result);

	}

	static int solution(int[] number) {
		int answer = 0;

		int len = number.length;

		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				for (int v = j + 1; v < len; v++) {
					if (number[i] + number[j] + number[v] == 0) {
						answer++;
					}
				}
			}
		}

		return answer;
	}

}
