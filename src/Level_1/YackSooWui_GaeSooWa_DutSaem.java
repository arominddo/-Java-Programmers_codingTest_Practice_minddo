package Level_1;

public class YackSooWui_GaeSooWa_DutSaem {

	public static void main(String[] args) {

		// 입력
		int left = 13;
		int right = 17; // 목표 return = 43

		// 카운터 변수 생성
		int cnt;

		// 합계 변수 생성
		int sum = 0;

		// 약수의 개수 구하기
		for (int i = left; i <= right; i++) {
			cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt += 1;
				}
			}
			if (cnt % 2 == 0) {
				sum += i;
			} else {
				sum -= i;
			}

		}

		int answer = sum;

		System.out.println(answer);

	}

}
