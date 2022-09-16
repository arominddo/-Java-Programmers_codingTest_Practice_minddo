package Level_1;

public class 콜라츠_추측 {

	public static void main(String[] args) {

		int num = 6;
		// 목표 result = 8

		int answer = 0;

		int cnt = 0;

		long n = (long) num;

		while (n != 1) {
			cnt += 1;

			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = n * 3 + 1;
			}

			if (cnt > 500) {
				cnt = -1;
				break;
//				return -1; // 코테 제출시 26~27 삭제, 28주석 해제
			}

		}
		answer = cnt;

		System.out.println(answer);

	}

}
